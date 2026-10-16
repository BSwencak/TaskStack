package Model;

import java.util.ArrayList;

public class TaskList {
    private Task task;

    public ArrayList<Task> taskList;

    public ArrayList<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(ArrayList<Task> taskList) {
        this.taskList = taskList;
    }

    public TaskList(){
        if (taskList.size()==0){
            createTaskList();
        }
    }

    public void createTaskList(){
        for (int i=1; i<=5; i++){
            task = new Task("Name", "Subtitle", "Desc", "Due", "Prio","Cat","Notes");
            taskList.add(task);
            task = new Task("Name2", "Subtitle2", "Desc2", "Due2", "Prio2","Cat2","Notes2");
            taskList.add(task);
        }
    }

    public void printTaskList(){
        for (Task taskList : taskList){
            System.out.println(taskList);
        }
    }
}
