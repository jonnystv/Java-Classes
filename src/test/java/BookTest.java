import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book1;

    @Before
    public void before(){
        book1 = new Book("1984","George Orwell", "Dystopian");
    }

    @Test
    public void hasTitle() {
        assertEquals("1984", book1.getTitle());
    }

    @Test
    public void hasAuthor() {
        assertEquals("George Orwell", book1.getAuthor());
    }
}
