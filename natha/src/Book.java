class Book {
    private String code;
    private String title;
    private int year;
    private String status;

    public Book(String code, String title, int year) {
        this.code = code;
        this.title = title;
        this.year = year;
        this.status = "Available";
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void printBook() {
        System.out.println("Code: " + code + " | Title: " + title + " | Year: " + year);
    }
}
