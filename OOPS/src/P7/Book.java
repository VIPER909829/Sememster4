package q7;
class Book extends LibraryResource{
    private int pageCount;
    public Book(String title, String author, int pageCount){
        super(title, author);
        this.pageCount=pageCount;
    }
    public void setPageCount(int pageCount){
        this.pageCount=pageCount;
    }
    public int getPageCount(){
        return pageCount;
    }
    public void displayDetails() {
        System.out.println("Book Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Page Count: " + pageCount);
        System.out.println("______________________________\n");
    }
}
