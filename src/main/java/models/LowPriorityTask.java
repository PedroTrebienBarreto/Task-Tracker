package models;

import java.time.LocalDate;

public class LowPriorityTask extends Task{

    protected LowPriorityTask(String task, LocalDate date, Recurrence recurrence) {
        super(task, date, recurrence);
    }
}
