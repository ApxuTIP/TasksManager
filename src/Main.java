import java.util.Date;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        Task taskone = new Task("Первая зачада", "Нужно сделать ...");
        Deadline deadlineone = new Deadline("Вторая задача", "Нужно сделать ...", new Date());
        RecurringTask recurringtaskone = new RecurringTask("Третья задача", "Нужно сделать ...", "Каждый день", new Date());

        taskManager.addTask(taskone);
        taskManager.addTask(deadlineone);
        taskManager.addTask(recurringtaskone);

        System.out.println("Список задач");
        taskManager.viewTasks();

        System.out.println("Удаление задача");
        taskManager.removeTask(recurringtaskone);

        System.out.println("Список задач после удаления одной из задач");
        taskManager.viewTasks();
    }
}