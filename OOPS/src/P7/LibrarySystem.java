package q7;

public class LibrarySystem {
    public static void main(String[] args) {
        Book book1 = new Book("AOT", "Hajime ", 7600);
        Magazine magazine1 = new Magazine("Weekly Shonen Jump", "Shueisha", "July 2, 1968");
        DVD dvd1 = new DVD("Inception", "C.Nolan", 148);
        book1.displayDetails();
        magazine1.displayDetails();
        dvd1.displayDetails();
    }
}
