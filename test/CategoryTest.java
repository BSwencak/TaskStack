import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    @Test
    void getTitle() {
        Category testCategoryTitle = new Category();
        testCategoryTitle.setTitle("New Title");
        assertEquals("New Title", testCategoryTitle.getTitle());
    }

    @Test
    void getSubtitle() {
        Category testCategorySubtitle = new Category();
        testCategorySubtitle.setTitle("New Subtitle");
        assertEquals("New Subtitle", testCategorySubtitle.getTitle());
    }

    @Test
    void getColor() {
        Category testCategoryColor = new Category();
        testCategoryColor.setTitle("Purple");
        assertEquals("Purple", testCategoryColor.getTitle());
    }

    @Test
    void setTitle() {
        Category testCategoryTitle = new Category();
        testCategoryTitle.setTitle("New Title");
        assertEquals("New Title", testCategoryTitle.getTitle());
    }

    @Test
    void setSubtitle() {
        Category testCategorySubtitle = new Category();
        testCategorySubtitle.setTitle("New Subtitle");
        assertEquals("New Subtitle", testCategorySubtitle.getTitle());
    }

    @Test
    void setColor() {
        Category testCategoryColor = new Category();
        testCategoryColor.setTitle("Purple");
        assertEquals("Purple", testCategoryColor.getTitle());
    }

    @Test
    void testToString() {
        Category testCategoryToString = new Category();
        testCategoryToString.setTitle("New Title");
        testCategoryToString.setSubtitle("New Subtitle");
        testCategoryToString.setColor("Purple");
        String expected = "Category {Title: 'New Title' , Subtitle: 'New Subtitle' , Color: 'Purple'}";
        assertEquals(expected, testCategoryToString.toString());
    }
}