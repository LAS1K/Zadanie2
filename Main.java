public class Main {
    public static void main(String[] args){
        //Dane i test dla zadania 2 punkt a)
        int [] array = {1,2,3,4,5,6,7,8,9,10,11,12};
        int arraySize = 12;

        for(int b : Utils.reverseArray(array,arraySize)){
            System.out.println(b);
        }
        System.out.println();

        //Dane i test dla zadania 2 punkt b)
        float number = 1.988823f;
        String months[]={"Styczeń", "Luty", "Marzec", "Kwiecień", "Maj", "Czerwiec", "Lipiec", "Sierpień", "Wrzesień", "Październik", "Listopad", "Grudzień"};

        System.out.println(Utils.calendar(number,months));

    }
}
