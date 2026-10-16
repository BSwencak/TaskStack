package Controller;

import Model.*;
import View.*;

import java.util.ArrayList;

public class TaskController {
    private Task task;
    private TaskList taskList;
    private TaskUI taskUI;
    public TaskController(){
        taskList = new TaskList();
        taskUI = new TaskUI(this);
        taskUI.setVisible(true);
    }
    public ArrayList<Task> getTaskList(){
        return taskList.getTaskList();
    }

}
