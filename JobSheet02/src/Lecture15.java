public class Lecture15 {
     String idLecturer;
    String name;
    boolean activeStatus;
    int yearOfEntry;
    String expertiseCompetency;

    public Lecture15() {
        System.out.println("Default constructor called.");
    }

    public Lecture15(String idLecturer, String name, boolean activeStatus, int yearOfEntry, String expertiseCompetency) {
        this.idLecturer = idLecturer;
        this.name = name;
        this.activeStatus = activeStatus;
        this.yearOfEntry = yearOfEntry;
        this.expertiseCompetency = expertiseCompetency;
    }

    void displayInformation() {
        System.out.println("Lecturer ID    : " + idLecturer);
        System.out.println("Name           : " + name);
        System.out.println("Active Status  : " + activeStatus);
        System.out.println("Year of Entry  : " + yearOfEntry);
        System.out.println("Expertise      : " + expertiseCompetency);
        System.out.println("--------------------------------");
    }

    void setActiveStatus(boolean status) {
        activeStatus = status;
        System.out.println("Active status changed to: " + activeStatus);
    }

    int calculateTimeWork(int yearNow) {
        int workingPeriod = yearNow - yearOfEntry;
        return workingPeriod;
    }

    void changeSkill(String skill) {
        expertiseCompetency = skill;
        System.out.println("Expertise changed to: " + expertiseCompetency);
    }
}
