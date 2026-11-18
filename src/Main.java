import Model.DueDateList;
import Model.TaskInDueDateList;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        DueDateList dueList = new DueDateList();


        System.out.println("Adding Item: Doctors Appointment\n");
        dueList.addItem(
                new TaskInDueDateList(
                        "Doctors Appointment",
                        LocalDate.of(2026,12,8)
                )
        );

        dueList.printList();

        System.out.println("Removing Item: Project\n");
        dueList.removeItem("Project");

        dueList.printList();

        System.out.println("Getting Item: Java Assignment\n");
        System.out.println(
                dueList.getItem("Java Assignment")
        );

        System.out.println("\n=====================\n");

        dueList.printList();
    }
}

