# Project Title: 'TaskStack'
* Student: Brady Swencak
* Instructor: Ken Smith
* Class: IST261 - App Development Studio I
* Semester: Fall '26
* Project Description: A productivity app where you can track your tasks, notes, 
and calendar all-in-one with a customizable view
## Current Assignment Name: 'M05-A01: Implementing a Simple MVC Application GUI'
## Assignment Accomplishments - Created TaskUI, TaskList, and TaskController to display tasks and edit them in a UI
* Created TaskUI with the swing drag and drop menu to add all my buttons, title, and textField to display the current task title
* Within the TaskUI.java file, made all the button variables public to be controlled in the TaskController java class
* Also added a constructor to be able to set proper parameters for the UI
* Added functions to help get information pertaining to the tasks viewed in the UI like getCurrentTask
* Instantiated all other variables needed for the UI to interact with the TaskController and TaskList
* Created TaskList.java to have an ArrayList of premade Tasks to help check the functions of the project
* Created TaskController.java which makes the buttons function but adding them all as action listeners and performing action based on the button that is pressed
* Ensured that there are no errors and list cannot be fully deleted instead it leaves one blank entry always so the project doesn't error

**APPLICATION CLASS:**    _'Main.java'_

**MODEL CLASS:**          _'Task.java'_

**CONTROLLER CLASS:**     _'TaskController.java'_

**SECOND MODEL CLASS:**   _'TaskList.java'_

**VIEW CLASS:**           _'TaskUI' - 'TaskUI,java' - 'TaskUI.form'_
## Running the Project
These are instructions on how to run the project once loaded into IntelliJ.
### Steps
Step-by-step instructions on how to run your application.
1. Run 'Main.java' to see and test TaskUI