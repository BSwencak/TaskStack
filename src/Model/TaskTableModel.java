package Model;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class TaskTableModel extends AbstractTableModel {
    private String[] columnNames = { "TaskID", "TaskName" };
    private ArrayList<Task> taskList;
    public TaskTableModel(ArrayList<Task> newTaskList) {
        taskList = newTaskList;
    }
    @Override
    public int getRowCount() {
        return taskList.size();
    }

    public Object getValueAt(int row, int col){
        switch(col){
            case 0: return (Object) taskList.get(row).getTitle();
            case 1: return (Object) taskList.get(row).getSubTitle();
            case 2: return (Object) taskList.get(row).getBlank();
            default: return null;
        }
    }
}
