package q7;
class DVD extends LibraryResource {
    private int duration;
    public DVD(String title, String director, int duration) {
        super(title, director);
        this.duration = duration;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public void displayDetails() {
        System.out.println("DVD Title: "+getTitle());
        System.out.println("Author: "+getAuthor());
        System.out.println("Duration: "+duration+" minutes");
        System.out.println("______________________________\n");
    }
}
