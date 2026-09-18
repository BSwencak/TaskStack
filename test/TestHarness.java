public class TestHarness {

    public static void main(String[] args){
        testTaskClass();
        testCalendarClass();
    }

    public static void testTaskClass(){
        System.out.println("Testing Task Class:");
        Task taskCheckOne = new Task();

        if(taskCheckOne != null){
            System.out.println(taskCheckOne.getTitle());
            System.out.println(taskCheckOne.getSubtitle());
            System.out.println(taskCheckOne.getDescription());
            System.out.println(taskCheckOne.getDueDate());
            System.out.println(taskCheckOne.getPriority());
            System.out.println(taskCheckOne.getCategory());
            System.out.println(taskCheckOne.getNotes());
        }
        else
            System.out.println("There was an error creating Task");
        taskCheckOne.setTitle("Math Homework");
        taskCheckOne.setSubtitle("Complete problems 1-12");
        taskCheckOne.setDescription("Calculus Work");
        taskCheckOne.setDueDate("September 20, 2026");
        taskCheckOne.setPriority("Medium");
        taskCheckOne.setCategory("Calculus 100");
        taskCheckOne.setNotes("Math Notes");
        System.out.println(taskCheckOne.toString());
    }



    public static void testCalendarClass(){
        System.out.println("\nTesting Calendar Class:");
        Calendar CalendarCheckOne = new Calendar();

        if(CalendarCheckOne != null){
            System.out.println(CalendarCheckOne.getCurrentDay());
            System.out.println(CalendarCheckOne.getCurrentMonth());
            System.out.println(CalendarCheckOne.getCurrentYear());
            System.out.println(CalendarCheckOne.getViewMode());
            System.out.println(CalendarCheckOne.getCategory());
        }
        else
            System.out.println("There was an error creating Task");
        CalendarCheckOne.setCurrentDay("15");
        CalendarCheckOne.setCurrentMonth("September");
        CalendarCheckOne.setCurrentYear("2026");
        CalendarCheckOne.setViewMode("Paneled");
        CalendarCheckOne.setCategory("Calculus 100");
        System.out.println(CalendarCheckOne.toString());
    }

}
