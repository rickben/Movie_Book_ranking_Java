abstract class Item {
    String name;
    /*
    The rank is represented by stars
     */
    int numOfStars;
    /*
    A comment or a reaction to the movie
     */
    String comment;
    String favCharacter;
    boolean getException=false;

    Item(){
    }

    Item(String name, int numOfStars, String comment, String favCharacter){
        this.name = name;
        this.numOfStars = numOfStars;
        this.comment = comment;
        this.favCharacter = favCharacter;
    }


    @Override
    public String toString() {
        if (!getException){
            StringBuilder strBuild = new StringBuilder("");
            strBuild.append(this.getClass().getSimpleName()+": "+name);
            strBuild.append(System.lineSeparator());
            Stars star = new Stars(numOfStars);
            strBuild.append("Rank: "+star.repStars);
            strBuild.append(System.lineSeparator());
            strBuild.append("Comment: '"+comment+"'");
            strBuild.append(System.lineSeparator());
            strBuild.append("Favorite character: "+ favCharacter);
            return strBuild.toString();
        }
        else {
            return "";
        }
    }

    protected void setName(String name){
        this.name=name;
    }

    protected void setNumOfStars(int numOfStars){
        this.numOfStars=numOfStars;
    }

    protected void setComment(String comment){
        this.comment=comment;
    }

    protected void setFavCharacter(String favCharacter){
        this.favCharacter=favCharacter;
    }

    protected void isValidNumOfStars(int numOfStars) throws DetailException{
        if (numOfStars<0||numOfStars>5){
            throw new DetailException();
        }
    }

    protected void isValidComment(String comment) throws DetailException{
        if (comment==null){
            throw new DetailException();
        }
    }
    protected void isValidFavCharacter(String favCharacter) throws DetailException{
        if (favCharacter==null){
            throw new DetailException();
        }
    }
}
