package controller;

import exceptions.InvalidPriorityLevelException;
import models.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskManager {

        private List<Task> tasksToDo = new ArrayList<>();



        public void createTask(String task, LocalDate date, Recurrence recurrence, int option){
            Task newTask = switch (option) {
                case 1 -> HighPriorityTask.brandNewTask(task, date, recurrence);
                case 2 -> MediumPriorityTask.brandNewTask(task, date, recurrence);
                case 3 -> LowPriorityTask.brandNewTask(task, date, recurrence);
                default -> throw new InvalidPriorityLevelException("The priority level ranges from 1 to 3 only");
            };
            tasksToDo.add(newTask);
        }

        public List<Task> searchAllTasksOnSaidDate(LocalDate date){
            List<Task>searchResult = new ArrayList<>();
            for (Task task : tasksToDo){
                if(task.getDate().equals(date)){
                    searchResult.add(task);
                }
            }
            return searchResult;
        }

        public void numberTasks(List<Task>taskList){
            System.out.println("Entered the numbering function");
            for (int i=1; i<=taskList.size();i++){
                System.out.println(i +" - "+tasksToDo.get(i-1).getTask());
            }
            System.out.println("Finished the function");
        }


        public void deleteTask(){

        }


        public void showAllTasks(){
            for (Task task : tasksToDo){
                System.out.println("Task: "+ task.getTask());
                System.out.println("Date: "+ task.getDate());
                System.out.println("Recurrence Level: "+ task.getRecurrence());
            }
        }

        public List<Task> getTasks(){
            return this.tasksToDo;
        }






}