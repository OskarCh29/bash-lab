package pl.devlab.profile;

import java.util.Map;

public record ResponseDistributionResponse(
        ResponseDistributionProfile profile,
        boolean active,
        Map<Integer, Integer> distribution
) {

    public ResponseDistributionResponse(ResponseDistributionProfile profile, Map<Integer, Integer> distribution) {
        this(profile, true, distribution);
    }
}
