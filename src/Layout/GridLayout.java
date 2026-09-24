package Layout;

public class GridLayout extends Layout {

    //Attributes
    private int numOfColumns;
    private int numOfRows;

    //Constructor
    public GridLayout(String modeTitle, String modeType, int numOfColumns, int numOfRows){
        super(modeTitle, modeType);
        this.numOfColumns = numOfColumns;
        this.numOfRows = numOfRows;
    }

    //Getters
    public int getNumOfColumns(){return numOfColumns;}
    public int getNumOfRows(){return numOfRows;}

    //Setters
    public void setNumOfColumns(int numOfColumns){this.numOfColumns = numOfColumns;}
    public void setNumOfRows(int numOfRows){this.numOfRows = numOfRows;}


    @Override
    public void display(){System.out.println("Grid");}

    @Override
    public String toString(){
        return "GridLayout: " +super.toString()+" " + " , Columns: '"+numOfColumns+"' , Rows: '"+numOfRows+"'}";
    }

}
