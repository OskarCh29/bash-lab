public final class TaskFormatter {
    public String formatStatus(String status) {
        // Variant A for the first branch:
        // return "[TASK] " + status;
        // Variant B for the second branch:
        // return "[CURRENT] " + status;
        return "Status: " + status;
    }
}
