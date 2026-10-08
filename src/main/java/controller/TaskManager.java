package controller;

import models.Recurrence;
import models.Task;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskManager {

        private List<Task> tasksToDo = new ArrayList<>();



        public void createTask(String task, LocalDate date, Recurrence recurrence){
            Task newTask = Task.brandNewTask(task, date, recurrence);
            tasksToDo.add(newTask);

        }

        public void showAllTasks(){
            for (Task task : tasksToDo){
                System.out.println("Task: "+ task.getTask());
                System.out.println("Date: "+ task.getDate());
                System.out.println("Recurrence Level: "+ task.getRecurrence());
            }
        }






}