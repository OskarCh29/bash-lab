public final class TaskBoard {
    public static void main(String[] args) {
        TaskFormatter formatter = new TaskFormatter();
        Task task = new Task(1, "Prepare deployment", "OPEN");
        System.out.println("Task #" + task.getId() + ": " + task.getTitle());
        System.out.println(formatter.formatStatus(task.getStatus()));
    }
}
