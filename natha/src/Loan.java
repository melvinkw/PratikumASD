class Loan {
    private Student student;
    private Book book;
    private int loanPeriod;
    private int loanLimit;
    private int overdue;
    private int fine;

    public Loan(Student student, Book book, int loanPeriod) {
        this.student = student;
        this.book = book;
        this.loanPeriod = loanPeriod;
        this.loanLimit = 5;
        calculateFine();
    }

    public Student getStudent() {
        return student;
    }

    public Book getBook() {
        return book;
    }

    public int getLoanPeriod() {
        return loanPeriod;
    }

    public int getLoanLimit() {
        return loanLimit;
    }

    public int getOverdue() {
        return overdue;
    }

    public int getFine() {
        return fine;
    }

    public void calculateFine() {
        if (loanPeriod > loanLimit) {
            overdue = loanPeriod - loanLimit;
            fine = overdue * 2000;
        } else {
            overdue = 0;
            fine = 0;
        }
    }

    public void printLoan() {
        System.out.println(student.getName() + " | " + book.getTitle()
                + " | Loan Period (days): " + loanPeriod
                + " | Late return of books: " + overdue
                + " | fine: " + fine);
    }
}
