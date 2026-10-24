package Controller;

import Model.*;
import View.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class TaskController implements ActionListener {
    private Task task;
    private TaskList taskList;
    private TaskUI taskUI;
    private TaskListUI taskListUI;
    private TaskTableModel taskTableModel;
    private int currentTaskNum;

    public TaskController() {
        taskList = new TaskList();
        taskListUI = new TaskListUI(this);
        taskUI = new TaskUI(this);
        addALButtons();
        taskUI.setVisible(true);
        taskTableModel = new TaskTableModel(taskList.getTaskList());
    }

    public void addALButtons() {
        taskUI.nextButton.addActionListener(this);
        taskUI.exitButton.addActionListener(this);
        taskUI.previousButton.addActionListener(this);
        taskUI.clearButton.addActionListener(this);
        taskUI.updateButton.addActionListener(this);
        taskUI.deleteButton.addActionListener(this);
        taskUI.newButton.addActionListener(this);

    }
    public ArrayList<Task> getTaskList(){
        return taskList.getTaskList();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == taskUI.nextButton){
            currentTaskNum = taskUI.getCurrentTask();
            if (currentTaskNum ==taskList.getTaskList().size()-1){
                currentTaskNum = 0;
            }else{
                currentTaskNum++;
            }
            taskUI.setCurrentTask(currentTaskNum);
            taskUI.parseTask(taskList.getTaskList().get(currentTaskNum));
        }
        if (obj == taskUI.previousButton){
            currentTaskNum = taskUI.getCurrentTask();
            if (currentTaskNum ==0){
                currentTaskNum = taskList.getTaskList().size()-1;
            }else{
                currentTaskNum--;
            }
            taskUI.setCurrentTask(currentTaskNum);
            taskUI.parseTask(taskList.getTaskList().get(currentTaskNum));
        }
        if (obj == taskUI.exitButton){
            System.exit(0);
        }
        if (obj == taskUI.clearButton){
            taskUI.setTaskTitle("");
        }
        if (obj == taskUI.updateButton){
            int currentTask = taskUI.getCurrentTask();
            taskList.getTaskList().get(currentTask).setTitle(taskUI.getTaskTitle());
        }
        if (obj == taskUI.deleteButton){
            int currentTask = taskUI.getCurrentTask();

            if(taskList.getTaskList().size()==1){
                taskList.getTaskList().getFirst().setTitle("");
                taskUI.parseTask(taskList.getTaskList().getFirst());
            }else{
                taskList.getTaskList().remove(currentTask);
                if (currentTask>=taskList.getTaskList().size()){
                    currentTask=taskList.getTaskList().size()-1;
                }
                taskUI.setCurrentTask(currentTask);
                taskUI.parseTask(taskList.getTaskList().get(currentTask));
            }
        }
        if (obj == taskUI.newButton){
            Task newTask = new Task();
            newTask.setTitle("'Enter New Task Title Here'");
            taskList.getTaskList().add(newTask);
            currentTaskNum =taskList.getTaskList().size()-1;
            taskUI.setCurrentTask(currentTaskNum);
            taskUI.parseTask(taskList.getTaskList().get(currentTaskNum));
        }
    }

    public TaskTableModel getTaskTableModel(){
        return taskTableModel;
    }

    public void getTaskDetailUI(int selectedRow){
        taskUI = new TaskUI(this,selectedRow);
        taskListUI.setVisible(false);
        taskUI.setVisible(true);
    }

    public Task getTask(int index){
        return taskList.getTaskList().get(index);
    }

}
