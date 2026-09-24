# Project Title: 'TaskStack'
* Student: Brady Swencak
* Instructor: Ken Smith
* Class: IST261 - App Development Studio I
* Semester: Fall '26
* Project Description: A productivity app where you can track your tasks, notes, 
and calendar all-in-one with a customizable view
## Current Assignment Name: 'M04-A01: Implementing Inheritance and Interfaces'
## Assignment Accomplishments - Added Inheritance to 'Layout' and Interface to 'Calendar' and 'Task'
* Adjusted Layout.java class to be a super class by creating a package for all things related
* Added function 'display' to Layout to display the type of layout form the subclass
* Created subclasses 'GridLayout' and 'List Layout'
* While not super effective right now, this will help in the future with layout customization per user
* Created TestInheritInterface class in /test to run tests on the subclasses
* Within TestInheritInterface created 2 of each object, added them to an ArrayList, and iterated through to display functionality
* Created a Java interface class 'Printable' and added printSetup and print
* Implemented 'Printable' into 'Calendar' and 'Task' setting up the functions for printSetup and print in each
* Created new Calendar and Task objects in testInterface function
* Created an ArrayList for the printables add the new objects to them and then iterating through the list to display functionality
## Running the Project
These are instructions on how to run the project once loaded into IntelliJ.
### Steps
Step-by-step instructions on how to run your application.
1. Run 'TestInheritInterface' class to test the new subclasses inheritance, and implementation of the new Printable interface