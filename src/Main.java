public class Main {

    public static void main(String[] args) {

        //Calendar Object
        Calendar calendar = new Calendar("12", "September", "2026", "Month View", "School");

        //Note Object
        Note note = new Note("Study Notes", "09/09/2026", "09/09/2026", "Math Homework", "School");

        //Category Object
        Category category = new Category("School", "Academic related tasks", "Blue");

        //Layout Object
        Layout layout = new Layout("Default Layout", "Grid");

        //Task Object
        Task task = new Task("Math Homework", "Chapter 5", "Finish problems 1-20", "09/10/2026", "High", "School", "Review notes before starting");

        //Print Objects
        System.out.println(calendar);
        System.out.println(note);
        System.out.println(category);
        System.out.println(layout);
        System.out.println(task);
    }
}

