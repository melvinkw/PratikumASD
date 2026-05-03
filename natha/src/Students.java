class Student {
    private String nim;
    private String name;
    private String studyProgram;

    public Student(String nim, String name, String studyProgram) {
        this.nim = nim;
        this.name = name;
        this.studyProgram = studyProgram;
    }

    public String getNim() {
        return nim;
    }

    public String getName() {
        return name;
    }

    public String getStudyProgram() {
        return studyProgram;
    }

    public void printStudent() {
        System.out.println("NIM: " + nim + " | Name: " + name + " | Study program: " + studyProgram);
    }
}
