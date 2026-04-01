public class StudentScore {

    String[] name;
    int[] year;
    int[] uts;
    int[] uas;
    int n;

    StudentScore(int n){
        this.n = n;
        name = new String[n];
        year = new int[n];
        uts = new int[n];
        uas = new int[n];
    }

    int highestUTS(int l, int r){
        if(l == r){
            return uts[l];
        }else{
            int mid = (l + r) / 2;
            int left = highestUTS(l, mid);
            int right = highestUTS(mid + 1, r);
            return Math.max(left, right);
        }
    }

    int lowestUTS(int l, int r){
        if(l == r){
            return uts[l];
        }else{
            int mid = (l + r) / 2;
            int left = lowestUTS(l, mid);
            int right = lowestUTS(mid + 1, r);
            return Math.min(left, right);
        }
    }

    double averageUAS(){
        int total = 0;
        for(int i = 0; i < n; i++){
            total += uas[i];
        }
        return (double) total / n;
    }
}