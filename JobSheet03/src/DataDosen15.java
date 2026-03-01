public class DataDosen15 {

    public static void dataAllDosen(Dosen15[] arrayOfDosen) {
        System.out.println("\n[dataAllDosen]");
        for (Dosen15 d : arrayOfDosen) {
            d.printInfo();
        }
    }

    public static void numberOfLecturersPerGender(Dosen15[] arrayOfDosen) {
        int male = 0, female = 0;

        for (Dosen15 d : arrayOfDosen) {
            if (d.gender) male++;
            else female++;
        }

        System.out.println("\n[numberOfLecturersPerGender]");
        System.out.println("Male   : " + male);
        System.out.println("Female : " + female);
    }

    public static void AverageumurOfLecturersPerGender(Dosen15[] arrayOfDosen) {
        int totalMale = 0, countMale = 0;
        int totalFemale = 0, countFemale = 0;

        for (Dosen15 d : arrayOfDosen) {
            if (d.gender) {
                totalMale += d.umur;
                countMale++;
            } else {
                totalFemale += d.umur;
                countFemale++;
            }
        }

        System.out.println("\n[averageumurOfLecturersPerGender]");
        if (countMale > 0)
            System.out.println("average Male umur   : " + (double) totalMale / countMale);
        if (countFemale > 0)
            System.out.println("average Female umur : " + (double) totalFemale / countFemale);
    }

    public static void infoDosenPalingTua(Dosen15[] arrayOfDosen) {
        Dosen15 oldest = arrayOfDosen[0];

        for (Dosen15 d : arrayOfDosen) {
            if (d.umur > oldest.umur) {
                oldest = d;
            }
        }

        System.out.println("\n[infoDosenPalingTua]");
        oldest.printInfo();
    }

    public static void infoDosenMostYoungest(Dosen15[] arrayOfDosen) {
        Dosen15 youngest = arrayOfDosen[0];

        for (Dosen15 d : arrayOfDosen) {
            if (d.umur < youngest.umur) {
                youngest = d;
            }
        }

        System.out.println("\n[infoDosenMostYoungest]");
        youngest.printInfo();
    }
}
