package Runner;

import controller.TaskManager;
import models.Recurrence;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args){

        TaskManager manager = new TaskManager();

        manager.createTask("Finish coding the project", LocalDate.of(2026, 10, 7), Recurrence.UNIQUE);



        manager.showAllTasks();



    }
}
