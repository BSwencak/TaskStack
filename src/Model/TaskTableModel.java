package Model;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class TaskTableModel extends AbstractTableModel {
    private String[] columnNames = {"Title", "Subtitle", "Due Date", "Priority", "Category","Completion"};
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

    @Override
    public Class<?> getColumnClass(int col) {
        if (col == 5) {
            return Boolean.class;
        }
        return String.class;
    }

    @Override
    public boolean isCellEditable(int row, int col) {
        return col == 5;
    }

    @Override
    public void setValueAt(Object value, int row, int col) {
        if (col == 5) {
            taskList.get(row).setCompleted((Boolean)value);
        }

        fireTableCellUpdated(row, col);
    }

    public Object getValueAt(int row, int col){
        switch(col){
            case 0: return (Object) taskList.get(row).getTitle();
            case 1: return (Object) taskList.get(row).getSubtitle();
            case 2: return (Object) taskList.get(row).getDueDate();
            case 3: return (Object) taskList.get(row).getPriority();
            case 4: return (Object) taskList.get(row).getCategory();
            case 5: return (Object) taskList.get(row).isCompleted();
            default: return null;
        }
    }
}
