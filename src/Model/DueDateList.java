package Model;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class DueDateList {
    private final LinkedList<TaskInDueDateList> tasks;

    public DueDateList(){
        tasks = new LinkedList<>();

        buildTestData();

        System.out.println("========= LinkedList items sorted by attribute: Due Date =====");

        printList();
    }

    public void printList(){
        for (TaskInDueDateList task : tasks){
            System.out.println(task);
        }

        System.out.println("\n========================\n");
    }

    private void buildTestData() {

        addItem(new TaskInDueDateList(
                "Math Homework",
                LocalDate.of(2026,11,15)));

        addItem(new TaskInDueDateList(
                "Laundry",
                LocalDate.of(2026,11,18)));

        addItem(new TaskInDueDateList(
                "Study Java",
                LocalDate.of(2026,11,25)));

        addItem(new TaskInDueDateList(
                "Project Report",
                LocalDate.of(2026,11,20)));

        addItem(new TaskInDueDateList(
                "Pay Bills",
                LocalDate.of(2026,11,17)));

        addItem(new TaskInDueDateList(
                "Clean Room",
                LocalDate.of(2026,11,22)));

        addItem(new TaskInDueDateList(
                "Gym",
                LocalDate.of(2026,11,16)));

        addItem(new TaskInDueDateList(
                "Buy Groceries",
                LocalDate.of(2026,11,19)));

        addItem(new TaskInDueDateList(
                "Call Mom",
                LocalDate.of(2026,11,23)));

        addItem(new TaskInDueDateList(
                "Schedule Meeting",
                LocalDate.of(2026,11,24)));
    }


    public void removeItem(String title){
        Iterator<TaskInDueDateList> iterator = tasks.iterator();

        while (iterator.hasNext()){
            TaskInDueDateList task = iterator.next();

            if(task.getTitle().equalsIgnoreCase(title)){
                iterator.remove();
                return;
            }
        }
    }

    public TaskInDueDateList getItem(String title){
        for(TaskInDueDateList task : tasks){
            if (task.getTitle().equalsIgnoreCase(title)){
                return task;
            }
        }
        return null;
    }

    public void addItem(Object newObject){
        TaskInDueDateList newTask = (TaskInDueDateList) newObject;
        ListIterator<TaskInDueDateList> iterator = tasks.listIterator();
        while(iterator.hasNext()){
            TaskInDueDateList currentTask = iterator.next();
            if(newTask.getDueDate().isBefore(currentTask.getDueDate())){
                iterator.previous();
                iterator.add(newTask);
                return;
            }
        }
        tasks.add(newTask);
    }


}
