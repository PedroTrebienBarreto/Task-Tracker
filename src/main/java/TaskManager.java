import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class TaskManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int option = 9;

        while (option != 7) {
            System.out.println("======= TASK TRACKER =======");
            System.out.println("1 - Add task");
            System.out.println("2 - Exclude task");
            System.out.println("3 - Mark task as done");
            System.out.println("4 - Show all pending tasks for the day");
            System.out.println("5 - Show all complete tasks so far");
            System.out.println("6 - Show all late tasks");
            System.out.println("7 - Exit");
            System.out.println("===================================");
            System.out.println();
            System.out.print("Enter your option: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Task: ");
                    String task = sc.nextLine();
                    System.out.println("Observation: ");
                    String observation = sc.nextLine();
                    System.out.println("Date(MM/DD/YYYY): ");
                    String date = sc.nextLine();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
                    LocalDate parsedDate = LocalDate.parse(date, formatter);
                    System.out.println("Priority options: ");
                    System.out.println("1 - MAXIMUM");
                    System.out.println("2 - REGULAR");
                    System.out.println("3 - MINIMUM");
                    int priorityLevel = sc.nextInt();
                    Priority priority;
                    switch (priorityLevel) {
                        case 1:
                            priority = Priority.MAXIMUM;
                            break;
                        case 2:
                            priority = Priority.REGULAR;
                            break;
                        case 3:
                            priority = Priority.MINIMUM;
                            break;
                    }
                    System.out.println("Recurrence options: ");
                    System.out.println("1 - UNIQUE");
                    System.out.println("2 - YEARLY");
                    System.out.println("3 - MONTHLY");
                    System.out.println("4 - WEEKLY");
                    System.out.println("5 - DAILY");
                    Integer recurrenceLevel = sc.nextInt();
                    Recurrence recurrence;
                    switch (priorityLevel) {
                        case 1:
                            recurrence = Recurrence.UNIQUE;
                            break;
                        case 2:
                            recurrence = Recurrence.YEARLY;
                            break;
                        case 3:
                            recurrence = Recurrence.MONTHLY;
                            break;
                        case 4:
                            recurrence = Recurrence.WEEKLY;
                        case 5:
                            recurrence = Recurrence.DAILY;
                    }
                    break;
                case 7:
                    break;
            }
        }
    }}
