import java.util.ArrayList;
import java.util.List;

public class Page {
    String myName;
    int numOfDays;
    int numOfItems;
    List<TVShow> myTVShows = new ArrayList<>();
    List<Movie> myMovies = new ArrayList<>();
    List<Book> myBooks = new ArrayList<>();

    Page(String myName ,int numOfDays ,TVShow myTVShow ,Movie myMovie ,Book myBook){
        this.myName = myName;
        this.numOfDays = numOfDays;
        this.myTVShows.add(myTVShow);
        this.myBooks.add(myBook);
        this.myMovies.add(myMovie);
        this.numOfItems=3;
    }

    private void addItem(Item item){
        switch (item.getClass().getSimpleName()){
            case ("TVShow"): myTVShows.add((TVShow)item);
                             break;
            case ("Movie"):  myMovies.add((Movie)item);
                             break;
            case ("Book"):   myBooks.add((Book)item);
                             break;
        }
        numOfItems++;
    }
}
