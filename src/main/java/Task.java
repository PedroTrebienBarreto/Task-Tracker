import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Task {

    private String task;
    private String observation;
    private LocalDate date;
    private Priority priority;
    private Recurrence recurrence;

    private List<Task> toDoTasks = new ArrayList<>();
    private List<Task> lateTasks = new ArrayList<>();
    private List<Task> completedTasks = new ArrayList<>();

    public Task() {

    }

    public Task(String task, String observation, LocalDate date, Priority priority, Recurrence recurrence) {
        this.task = task;
        this.observation = observation;
        this.date = date;
        this.priority = priority;
        this.recurrence = recurrence;
    }

    public Task TaskNoObservation(String task, LocalDate date, Priority priority, Recurrence recurrence) {
        Task newTask = new Task();
        newTask.setTask(task);
        newTask.setDate(date);
        newTask.setPriority(priority);
        newTask.setRecurrence(recurrence);
        return newTask;

    }

    public void addTask(String task, String observation, LocalDate date, Priority priority, Recurrence recurrence){
        Task newTask;
        if(observation.isEmpty()) {
            newTask = TaskNoObservation(task, date, priority, recurrence);
        }
        else {
            newTask = new Task(task, observation, date, priority, recurrence);
        }
        toDoTasks.add(newTask);
    }

    public void excludeTask(Integer taskNumber, LocalDate date){
        List<Task>tasksOnSaidDate = new ArrayList<>();
        for (Task task : toDoTasks){
            if (task.getDate().equals(date)){
                tasksOnSaidDate.add(task);
            }
        }
        Task taskToBeDeleted = tasksOnSaidDate.get(taskNumber);
        for (Task task : toDoTasks){
            if (taskToBeDeleted.equals(task)){
                toDoTasks.remove(task);
                tasksOnSaidDate.remove(task);
            }
        }
    }

    public void showAllTasks(){
        for (Task task : toDoTasks){
            System.out.println(task.getTask());
        }
    }


    private void setTask(String task) {
        this.task = task;
    }

    private void setObservation(String observation) {
        this.observation = observation;
    }

    private void setDate(LocalDate date) {
        this.date = date;
    }

    private void setPriority(Priority priority) {
        this.priority = priority;
    }

    private void setRecurrence(Recurrence recurrence) {
        this.recurrence = recurrence;
    }

    private LocalDate getDate(){
        return this.date;
    }

    private String getTask(){
        return this.task;
    }
}
