import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoteTest {

    @Test
    void getTitle() {
        Note testNoteTitle = new Note();
        testNoteTitle.setTitle("New Title");
        assertEquals("New Title", testNoteTitle.getTitle());
    }

    @Test
    void getDateCreated() {
        Note testNoteDateCreated = new Note();
        testNoteDateCreated.setDateCreated("September 21, 2026");
        assertEquals("September 21, 2026", testNoteDateCreated.getDateCreated());
    }

    @Test
    void getDateLastEdited() {
        Note testNoteDateLastEdited = new Note();
        testNoteDateLastEdited.setDateLastEdited("September 25, 2026");
        assertEquals("September 25, 2026", testNoteDateLastEdited.getDateLastEdited());
    }

    @Test
    void getAttachedTask() {
        Note testNoteAttachedTask = new Note();
        testNoteAttachedTask.setAttachedTask("Math Homework");
        assertEquals("Math Homework", testNoteAttachedTask.getAttachedTask());
    }

    @Test
    void getCategory() {
        Note testNoteCategory = new Note();
        testNoteCategory.setCategory("Calculus 100");
        assertEquals("Calculus 100", testNoteCategory.getCategory());
    }

    @Test
    void setTitle() {
        Note testNoteTitle = new Note();
        testNoteTitle.setTitle("New Title");
        assertEquals("New Title", testNoteTitle.getTitle());
    }

    @Test
    void setDateCreated() {
        Note testNoteDateCreated = new Note();
        testNoteDateCreated.setDateCreated("September 21, 2026");
        assertEquals("September 21, 2026", testNoteDateCreated.getDateCreated());
    }

    @Test
    void setDateLastEdited() {
        Note testNoteDateLastEdited = new Note();
        testNoteDateLastEdited.setDateLastEdited("September 25, 2026");
        assertEquals("September 25, 2026", testNoteDateLastEdited.getDateLastEdited());
    }

    @Test
    void setAttachedTask() {
        Note testNoteAttachedTask = new Note();
        testNoteAttachedTask.setAttachedTask("Math Homework");
        assertEquals("Math Homework", testNoteAttachedTask.getAttachedTask());
    }

    @Test
    void setCategory() {
        Note testNoteCategory = new Note();
        testNoteCategory.setCategory("Calculus 100");
        assertEquals("Calculus 100", testNoteCategory.getCategory());
    }

    @Test
    void testToString() {
        Note testNoteToString = new Note();
        testNoteToString.setTitle("New Title");
        testNoteToString.setDateCreated("September 21, 2026");
        testNoteToString.setDateLastEdited("September 25, 2026");
        testNoteToString.setAttachedTask("Math Homework");
        testNoteToString.setCategory("Calculus 100");
        String expected = "Note {Title: 'New Title' , Date Created: 'September 21, 2026' , Date Last Edited: 'September 25, 2026' , Attached Task: 'Math Homework' , Category: 'Calculus 100'}";
        assertEquals(expected, testNoteToString.toString());

    }
}