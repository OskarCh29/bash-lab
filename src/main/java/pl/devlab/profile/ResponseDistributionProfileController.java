package pl.devlab.profile;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/profiles")
public class ResponseDistributionProfileController {

    private final ResponseDistributionProfileService profileService;

    @GetMapping("/{profile}/distribution")
    public Mono<ResponseDistributionResponse> getDistribution(@PathVariable String profile) {
        return profileService.getDistributionDetails(profile);
    }

    @GetMapping("/active")
    public Mono<ResponseDistributionResponse> getActiveDistribution() {
        return profileService.getActiveDistribution();
    }
}
