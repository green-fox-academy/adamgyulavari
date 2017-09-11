import java.util.Scanner;

/**
 * Created by aze on 11/09/17.
 */
public class FirstExercise {
    public static void main(String[] args) {
        char s = 's';
        System.out.println("\\\"Hello's World!\"" + "asda");
//        if(condition) {
//            System.out.println("this is true");
//            if (anotherCondition) {
//
//            } else {
//
//            }
//        } else {
//            System.out.println("this is false");
//        }
        for (int i = 0; i < 100; i+=2){
            System.out.println("WAT");
        }

        int i = 0;
        while(i < 100) {
            System.out.println("WAT");
            i++;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Put in a number");
        int userNumber = scanner.nextInt();
        if (userNumber % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number, thx");
        }
        System.out.println("Pls say your name");
        String username = scanner.nextLine();
    }
}
