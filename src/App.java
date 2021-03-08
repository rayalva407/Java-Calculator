import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        double fnum, snum, answer;
        char operator;
        System.out.println("Enter first number: ");
        fnum = sc.nextDouble();
        System.out.println("Enter second number: ");
        snum = sc.nextDouble();
        System.out.println("Enter Operation: ");
        operator = sc.next().charAt(0);

        switch(operator) {
            case '+' :
                answer = fnum + snum;
                System.out.println(answer);
                break;
            case '-' :
                answer = fnum - snum;
                System.out.println(answer);
                break;
            case '*' :
                answer = fnum * snum;
                System.out.println(answer);
                break;
            case '/' :
                answer = fnum / snum;
                System.out.println(answer);
                break;
            default :
                System.out.println("Invalid input, Try Again!");
                break;
        }
    }
}
