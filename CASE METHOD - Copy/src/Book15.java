public class Book15 {
    String code;
    String title;
    int year;
    String status;

    public Book15(String code, String title, int year) {
        this.code = code;
        this.title = title;
        this.year = year;
        this.status = "Available";     }

    void printBook() {
        System.out.println("Code: " + code + " | Title: " + title + " | Year: " + year);
    }
}