import java.util.Scanner;
public class Ex55 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter x");
        int x = input.nextInt();
        System.out.println("enter y");
        int y = input.nextInt();
        System.out.println("enter z");
        int z = input.nextInt();
        if (x > y) {
            System.out.println(x+"x is greater than"+y+"and"+z);
        } else {
            System.out.println(x+"x is greater than"+y+ "but"+z+"x is less than z");
        }
    } else {
        System.out.println("x is less than y");
    }
 }

