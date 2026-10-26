package pl.devlab.profile;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import pl.devlab.config.ResponseDistributionConfiguration;

import reactor.core.publisher.Mono;
import java.util.Locale;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class ResponseDistributionProfileService {

    private final ResponseDistributionConfiguration config;

    public Mono<ResponseDistributionResponse> getActiveDistribution() {
        return Mono.fromCallable(() -> {
            ResponseDistributionProfile activeProfile = getActiveProfile();

            Map<Integer, Integer> distribution = getResponseDistributionByProfile(activeProfile);

            return new ResponseDistributionResponse(activeProfile, distribution);
        });
    }

    public Mono<ResponseDistributionResponse> getDistributionDetails(String profileName) {
        return Mono.fromCallable(() -> {
            ResponseDistributionProfile profile = ResponseDistributionProfile.valueOf(
                    profileName.toUpperCase(Locale.ROOT));
            Map<Integer, Integer> distribution = getResponseDistributionByProfile(profile);

            return new ResponseDistributionResponse(profile,
                    profile == getActiveProfile(),
                    distribution);
        }).onErrorMap(IllegalArgumentException.class,
                error -> new ResponseStatusException(HttpStatus.BAD_REQUEST,
                        "Unknown profile: " + profileName, error));
    }

    public Map<Integer, Integer> getResponseDistributionByProfile(ResponseDistributionProfile profile) {
        var profileConfiguration = config.profiles().get(profile.name().toLowerCase(Locale.ROOT));

        if (profileConfiguration == null) {
            throw new IllegalArgumentException(
                    "Profile is not configured: " + profile
            );
        }
        return profileConfiguration.distribution();
    }

    private ResponseDistributionProfile getActiveProfile() {
        return ResponseDistributionProfile.valueOf(config.activeProfile().toUpperCase(Locale.ROOT));
    }

}
