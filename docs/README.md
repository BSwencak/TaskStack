# Project Title: 'TaskStack'
* Student: Brady Swencak
* Instructor: Ken Smith
* Class: IST261 - App Development Studio I
* Semester: Fall '26
* Project Description: A productivity app where you can track your tasks, notes, 
and calendar all-in-one with a customizable view
## Current Assignment Name: 'M07-A01: Persistent Data Strategy and Implementation'
## Assignment Accomplishments - Added data persistence for tasks and task list as well as some general polishing
* Created 'PersistenceCntl.java'
  * Sets location and file for the task list/task serialization to be saved to 
  * Uses that location to read and write (functions later used to save and persist data)
* Updated 'Task.java' and 'TaskList.java' to implement serializable as well as adding a isCompleted function to tasks
* Updated 'TaskTableModel.java' and both UIs to also allow for completing a task
* Also added a hiding and showing completed task function to TaskListUI
* Updated 'TaskController.java' to persist the data using the functions created in 'PersistenceCntl.java'
  * Added method saveData to persist the data, writing the task list to the ser file
  * Added saveData before System.exit(0) on the exit button being clicked
* Updated 'TaskListUI.java' to allow for persistent data and saving even on regular application close and not exit button
  * Set the default close operation to  do nothing on close
  * Then using a window listener to check for window closing
  * After it uses the saveData method from 'TaskController.java' to ensure persisted data before closing, disposing, and then using System.exit(0)
* Update 'Main.java' to just create a new TaskController(); to get everything to run, much simpler and cleaner
## Running the Project
These are instructions on how to run the project once loaded into IntelliJ.
### Steps
Step-by-step instructions on how to run your application.
1. Run 'Main.java' to see and test the UI and persistence 