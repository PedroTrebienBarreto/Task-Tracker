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



        public void createTask(String task, LocalDate date, Recurrence recurrence){
            Scanner sc = new Scanner(System.in);
            System.out.println("Inform the task's priority level first:");
            System.out.println("1 - High Priority");
            System.out.println("2 - Medium Priority");
            System.out.println("3 - Low Priority");
            System.out.print("Option: ");
            int option = sc.nextInt();
            Task newTask = switch (option) {
                case 1 -> HighPriorityTask.brandNewTask(task, date, recurrence);
                case 2 -> MediumPriorityTask.brandNewTask(task, date, recurrence);
                case 3 -> LowPriorityTask.brandNewTask(task, date, recurrence);
                default -> throw new InvalidPriorityLevelException("The priority level ranges from 1 to 3 only");
            };
            tasksToDo.add(newTask);
            sc.nextLine();
            sc.close();
        }

        public void deleteTask(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the task's date: ");
            String saidDate = sc.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate saidLocalDate = LocalDate.parse(saidDate, formatter);
            // TREAT HOW THE STRING IS PARSED!

            List<Task>tasksOnSaidDate = new ArrayList<>();
            int i = 1;
            System.out.println("All tasks from said date: ");
            for (Task task : tasksToDo){
                if (task.getDate().equals(saidLocalDate)){
                    System.out.println(i+" - "+task.getTask());
                    tasksOnSaidDate.add(task);
                    i+=1;
                }
            }
            System.out.println();
            System.out.println("Enter the task's number to delete it: ");
            int toBeDeleted = sc.nextInt();
            tasksToDo.remove(tasksOnSaidDate.get(toBeDeleted-1));
            tasksOnSaidDate.clear();
            sc.close();
        }


        public void showAllTasks(){
            for (Task task : tasksToDo){
                System.out.println("Task: "+ task.getTask());
                System.out.println("Date: "+ task.getDate());
                System.out.println("Recurrence Level: "+ task.getRecurrence());
            }
        }






}