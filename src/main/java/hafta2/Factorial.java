package hafta2;

public class Factorial {
    public static void main(String[] args) {
        int factorial = factorial(5);
        System.out.println("Faktoriyel:"+ factorial);
    }

    public static int factorial(int number){

        if(number ==0){
            return 1;
        }

        return number * (factorial(number-1));

    }
}
