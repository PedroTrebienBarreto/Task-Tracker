package models;

import java.time.LocalDate;

public class Task {

    private String task;
    private LocalDate date;
    private Recurrence recurrence;

    protected Task() {
    }

    protected Task(String task, LocalDate date, Recurrence recurrence) {
        this.task = task;
        this.date = date;
        this.recurrence = recurrence;
    }

    public static Task brandNewTask(String task, LocalDate date, Recurrence recurrence) {
        Task brandNewTask = new Task();
        brandNewTask.setTask(task);
        brandNewTask.setDate(date);
        brandNewTask.setRecurrence(recurrence);
        return brandNewTask;
    }


    void setTask(String task) {
        this.task = task;
    }

    void setDate(LocalDate date) {
        this.date = date;
    }

    void setRecurrence(Recurrence recurrence) {
        this.recurrence = recurrence;
    }

    public String getTask() {
        return task;
    }

    public LocalDate getDate() {
        return date;
    }

    public Recurrence getRecurrence() {
        return recurrence;
    }
}
