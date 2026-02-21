public class lc_daily_1 {

    public static void main(String[] args) {
        int left = 6;
        int right = 10;

        System.out.println(countPrimeSetBits(left, right));
    }

    public static int countPrimeSetBits(int left, int right) {
        int setBitsCount = 0;
        int out = 0;

        for(int i = left; i <= right; i++){
            setBitsCount = Integer.bitCount(i);
            if(isPrime(setBitsCount)){
                out++;
            }
        }

        return out;
        
    }

    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }

        if(num <= 3){
            return true;
        }

        if(num % 2 == 0){
            return false;
        }

        for(int i = 3; i*i <= num; i+=2){
            if( num % i == 0){
                return false;
            }
        }
        return true;
    }
        
}
    