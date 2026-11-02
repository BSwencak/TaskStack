# Project Title: 'TaskStack'
* Student: Brady Swencak
* Instructor: Ken Smith
* Class: IST261 - App Development Studio I
* Semester: Fall '26
* Project Description: A productivity app where you can track your tasks, notes, 
and calendar all-in-one with a customizable view
## Current Assignment Name: 'M06-A01: Implementing the List-Detail Pattern'
## Assignment Accomplishments - Created and Updated files to implement new multi UI
* Created TaskTableModel to give us our table of the task list for TaskListUI.java
* Created TaskListUI to display our task list as a table with the help of TaskTableModel 
  * Able to show details of the task bringing you to TaskUI.java for that specific task to see more details
  * TaskListUI also allows you to create a new task, delete a task, or exit the program
* Updated TaskUI to fit new project requirements
  * Redid the UI to have all attributes of a Task to display update and change them
  * Using TaskUI as the more detailed view of a task now instead
* Updated TaskController to allow for functionality and view between both the TaskListUI and more detailed TaskUI
  * Ensured all buttons functioned without error
    * Can't delete a task that's being created
    * Ensuring TaskUI is not null if it's going to check for any buttons being pressed for it
  * Added a boolean to check if task was a new one being created
    * Helped to check to not allow the deleting of a new task
    * Changed the way a task was saved as well based on if it was being created or updated
* Updated TaskList to give better examples of the task usage
## Running the Project
These are instructions on how to run the project once loaded into IntelliJ.
### Steps
Step-by-step instructions on how to run your application.
1. Run 'Main.java' to see and test the UI