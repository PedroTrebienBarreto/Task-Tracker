package models;

public enum Priority {

    MAXIMUM(1), REGULAR(2), MINIMUM(3);

    private int priorityLevel;

    Priority(int priorityLevel) {
        this.priorityLevel = priorityLevel;
    }
}
