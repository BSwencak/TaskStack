# Project Title: 'TaskStack'
* Student: Brady Swencak
* Instructor: Ken Smith
* Class: IST261 - App Development Studio I
* Semester: Fall '26
* Project Description: A productivity app where you can track your tasks, notes, 
and calendar all-in-one with a customizable view
## Current Assignment Name: 'M08-A01: Implementing a LinkedList'
## Assignment Accomplishments - Added 2 classes to create a functional DueDate LinkedList
* Created 'TaskInDueDateList.java'
  * Added attributes for what the task would display (title & dueDate)
  * Added getters for the title and dueDate
  * Added a constructor for the task to be made using title and date
  * Added a toString to output the task nicely when the LinkedList is displayed
* Created 'DueDateList.java'
  * Instantiated the LinkedList for the dueDate LinkedList using the TaskInDueDateList as our items in the list
  * Added constructor for DueDateList to create the LinkedList, call the build of test data, output how the information is sorted, and then print the list
  * Added printList function to print the LinkedList neatly
  * Added buildTestData function to add 10 items to our list for demonstration
  * Added removeItem function to remove item from list using Iterator to help with the functionality
  * Added getItem function to get an item in the list from the title giving you the due date and title
  * Added addItem function to add any items into the list also using Iterator to help with the LinkedList
* Updated 'Main.java'
  * Instantiates the DueDateList, printing the type of sort and initial list
  * Outputs that a new item/task is being added and what the title is, then adding that task using function created in 'DueDateList.java' then outputs the list with the new task added
  * Outputs that an item/task is being removed than removing that task and outputting the updated list
  * Outputs what item/task it is getting, then outputting the task from the item being pulled from the LinkedList
  * Last outputs a final version of the list to show integrity
## Running the Project
These are instructions on how to run the project once loaded into IntelliJ.
### Steps
Step-by-step instructions on how to run your application.
1. Run 'Main.java' to see the LinkedList for DueDate works in the command line output