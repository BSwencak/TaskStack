package Layout;

public class ListLayout extends Layout {
    //Attribute
    private String orientation;

    //Constructor
    public ListLayout(String modeTitle, String modeLayout, String orientation){
        super(modeTitle,modeLayout);
        this.orientation = orientation;
    }

    //Getter
    public String getOrientation(){return orientation;}

    //Setter
    public void setOrientation(String orientation){this.orientation = orientation;}

    @Override
    public void display(){
        System.out.println("List");
    }

    @Override
    public String toString(){
        return "ListLayout: " +super.toString()+" , Orientation: '"+orientation+"'}";
    }

}
