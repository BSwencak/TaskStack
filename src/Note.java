public class Note {

    //Attributes
    private String title;
    private String dateCreated;
    private String dateLastEdited;
    private String attachedTask;
    private String category;

    //Constructor
    public Note(String title, String dateCreated, String dateLastEdited, String attachedTask, String category) {
        this.title = title;
        this.dateCreated = dateCreated;
        this.dateLastEdited = dateLastEdited;
        this.attachedTask = attachedTask;
        this.category = category;
    }

    public Note() {
        this.title = "title";
        this.dateCreated = "dateCreated";
        this.dateLastEdited = "dateLastEdited";
        this.attachedTask = "attachedTask";
        this.category = "category";
    }

    //Getters
    public String getTitle() {return title;}
    public String getDateCreated() {return dateCreated;}
    public String getDateLastEdited() {return dateLastEdited;}
    public String getAttachedTask() {return attachedTask;}
    public String getCategory() {return category;}

    //Setters
    public void setTitle(String title) {this.title = title;}
    public void setDateCreated(String dateCreated) {this.dateCreated = dateCreated;}
    public void setDateLastEdited(String dateLastEdited) {this.dateLastEdited = dateLastEdited;}
    public void setAttachedTask(String attachedTask) {this.attachedTask = attachedTask;}
    public void setCategory(String category) {this.category = category;}

    //To String
    @Override
    public String toString() {
        return "Note {Title: '" + title + "' , Date Created: '" + dateCreated + "' , Date Last Edited: '" + dateLastEdited + "' , Attached Task: '" + attachedTask + "' , Category: '" + category + "'}";
    }
}
