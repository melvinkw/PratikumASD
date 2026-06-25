
public class BinaryTreeArrayMain15 {

    public static void main(String[] args) {
        BinaryTreeArray15 bta = new BinaryTreeArray15();
        Student15 m1 = new Student15("244107020138", "Devin", "TI-1I", 3.57);
        Student15 m2 = new Student15("244107020023", "Dewi", "TI-1I", 3.85);
        Student15 m3 = new Student15("244107020225", "Wahyu", "TI-1I", 3.21);
        Student15 m4 = new Student15("244107020076", "Angelina", "TI-1I", 3.54);
        Student15 m5 = new Student15("244107020223", "Andhika", "TI-1I", 3.72);
        Student15 m6 = new Student15("244107020226", "Bima", "TI-1I", 3.37);
        Student15 m7 = new Student15("244107020181", "Eiyu", "TI-1I", 3.46);
        Student15[] data = {m1, m2, m3, m4, m5, m6, m7};
        bta.populateData(data, data.length - 1);
        System.out.println("In-order traversal:");
        bta.traverseInOrder(0);
    }
}
