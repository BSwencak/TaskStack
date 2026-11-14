import Model.DueDateList;
import Model.TaskInDueDateList;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        DueDateList dueList = new DueDateList();

        System.out.println("Adding Item: Doctors Appointment");

        dueList.addItem(
                new TaskInDueDateList(
                        "Doctors Appointment",
                        LocalDate.of(2026,11,21)
                )
        );

        dueList.printList();

        System.out.println("Removing Item: Buy Groceries");

        dueList.removeItem("Buy Groceries");

        dueList.printList();

        System.out.println("Getting Item: Study Java");

        System.out.println(
                dueList.getItem("Study Java")
        );

        System.out.println("\n=====================\n");
    }
}

