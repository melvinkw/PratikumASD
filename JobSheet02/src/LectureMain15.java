public class LectureMain15 {
    public static void main(String[] args) {
        Lecture15 ltr1 = new Lecture15();
        ltr1.idLecturer = "L001";
        ltr1.name = "Ma'am Wilda Imama Sabilla, S.Kom., M.Kom.";
        ltr1.activeStatus = true;
        ltr1.yearOfEntry = 2016;
        ltr1.expertiseCompetency = "DataBase";

        ltr1.displayInformation();
        ltr1.setActiveStatus(false);
        System.out.println("Working period: " + ltr1.calculateTimeWork(2025) + " years");
        ltr1.changeSkill("Artificial Intelligence");
        ltr1.displayInformation();

        Lecture15 ltr = new Lecture15("L002", "Ma'am Vivin Ayu Lestari, S.Pd., M.Kom.", true, 2018, "Algorithm and Data Structures");

        ltr.displayInformation();
        System.out.println("Working period: " + ltr.calculateTimeWork(2025) + " years");
        ltr.changeSkill("Network Security");
        ltr.displayInformation();
    }
}
