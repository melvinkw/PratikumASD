public class bookLending15 {
    Student15 sdt;
    Book15 book;
    int loanPeriod;
    int loanLimit = 5;
    int overdue;
    int fine;
    boolean isReturned;

    public bookLending15(Student15 sdt, Book15 book, int loanPeriod) {
        this.sdt = sdt;
        this.book = book;
        this.loanPeriod = loanPeriod;
        this.isReturned = false;
        calculateFine();
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

    public void printLending() {
        String statusPinjam = isReturned ? "[Returned]" : "[Active]";
        System.out.println(sdt.name + " | " + book.title + " | Loan Period (days): " + loanPeriod + " | Late return of books: " + overdue + " | fine: " + fine);
    }
}