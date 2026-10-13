package models;

import java.time.LocalDate;

public class MediumPriorityTask extends Task{

    private MediumPriorityTask(String task, LocalDate date, Recurrence recurrence) {
        super(task, date, recurrence);
    }

    private MediumPriorityTask(){

    }

    public static MediumPriorityTask brandNewTask(String task, LocalDate date, Recurrence recurrence){
        MediumPriorityTask brandNewTask = new MediumPriorityTask();
        brandNewTask.setTask(task);
        brandNewTask.setDate(date);
        brandNewTask.setRecurrence(recurrence);
        return brandNewTask;
    }

}
