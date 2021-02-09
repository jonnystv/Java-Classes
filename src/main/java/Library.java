import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> stockList;


    public Library(int capacity) {
        this.capacity = capacity;
        this.stockList = new ArrayList<Book>();
    }
}
