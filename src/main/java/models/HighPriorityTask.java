package models;

import java.time.LocalDate;

public class HighPriorityTask extends Task{

    protected HighPriorityTask(String task, LocalDate date, Recurrence recurrence) {
        super(task, date, recurrence);
    }

    private HighPriorityTask(){
        super();

    }

    public static HighPriorityTask brandNewTask(String task, LocalDate date, Recurrence recurrence){
        HighPriorityTask brandNewTask = new HighPriorityTask();
        brandNewTask.setTask(task);
        brandNewTask.setDate(date);
        brandNewTask.setRecurrence(recurrence);
        return brandNewTask;
    }

}
