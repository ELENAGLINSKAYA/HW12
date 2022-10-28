public class BooK {
    private String titleOfTheBook;
    private int yaerOfPublicationOfTheBook;
    private Author fullName;
    public BooK(String titleOfTheBook,int yaerOfPublicationOfTheBook,Author fullName) {
        this.titleOfTheBook = titleOfTheBook;
        this.yaerOfPublicationOfTheBook = yaerOfPublicationOfTheBook;
        this.fullName = fullName;
    }
    public Author getFullName(){
        return this.fullName;
    }
    public String getTitleOfTheBook() {
        return this.titleOfTheBook;
    }
    public int getYaerOfPublicationOfTheBook() {
        return this.yaerOfPublicationOfTheBook;
    }
    public void setYaerOfPublicationOfTheBook(int yaerOfPublicationOfTheBook) {
        this.yaerOfPublicationOfTheBook = yaerOfPublicationOfTheBook;
    }
    @Override
    public String toString() {
        return "BooK{" +
                "titleOfTheBook='" + titleOfTheBook + '\'' +
                ", yearOfThePublicationOfTheBook=" + yaerOfPublicationOfTheBook +
                ", fullName=" + fullName +
                '}';
    }

}




