public class SumOddRange {

        public static boolean isOdd(int Number){
            if(Number < 0){
                return false;
            }
            else {
                if(Number % 2 == 0){
                    return false;
                }
                else {
                    return true;
                }
            }
        }


        public static int sumOdd (int start , int end){

            int sum = 0;
            if(start < 0 || start > end ){
                return -1;
            }

            for(int i = start ; i <= end ; i++){
                if(isOdd(i)){
                    sum += i;
                }
            }

            return sum;

        }





}
