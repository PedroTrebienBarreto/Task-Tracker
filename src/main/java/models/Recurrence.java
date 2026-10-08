package models;

public enum Recurrence {
    UNIQUE(1), YEARLY(2), MONTHLY(3), WEEKLY(4), DAILY(5);

    private int recurrenceLevel;

    Recurrence(int recurrenceLevel){
        this.recurrenceLevel = recurrenceLevel;
    }
}
