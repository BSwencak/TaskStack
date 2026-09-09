public class TaskStack {

    public static void main(String[] args) {

        //Calendar Object
        Calendar calendar = new Calendar("09", "September", "2026", "Month View", "IST-261");

        //Note Object
        Note note = new Note("Brainstorming", "09/04/2026", "09/09/2026", "None", "IST-261");

        //Category Object
        Category category = new Category("IST-261", "Anything pertaining to IST-261", "Red");

        //Layout Object
        Layout layout = new Layout("Default Layout", "List");

        //Task Object
        Task task = new Task("Coding Project", "Coding an assignment", "Create 5 model classes", "09/10/2026", "High", "IST-261", "None");

        //Print Objects
        System.out.println(calendar);
        System.out.println(note);
        System.out.println(category);
        System.out.println(layout);
        System.out.println(task);
    }
}

