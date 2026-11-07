package Model;

import java.io.Serializable;

public class Task implements Serializable {

    //Attributes
    private String title;
    private String subtitle;
    private String description;
    private String dueDate;
    private String priority;
    private String category;
    private String notes;
    private String banner;
    private boolean completed;

    //Constructors
    public Task(String title, String subtitle, String description, String dueDate, String priority, String category, String notes, Boolean completed) {
        this.title = title;
        this.subtitle = subtitle;
        this.description = description;
        this.dueDate = dueDate;
        this.priority = priority;
        this.category = category;
        this.notes = notes;
        this.completed = false;
    }
    public Task() {
        this("title", "subtitle", "description", "dueDate", "priority", "category", "notes", false);
        this.title = "title";
        this.subtitle = "subtitle";
        this.description = "description";
        this.dueDate = "dueDate";
        this.priority = "priority";
        this.category = "category";
        this.notes = "notes";
        this.completed = false;
    }

    //Getters
    public String getTitle() {return title;}
    public String getSubtitle() {return subtitle;}
    public String getDescription() {return description;}
    public String getDueDate() {return dueDate;}
    public String getPriority() {return priority;}
    public String getCategory() {return category;}
    public String getNotes() {return notes;}
    public boolean isCompleted() {return completed;}

    //Setters
    public void setTitle(String title) {this.title = title;}
    public void setSubtitle(String subtitle) {this.subtitle = subtitle;}
    public void setDescription(String description) {this.description = description;}
    public void setDueDate(String dueDate) {this.dueDate = dueDate;}
    public void setPriority(String priority) {this.priority = priority;}
    public void setCategory(String category) {this.category = category;}
    public void setNotes(String notes) {this.notes = notes;}
    public void setCompleted(Boolean completed) {this.completed = completed;}

    //To String
    @Override
    public String toString() {
        return "Model.Task {Title: '" + title + "' , Subtitle: '" + subtitle + "' , Description: '" + description +
                "' , Due Date: '" + dueDate + "' , Priority: '" + priority + "' , Model.Category: '" + category + "' , Notes: '" + notes + "'}";

    }

    public void printSetup(){
        banner = "------------------------------------------------- Model.Task -------------------------------------------------";
    }

    public void print(){
        System.out.println(banner);
        System.out.println(this.toString());
    }

}
