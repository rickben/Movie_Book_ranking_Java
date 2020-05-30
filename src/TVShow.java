public class TVShow extends Item {
    int currEpisode;
    int currSeason;
    String favoriteEpisode;


    TVShow(String name) throws Exception {
        this.name = name;
        this.currEpisode=1;
        this.currSeason=1;
        this.numOfStars=0;
        this.comment="";
        this.favoriteEpisode="";
        this.favCharacter="";
        new TVShow(name,currEpisode,currSeason,numOfStars,comment,favoriteEpisode,favCharacter);
    }

    TVShow(String name, int currEpisode, int currSeason, int numOfStars, String comment, String favoriteEpisode ,String favCharacter) throws Exception {
        try {
            isValidEpisode(currEpisode);
            isValidSeason(currSeason);
            isValidFavorite(favoriteEpisode);
            isValidNumOfStars(numOfStars);
            isValidComment(comment);
            this.name = name;
            this.currEpisode = currEpisode;
            this.currSeason = currSeason;
            this.numOfStars = numOfStars;
            this.comment = comment;
            this.favoriteEpisode = favoriteEpisode;
            this.favCharacter=favCharacter;
        }
        catch (DetailException e){
            System.out.println("DetailException");
            getException = true;
        }
    }

    @Override
    public String toString() {
        if (!getException){
        StringBuilder strBuild = new StringBuilder(super.toString());
        strBuild.append(System.lineSeparator());
        strBuild.append("Current episode: "+currEpisode);
        strBuild.append(System.lineSeparator());
        strBuild.append("Current Season: "+currSeason);
        strBuild.append(System.lineSeparator());
        strBuild.append("Favorite episode: "+favoriteEpisode);
        return strBuild.toString();
    }
    else {
            return "Try Again!";
        }
    }

    private void isValidEpisode(int currEpisode)throws DetailException{
        if (currEpisode<=0){
            throw new DetailException();
        }
    }

    private void isValidSeason(int currSeason) throws DetailException{
        if (currSeason<=0){
            throw new DetailException();
        }
    }

    private void isValidFavorite(String favoriteEpisode)throws DetailException{
        if (favoriteEpisode==null){
            throw new DetailException();
        }
    }


}