package hafta3_patika_practices;

public class GenericExample {

    //Generic method
    public static <T> void printArray(T[] array){
        for (T item : array){
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] numbers = {1,2,3,4,5};

        String[] words = {"Java", "Generics", "Ödevıoja"};

        //Calling the generic method
        printArray(numbers);
        printArray(words);

    }
}
