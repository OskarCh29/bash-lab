package pl.devlab.traffic;

public record TrafficStatusResponse(TrafficStatus status, TrafficState state, int requestsPerSecond) {}
