package q7;

class Magazine extends LibraryResource{
    private String issueDate;
    public Magazine(String title, String publisher, String issueDate) {
        super(title, publisher);
        this.issueDate = issueDate;
    }
    public String getIssueDate() {
        return issueDate;
    }
    public void setIssueDate(String issueDate) {
        this.issueDate=issueDate;
    }
    public void displayDetails() {
        System.out.println("Magazine Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Issue Date: " + issueDate);
        System.out.println("______________________________\n");
    }
}