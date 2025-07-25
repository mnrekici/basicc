package hafta2;

public class Fibonacci {
    public static void main(String[] args) {
        int fibonacci= fibonacci(9);
        System.out.println("Fibonacci:"+fibonacci);

    }

    private static int fibonacci (int number){

        if (number==0){
            return 0;
        }else if (number==1){
            return 1;
        }else {
            return fibonacci(number-1) + fibonacci(number-2);
        }

    }
}
