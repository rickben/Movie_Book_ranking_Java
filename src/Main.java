import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        String myType;
        int currEpisode = 0;
        int currSeason = 0;
        String favoriteEpisode = null;
        int currMinute = 0;
        int numOfMovies = 0;
        int currentPage = 0;
        int numInSeries = 0;
        System.out.println("--------Enter Your Details-------- ");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String myName = in.nextLine();
        System.out.println("My name is: " + myName);
        System.out.print("Enter your type (TV/Movie/Book): ");
        String type = in.next();
        in.nextLine();
        System.out.println("Type: " + type);
        System.out.print("Enter the "+type+"'s name: ");
        String name = in.nextLine();
        System.out.println("The " + type + "'s name: " + name);

        switch (type){
            case ("TV"):
                System.out.print("Enter your current episode: ");
                currEpisode = in.nextInt();
                in.nextLine();
                System.out.print("Enter your current season: ");
                currSeason = in.nextInt();
                in.nextLine();
                System.out.println("Your current episode is: " + currEpisode + " in season: " + currSeason);
                System.out.print("Enter your favorite episode: ");
                favoriteEpisode = in.nextLine();
                System.out.println("Your favorite episode is: " + favoriteEpisode);
                break;
            case ("Movie"):
                System.out.print("Enter your current minute: ");
                currMinute = in.nextInt();
                in.nextLine();
                System.out.println("The current minute you are on is: " + currMinute);
                System.out.print("Enter the number of movies in this series: ");
                numOfMovies = in.nextInt();
                in.nextLine();
                System.out.println("The number of movies in this series is: " + numOfMovies);
                break;
            case ("Book"):
                System.out.print("Enter your current page: ");
                currentPage = in.nextInt();
                in.nextLine();
                System.out.println("Your current page is: " + currentPage);
                System.out.print("Enter number of books in this series: ");
                numInSeries = in.nextInt();
                in.nextLine();
                System.out.println("The number of books in this series is: " + numInSeries);
                break;
        }
        System.out.print("Enter the "+name+"'s comment: ");
        String comment = in.nextLine();
        System.out.println("The " + name + "'s comment: " + comment);
        System.out.print("Enter the "+name+"'s number of stars(0-5): ");
        int numOfStars = in.nextInt();
        in.nextLine();
        Stars star = new Stars(numOfStars);
        System.out.println("The " + name + "'s rank is: " + star.repStars);
        System.out.print("Enter the " + name + "'s favorite character: ");
        String favCharacter = in.nextLine();
        System.out.println("The " + name + "'s favorite character: " + favCharacter);

        Item item = new Item(){};
        switch (type){
            case ("TV"):
                item = new TVShow(name,currEpisode,currSeason,numOfStars,comment,favoriteEpisode,favCharacter);
                break;
            case ("Movie"):
                item = new Movie(name,currMinute,numOfMovies,numOfStars,comment,favCharacter);
                break;
            case ("Book"):
                item = new Book(name,currentPage,numInSeries,numOfStars,comment,favCharacter);
                break;
        }
        System.out.println("Do you want to print it?");
        String answer = in.next();
        in.nextLine();
        if (answer.equals("yes")){
            System.out.println(item.toString());
        }
        in.close();
        System.out.println("Good Job!:)");
    }
}
