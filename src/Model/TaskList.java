package Model;

import java.util.ArrayList;

public class TaskList {
    private Task task;
    public ArrayList<Task> taskList = new ArrayList<>();

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
            task = new Task("Practice Problems "+i, " Subtitle", "Description", "11/02/2026", "High"," Math","Notes");
            taskList.add(task);
        }
        for (int i=1; i<=5; i++){
            task = new Task("Lab Work "+i, " Subtitle", "Desc", "11/05/2026", "Medium","Science","Notes");
            taskList.add(task);
        }
    }
    public void printTaskList(){
        for (Task taskList : taskList){
            System.out.println(taskList);
        }
    }

}
