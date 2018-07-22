public class Utils {
    //Funkcja dla zadania 2 punkt a)
    public static int[] reverseArray (int arr [], int size){
        int reversedArray [] = new int[size];
        for(int i = 0;i<size;i++){
            reversedArray[i] = arr[size-1-i];
        }
        return reversedArray;
    }

    //Funkcja dla zadania 2 punkt b)
    public static String calendar (float number, String months[]){
        String chosenMonth = "";
        if(number > 13 || number < 1){
            System.out.println("ERROR: FLOAT NUMBER OUT OF USABLE BOUNDARIES");
        }else {
            chosenMonth = months[(int) (number - 1)];
        }
        return chosenMonth;
    }
}
