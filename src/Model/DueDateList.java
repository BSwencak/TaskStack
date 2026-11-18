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

        System.out.println("========= LinkedList items sorted by attribute: Due Date =========");

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
                LocalDate.of(2026,12,15)));

        addItem(new TaskInDueDateList(
                "Laundry",
                LocalDate.of(2026,11,28)));

        addItem(new TaskInDueDateList(
                "Study for Test",
                LocalDate.of(2026,12,11)));

        addItem(new TaskInDueDateList(
                "Project",
                LocalDate.of(2026,12,2)));

        addItem(new TaskInDueDateList(
                "Update Resume",
                LocalDate.of(2026,12,6)));

        addItem(new TaskInDueDateList(
                "Apply to Jobs",
                LocalDate.of(2027,1,11)));

        addItem(new TaskInDueDateList(
                "Java Assignment",
                LocalDate.of(2026,11,25)));

        addItem(new TaskInDueDateList(
                "English Homework",
                LocalDate.of(2026,11,26)));

        addItem(new TaskInDueDateList(
                "Hangout with Friends",
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
