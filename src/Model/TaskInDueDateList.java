package Model;

import java.time.LocalDate;

public class TaskInDueDateList {
    private String title;
    private LocalDate dueDate;

    public TaskInDueDateList(String title, LocalDate dueDate){
        this.title = title;
        this.dueDate = dueDate;
    }

    public String getTitle(){
        return title;
    }

    public LocalDate getDueDate(){
        return dueDate;
    }

    @Override
    public String toString(){
        return title + " | Due: " + dueDate;
    }
}
