package q7;

abstract class LibraryResource {
    private String title, author;
    public LibraryResource(String title, String author){
        this.title=title;
        this.author=author;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){
        return title;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public String getAuthor(){
        return author;
    }
    public abstract void displayDetails();
}
