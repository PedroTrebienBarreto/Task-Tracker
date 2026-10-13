package runner;

import controller.TaskManager;
import models.Recurrence;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args){

        TaskManager manager = new TaskManager();

        manager.createTask("Finish coding the project", LocalDate.of(2026, 10, 7), Recurrence.UNIQUE);
        manager.createTask("Do the dishes", LocalDate.of(2026, 10, 7), Recurrence.DAILY);
        manager.createTask("Go fishing", LocalDate.of(2026, 10, 7), Recurrence.MONTHLY);
        manager.createTask("Take my car to the mechanic", LocalDate.of(2026, 10, 10), Recurrence.UNIQUE);
        manager.createTask("Drink 2 liters of water", LocalDate.of(2026, 10, 8), Recurrence.UNIQUE);

        manager.deleteTask();




        System.out.println("==================== FINISHING THE PROGRAM =========================");
        manager.showAllTasks();



    }
}
