public class Category {

    //Attributes
    private String title;
    private String subtitle;
    private String color;

    //Constructor
    public Category(String title, String subtitle, String color) {
        this.title = title;
        this.subtitle = subtitle;
        this.color = color;
    }

    public Category() {
        this.title = "title";
        this.subtitle = "subtitle";
        this.color = "color";
    }

    //Getters
    public String getTitle() {return title;}
    public String getSubtitle() {return subtitle;}
    public String getColor() {return color;}

    //Setters
    public void setTitle(String title) {this.title = title;}
    public void setSubtitle(String subtitle) {this.subtitle = subtitle;}
    public void setColor(String color) {this.color = color;}

    //To String
    @Override
    public String toString() {
        return "Category {Title: '" + title + "' , Subtitle: '" + subtitle + "' , Color: '" + color + "'}";
    }
}
