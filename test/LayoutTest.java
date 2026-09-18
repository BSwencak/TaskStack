import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class LayoutTest {

    @Test
    void getModeTitle() {
        Layout testLayoutTitle = new Layout();
        testLayoutTitle.setModeTitle("New Mode Title");
        assertEquals("New Mode Title", testLayoutTitle.getModeTitle());
    }

    @Test
    void getModeType() {
        Layout testLayoutType = new Layout();
        testLayoutType.setModeType("New Mode Type");
        assertEquals("New Mode Type", testLayoutType.getModeType());
    }

    @Test
    void setModeTitle() {
        Layout testLayoutTitle = new Layout();
        testLayoutTitle.setModeTitle("New Mode Title");
        assertEquals("New Mode Title", testLayoutTitle.getModeTitle());
    }

    @Test
    void setModeType() {
        Layout testLayoutType = new Layout();
        testLayoutType.setModeType("New Mode Type");
        assertEquals("New Mode Type", testLayoutType.getModeType());
    }

    @Test
    void testToString() {
        Layout testLayoutToString= new Layout();
        testLayoutToString.setModeTitle("New Mode Title");
        testLayoutToString.setModeType("New Mode Type");
        String expected = "Layout {Mode Title: 'New Mode Title' , Mode Type: 'New Mode Type'}";
        assertEquals(expected, testLayoutToString.toString());
    }
}