package Controller;

import Model.*;
import View.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class TaskController implements ActionListener {
    private TaskList taskList;
    private TaskUI taskUI;
    private TaskListUI taskListUI;
    private TaskTableModel taskTableModel;
    private boolean creatingNewTask;

    public TaskController() {
        taskList = new TaskList();
        taskTableModel = new TaskTableModel(taskList.getTaskList());

        taskListUI = new TaskListUI(this);
        taskListUI.initComponents();
        taskListUI.setVisible(true);
        addALButtons();
    }



    public void addALButtons() {
        taskListUI.newButton.addActionListener(this);
        taskListUI.exitButton.addActionListener(this);
        taskListUI.deleteButton.addActionListener(this);
    }

    public ArrayList<Task> getTaskList(){
        return taskList.getTaskList();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object obj = e.getSource();
        if(obj == taskListUI.exitButton){
            System.exit(0);
        }

        if (obj == taskListUI.newButton) {
            taskUI = new TaskUI(this);

            taskUI.backButton.addActionListener(this);
            taskUI.saveButton.addActionListener(this);
            taskUI.deleteButton.addActionListener(this);
            creatingNewTask = true;
            taskListUI.setVisible(false);
            taskUI.setVisible(true);
        }

        if(obj == taskListUI.deleteButton){

            int row = taskListUI.getSelectedRow();

            if(row >= 0){

                taskList.getTaskList().remove(row);

                taskTableModel.fireTableDataChanged();
            }
        }



        if(taskUI != null){

            if(obj == taskUI.backButton){
                taskUI.dispose();
                taskListUI.setVisible(true);
            }

            if(obj == taskUI.deleteButton){
                if (creatingNewTask) {
                    return;
                }

                int index = taskUI.getCurrentSelectedRow();

                taskList.getTaskList().remove(index);

                taskTableModel.fireTableDataChanged();

                taskUI.dispose();
                taskListUI.setVisible(true);
            }

            if(obj == taskUI.saveButton){

                if(creatingNewTask){

                    Task task = new Task();

                    task.setTitle(taskUI.getTaskTitle());
                    task.setSubtitle(taskUI.getTaskSubtitle());
                    task.setDueDate(taskUI.getTaskDueDate());
                    task.setPriority(taskUI.getTaskPriority());
                    task.setCategory(taskUI.getTaskCategory());

                    taskList.getTaskList().add(task);

                    creatingNewTask = false;

                } else {

                    int index = taskUI.getCurrentSelectedRow();

                    Task task = taskList.getTaskList().get(index);

                    task.setTitle(taskUI.getTaskTitle());
                    task.setSubtitle(taskUI.getTaskSubtitle());
                    task.setDueDate(taskUI.getTaskDueDate());
                    task.setPriority(taskUI.getTaskPriority());
                    task.setCategory(taskUI.getTaskCategory());
                }

                taskTableModel.fireTableDataChanged();

                taskUI.dispose();
                taskListUI.setVisible(true);
            }
        }
    }

    public TaskTableModel getTaskTableModel(){
        return taskTableModel;
    }

    public void getTaskDetailUI(int selectedRow){
        if (taskList.getTaskList().isEmpty()){
            return;
        }

        taskUI = new TaskUI(this,selectedRow);

        taskUI.backButton.addActionListener(this);
        taskUI.saveButton.addActionListener(this);
        taskUI.deleteButton.addActionListener(this);

        taskListUI.setVisible(false);
        taskUI.setVisible(true);
    }

    public Task getTask(int index){
        return taskList.getTaskList().get(index);
    }

}