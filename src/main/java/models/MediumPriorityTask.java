package models;

import java.time.LocalDate;

public class MediumPriorityTask extends Task{

    protected MediumPriorityTask(String task, LocalDate date, Recurrence recurrence) {
        super(task, date, recurrence);
    }
}
