public class Calendar implements Printable {

    //Attributes
    private String currentDay;
    private String currentMonth;
    private String currentYear;
    private String viewMode;
    private String category;
    private String banner;

    //Constructors
    public Calendar(String currentDay, String currentMonth, String currentYear, String viewMode, String category) {
        this.currentDay = currentDay;
        this.currentMonth = currentMonth;
        this.currentYear = currentYear;
        this.viewMode = viewMode;
        this.category = category;
    }

    public Calendar() {
        this.currentDay = "currentDay";
        this.currentMonth = "currentMonth";
        this.currentYear = "currentYear";
        this.viewMode = "viewMode";
        this.category = "category";
    }

    //Getters
    public String getCurrentDay() {return currentDay;}
    public String getCurrentMonth() {return currentMonth;}
    public String getCurrentYear() {return currentYear;}
    public String getViewMode() {return viewMode;}
    public String getCategory() {return category;}

    //Setters
    public void setCurrentDay(String currentDay) {this.currentDay = currentDay;}
    public void setCurrentMonth(String currentMonth) {this.currentMonth = currentMonth;}
    public void setCurrentYear(String currentYear) {this.currentYear = currentYear;}
    public void setViewMode(String viewMode) {this.viewMode = viewMode;}
    public void setCategory(String category) {this.category = category;}

    //To String
    @Override
    public String toString() {
        return "Calendar {Current Day : '" + currentDay + "' , Current Month: '" + currentMonth + "' , Current Year: " + currentYear + "' , View Mode: '" + viewMode + "' , Category: '" + category + "'}";

    }

    public void printSetup(){
        banner = "------------------------------------------------ Calendar ------------------------------------------------";
    }

    public void print(){
        System.out.println(banner);
        System.out.println(this.toString());
    }

}
