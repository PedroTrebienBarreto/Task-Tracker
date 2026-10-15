package runner;

import controller.TaskManager;
import models.Recurrence;
import models.Task;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        TaskManager manager = new TaskManager();

        Scanner sc = new Scanner(System.in);

        manager.createTask("Finish coding the project", LocalDate.of(2026, 10, 7), Recurrence.UNIQUE, 1);
        manager.createTask("Do the dishes", LocalDate.of(2026, 10, 7), Recurrence.DAILY, 1);
        manager.createTask("Go fishing", LocalDate.of(2026, 10, 7), Recurrence.MONTHLY, 3);
        manager.createTask("Take my car to the mechanic", LocalDate.of(2026, 10, 10), Recurrence.UNIQUE, 2);
        manager.createTask("Drink 2 liters of water", LocalDate.of(2026, 10, 8), Recurrence.UNIQUE, 3);

        //manager.deleteTask();

        manager.numberTasks(manager.getTasks());


        System.out.println("==================== FINISHING THE PROGRAM =========================");
        //manager.showAllTasks();



        sc.close();
    }
}
