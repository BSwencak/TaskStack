package Model;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class TaskTableModel extends AbstractTableModel {
    private String[] columnNames = {"Title", "Subtitle", "Due Date", "Priority", "Category"};
    private ArrayList<Task> taskList;
    public TaskTableModel(ArrayList<Task> newTaskList) {
        taskList = newTaskList;
    }
    @Override
    public int getRowCount() {
        return taskList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col){
        switch(col){
            case 0: return (Object) taskList.get(row).getTitle();
            case 1: return (Object) taskList.get(row).getSubtitle();
            case 2: return (Object) taskList.get(row).getDueDate();
            case 3: return (Object) taskList.get(row).getPriority();
            case 4: return (Object) taskList.get(row).getCategory();
            default: return null;
        }
    }
}
