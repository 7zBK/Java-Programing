import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
public class Ex9 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter x :");
        int x = input.nextInt();
        if (x>0) {
            System.out.println("positive number");
        } else if (x<0) {
            System.out.println("Negative number");
        } else {
            System.out.println("zero");
        }
    }
}
