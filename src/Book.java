public class Book extends Item {
    int currentPage;
    int numInSeries;

    Book(String name) throws Exception{
        this.name=name;
        currentPage=1;
        numInSeries=1;
        this.numOfStars=0;
        this.comment="";
        this.favCharacter="";
        new Book(name,currentPage,numInSeries,numOfStars,comment,favCharacter);
    }

    Book(String name ,int currentPage ,int numInSeries ,int numOfStars ,String comment ,String favCharacter) throws Exception{
        super(name,numOfStars,comment,favCharacter);
        try{
            isValidCurrPage(currentPage);
            isValidNumInSeries(numInSeries);
            isValidComment(comment);
            isValidNumOfStars(numOfStars);
            isValidFavCharacter(favCharacter);
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
            strBuild.append("Current page: "+currentPage);
            strBuild.append(System.lineSeparator());
            strBuild.append("Num of books in the series: "+numInSeries);
            return strBuild.toString();
        }
        else {
            return "Try Again!";
        }
    }

    protected void isValidCurrPage(int currentPage) throws DetailException{
        if (currentPage<=0){
            throw new DetailException();
        }
    }

    protected void isValidNumInSeries(int numInSeries) throws DetailException{
        if (numInSeries<=0){
            throw new DetailException();
        }
    }
}
