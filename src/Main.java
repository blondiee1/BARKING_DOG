public class Main {
    public static void main(String[] args) {
        boolean doggy = shouldWakeUp(true, 9);
        System.out.println(doggy);
    }


    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if (barking == true && hourOfDay < 8 || hourOfDay > 22) {
            return true;
        } else {
            return false;
        }
    }


}
