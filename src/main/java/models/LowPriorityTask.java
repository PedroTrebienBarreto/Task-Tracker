package models;

import java.time.LocalDate;

public class LowPriorityTask extends Task{

    private LowPriorityTask(String task, LocalDate date, Recurrence recurrence) {
        super(task, date, recurrence);
    }

    private LowPriorityTask(){

    }

    public static LowPriorityTask brandNewTask(String task, LocalDate date, Recurrence recurrence){
        LowPriorityTask brandNewTask = new LowPriorityTask();
        brandNewTask.setTask(task);
        brandNewTask.setDate(date);
        brandNewTask.setRecurrence(recurrence);
        return brandNewTask;
    }
}
