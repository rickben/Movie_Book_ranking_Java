public class Stars {
    int numOfStars;
    String repStars;
    Stars(int numOfStars){
        switch (numOfStars){
            case (0): repStars = "";
                      break;
            case (1): repStars = "*";
                      break;
            case (2): repStars = "**";
                      break;
            case (3): repStars = "***";
                      break;
            case (4): repStars = "****";
                      break;
            case (5): repStars = "*****";
                      break;

        }
    }
}
