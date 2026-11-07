package Controller;

import Model.TaskList;

import java.io.*;

public class PersistenceCntl {

    public final String fileName = "data/taskList.ser";

    public TaskList readTaskList() {
        TaskList taskList = null;

        try{
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);

            taskList = (TaskList) ois.readObject();

            ois.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return taskList;
    }

    public void writeTaskList(TaskList taskList) {

        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(taskList);

            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
