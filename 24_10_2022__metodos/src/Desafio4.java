import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        if(multiplosDe3(num)== true && multiplosDe5(num)== true){
            System.out.println("FizzBuzz");
        }else if(multiplosDe3(num)== true && multiplosDe5(num)== false){
            System.out.println("Fizz");
        }else if(multiplosDe5(num)== true && multiplosDe3(num)== false){
            System.out.println("Buzz");
        }else{
            System.out.println(num);
        }

        scan.close();
    }

    public static boolean multiplosDe3(int num){
        boolean multiplosDe3 = false;
    
        if(num % 3 == 0 ){
            multiplosDe3 = true;
        }
        return multiplosDe3;
    }

    public static boolean multiplosDe5(int num){
        boolean multiplosDe5 = false;

        if( num % 5 == 0){
            multiplosDe5 = true;
        }
        return multiplosDe5;
    }
}
