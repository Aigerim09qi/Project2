import java.util.*;

public class TaskScheduler {
    static ArrayDeque<String> tasks = new ArrayDeque<>();

    public static void addTask(String task, boolean highPriority) {
        if (highPriority) {
            tasks.addFirst(task);
        } else {
            tasks.addLast(task);
        }
    }

    public static void processTask() {
        System.out.println("Processing: " + tasks.pollFirst());
    }

    public static void main(String[] args) {
        addTask("Email", false);
        addTask("Fix bug", true);
        addTask("Meeting", false);

        while (!tasks.isEmpty()) {
            processTask();
        }
    }
}

