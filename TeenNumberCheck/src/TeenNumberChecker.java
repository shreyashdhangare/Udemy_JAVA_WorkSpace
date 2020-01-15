public class TeenNumberChecker {
    public static boolean hasTeen(int Number1 , int Number2 , int Number3){
        if((Number1 <= 19 && Number1 >= 13) || (Number2 <= 19 && Number2 >= 13) || (Number3 <= 19 && Number3 >= 13)){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean isTeen(int Number1){
        if(Number1 <= 19 && Number1 >=13){
            return true;
        }
        else{
            return false;
        }
    }


}
