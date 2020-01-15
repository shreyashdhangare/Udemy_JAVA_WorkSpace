public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double Number1 , double Number2) {

        Number1 = (int) (Number1 * 1000);
        Number2 = (int) (Number2 * 1000);

        if (Number1 == Number2) {
            return true;
        } else return false;

    }
}
