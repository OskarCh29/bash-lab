package pl.devlab.profile;

import java.util.Map;

public record ResponseDistributionResponse(String profile, boolean active, Map<Integer, Integer> distribution) {}
