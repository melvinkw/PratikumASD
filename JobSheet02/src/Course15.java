public class Course15 {

    String kodeCourse;
    String name;
    int credits;
    int numberOfHours;

    public Course15() {
    }

    public Course15(String kodeCourse, String name, int credits, int numberOfHours) {
        this.kodeCourse = kodeCourse;
        this.name = name;
        this.credits = credits;
        this.numberOfHours = numberOfHours;
    }

    void displayInformation() {
        System.out.println("Course Code   : " + kodeCourse);
        System.out.println("Course Name   : " + name);
        System.out.println("Credits (credits) : " + credits);
        System.out.println("Hours/Week    : " + numberOfHours);
        System.out.println("--------------------------------");
    }

    void changecredits(int creditsNew) {
        credits = creditsNew;
        System.out.println("Credits have been changed to " + credits);
    }

    void addHours(int hours) {
        numberOfHours += hours;
        System.out.println("Hours added. Total hours now: " + numberOfHours);
    }

    void reduceHours(int hours) {
        if (numberOfHours >= hours) {
            numberOfHours -= hours;
            System.out.println("Hours reduced. Total hours now: " + numberOfHours);
        } else {
            System.out.println("Cannot reduce hours. Not enough hours available.");
        }
    }
}