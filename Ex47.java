import java.util.Scanner;
public class Ex7 {

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number1");
        int a = scan.nextInt();
        System.out.println("enter number2");
        int b = scan.nextInt();
        System.out.println("a =" + a );
        System.out.println("b =" + b );
        if (a == b){
            System.out.println("a = b");
            }else if ( a > b){
                System.out.println("จำนวนที่ a มากกว่า");
            } else {
                System.out.println("จำนวนที่ b มากกว่า");
            }
    }
    
}
