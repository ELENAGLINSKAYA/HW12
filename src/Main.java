public class Main {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Archibald", "Cronin");
        Author secondAuthor = new Author("John","Priestley");
        BooK firstBooK = new BooK("Green Years",1931,firstAuthor);
        BooK secondBooK = new BooK("A bend in the Road", 1932, secondAuthor);

        System.out.println();
        System.out.println("Book One");
        System.out.println(" "+firstBooK.getTitleOfTheBook()+","+
                " "+ firstBooK.getYaerOfPublicationOfTheBook()+","+
                " " + firstBooK.getFullName());
        System.out.println();
        System.out.println("Book Two");
        System.out.println(" "+ secondBooK.getTitleOfTheBook()+","+
                " "+ secondBooK.getYaerOfPublicationOfTheBook()+","+
                " " + secondBooK.getFullName());
    }
}