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
    private int currentTask;
    public TaskController(){
        taskList = new TaskList();
        taskUI = new TaskUI(this);
        taskUI.setVisible(true);
    }
    public void addALButtons(){
        taskUI.nextButton.addActionListener(this);
        taskUI.exitButton.addActionListener(this);
        taskUI.previousButton.addActionListener(this);
        taskUI.clearButton.addActionListener(this);

    }
    public ArrayList<Task> getTaskList(){
        return taskList.getTaskList();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == taskUI.nextButton){
            currentTask = taskUI.getCurrentTask();
            if (currentTask==taskList.getTaskList().size()-1){
                currentTask = 0;
            }else{
                currentTask++;
                taskUI.setCurrentTask(currentTask);
                taskUI.parseTask(taskList.getTaskList().get(currentTask));
            }
        }
    }

}
