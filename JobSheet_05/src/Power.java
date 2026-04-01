public class Power {

    int baseNumber;
    int exponent;

    Power(int baseNumber, int exponent){
        this.baseNumber = baseNumber;
        this.exponent = exponent;
    }

    int powerBF(int baseNumber, int exponent){
        int result = 1;
        for(int i = 0; i < exponent; i++){
            result = result * baseNumber;
        }
        return result;
    }

    int powerDC(int baseNumber, int exponent){
        if(exponent == 0){
            return 1;
        }else{
            int half = powerDC(baseNumber, exponent/2);
            if(exponent % 2 == 0){
                return half * half;
            }else{
                return baseNumber * half * half;
            }
        }
    }
}