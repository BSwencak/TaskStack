package Controller;

import Model.*;
import View.*;

import java.util.ArrayList;

public class TaskController {

    private TaskList taskList;
    private TaskListUI taskListUI;
    private TaskUI taskUI;
    private TaskTableModel taskTableModel;

    public TaskController() {

        taskList = new TaskList();
        taskTableModel = new TaskTableModel(taskList.getTaskList());

        taskListUI = new TaskListUI(this);
        taskListUI.initComponents();
        taskListUI.setVisible(true);
    }

    public TaskTableModel getTaskTableModel() {
        return taskTableModel;
    }

    public ArrayList<Task> getTaskList() {
        return taskList.getTaskList();
    }

    public Task getTask(int index) {
        return taskList.getTaskList().get(index);
    }

    // Open an existing task
    public void getTaskDetailUI(int selectedRow) {

        taskUI = new TaskUI(this, selectedRow);

        taskListUI.setVisible(false);
        taskUI.setVisible(true);
    }

    // Open a blank task form
    public void getNewTaskUI() {

        taskUI = new TaskUI(this);

        taskListUI.setVisible(false);
        taskUI.setVisible(true);
    }

    // Save changes to an existing task
    public void updateTask(int index,
                           String title,
                           String subtitle,
                           String description,
                           String dueDate,
                           String priority,
                           String notes) {

        Task task = taskList.getTaskList().get(index);

        task.setTitle(title);
        task.setSubtitle(subtitle);
        task.setDescription(description);
        task.setDueDate(dueDate);
        task.setPriority(priority);
        task.setNotes(notes);

        taskTableModel.fireTableDataChanged();
    }

    // Add a new task
    public void addTask(Task task) {

        taskList.getTaskList().add(task);

        taskTableModel.fireTableDataChanged();
    }

    // Delete a task
    public void deleteTask(int index) {

        if(taskList.getTaskList().size() > 0) {

            taskList.getTaskList().remove(index);

            taskTableModel.fireTableDataChanged();
        }
    }

    // Return to list view
    public void returnToList() {

        if(taskUI != null) {
            taskUI.dispose();
        }

        taskListUI.setVisible(true);
    }

    // Exit program
    public void exitApplication() {
        System.exit(0);
    }
}