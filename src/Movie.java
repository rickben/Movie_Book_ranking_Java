public class Movie extends Item {
    int currMinute;
    int numOfMovies;

    Movie(String name) throws Exception{
        this.name=name;
        this.currMinute=0;
        this.numOfMovies=1;
        this.numOfStars=0;
        this.comment="";
        this.favCharacter="";
        new Movie(name,currMinute,numOfMovies,numOfStars,comment,favCharacter);
    }

    Movie(String name, int currMinute, int numOfMovies, int numOfStars, String comment ,String favCharacter) throws Exception {
        super(name,numOfStars,comment,favCharacter);
        try {
            isValidMinute(currMinute);
            isValidNumOfMovies(numOfMovies);
            isValidNumOfStars(numOfStars);
            isValidComment(comment);
            this.currMinute = currMinute;
            this.numOfMovies = numOfMovies;

        }
        catch (DetailException e){
            System.out.println("Try Again!");
        }
    }

    @Override
    public String toString() {
        if (!getException){
            StringBuilder strBuild = new StringBuilder(super.toString());
            strBuild.append(System.lineSeparator());
            strBuild.append("Current episode: "+currMinute);
            strBuild.append(System.lineSeparator());
            strBuild.append("Current Season: "+numOfMovies);
            return strBuild.toString();
        }
        else {
            return "Try Again!";
        }
    }


    private void isValidMinute(int currMinute) throws DetailException{
        if (currMinute<0){
            throw new DetailException();
        }
    }

    private void isValidNumOfMovies(int numOfMovies) throws DetailException{
        if (numOfMovies<0){
            throw new DetailException();
        }
    }


}
