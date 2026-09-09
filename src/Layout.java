public class Layout {

    //Attributes
    private String modeTitle;
    private String modeType;

    //Constructor
    public Layout(String modeTitle, String modeType) {
        this.modeTitle = modeTitle;
        this.modeType = modeType;
    }

    //Getters
    public String getModeTitle() {return modeTitle;}
    public String getModeType() {return modeType;}

    //Setters
    public void setModeTitle(String modeTitle) {this.modeTitle = modeTitle;}
    public void setModeType(String modeType) {this.modeType = modeType;}

    //To String
    @Override
    public String toString() {
        return "Layout {Mode Title: '" + modeTitle + "' , Mode Type: '" + modeType + "'}";
    }
}
