package Lecture2;

public class Task6 {
    public static void main(String[] args) {
        Task6Book book = new Task6Book();
        System.out.println(" Author " + book.getAuthor());
        System.out.println(" YearPublished " + book.getYearPublished());
        System.out.println(" BookName " + book.getBookName());
        System.out.println(" isNew " + book.isNew());
        System.out.println(" ISBN " + book.getIsbn());


        book.setAuthor("Agata Kristy");
        book.setYearPublished(1991);
        book.setBookName("Crockett House");
        book.setNew(true);
        book.setIsbn("12-00-25-28-22");

        System.out.println(" Author " + book.getAuthor());
        System.out.println(" YearPublished " + book.getYearPublished());
        System.out.println(" BookName " + book.getBookName());
        System.out.println(" isNew " + book.isNew());
        System.out.println(" ISBN " + book.getIsbn());

    }
}
