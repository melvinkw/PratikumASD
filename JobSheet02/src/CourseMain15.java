public class CourseMain15 {
    public static void main(String[] args) {
        Course15 course1 = new Course15();
        course1.kodeCourse = "ASD1";
        course1.name = "Algorithms and Data Structures";
        course1.credits = 3;
        course1.numberOfHours = 5;

        course1.displayInformation();
        course1.changecredits(4);
        course1.addHours(2);
        course1.reduceHours(3);
        course1.displayInformation();

        Course15 course2 = new Course15("BD1", "Data Structure", 3, 5);

        course2.displayInformation();
        course2.changecredits(2);
        course2.addHours(1);
        course2.reduceHours(10);
        course2.displayInformation();
    }
}
