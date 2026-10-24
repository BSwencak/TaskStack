package Model;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class TaskTableModel extends AbstractTableModel {
    private String[] columnNames = {"title", "subtitle", "description", "dueDate", "priority", "category", "notes"};
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
        return 0;
    }

    public Object getValueAt(int row, int col){
        switch(col){
            case 0: return (Object) taskList.get(row).getTitle();
            case 1: return (Object) taskList.get(row).getSubtitle();
            case 2: return (Object) taskList.get(row).getDescription();
            case 3: return (Object) taskList.get(row).getDueDate();
            case 4: return (Object) taskList.get(row).getPriority();
            case 5: return (Object) taskList.get(row).getCategory();
            case 6: return (Object) taskList.get(row).getNotes();
            default: return null;
        }
    }
}
