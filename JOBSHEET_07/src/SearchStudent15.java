public class SearchStudent15 {

    Students15[] ListStd15 = new Students15[5];
    int idx;

    void add(Students15 std){
        if(idx < ListStd15.length){
            ListStd15[idx] = std;
            idx++;
        } else {
            System.out.println("Data is already full");
        }
    }

    void display(){
        for(Students15 s : ListStd15){
            s.display();
            System.out.println("-----------------------------------");
        }
    }

    int findSeqSearch(int search){
        int position = -1;

        for(int i = 0; i < ListStd15.length; i++){
            if(ListStd15[i].nim == search){
                position = i;
                break;
            }
        }

        return position;
    }

    void showPosition(int x, int pos){
        if(pos != -1){
            System.out.println("Data with NIM " + x + " found at index " + pos);
        } else {
            System.out.println("Data with NIM " + x + " is not found");
        }
    }

    void showData(int x, int pos){
        if(pos != -1){
            System.out.println("NIM \t : " + x);
            System.out.println("Name \t : " + ListStd15[pos].name);
            System.out.println("Age \t : " + ListStd15[pos].age);
            System.out.println("GPA \t : " + ListStd15[pos].gpa);
        } else {
            System.out.println("Data " + x + " is not found");
        }
    }

    public int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == ListStd15[mid].nim) {
                return (mid);
            } else if (ListStd15[mid].nim > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
}