import java.util.Scanner;
public class Ex10 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("midterm score");
        int a = input.nextInt();
        System.out.println("final score");
        double b = input.nextDouble();
        double sum = a+b ;
        if (sum >= 80){
            System.out.println("score" + sum + "," + "a");
        } else if (sum >= 75) {
            System.out.println("score"+ sum + "," + "b+");
        } else if (sum >= 70) {
            System.out.println("score" + sum + "," + "b");
        } else if (sum >= 65) {
            System.out.println("score" + sum + "," + "c+");
        } else if (sum >= 60) {
            System.out.println("score" + sum + "," + "c");
        } else if (sum >= 55) {
            System.out.println("score" + sum + "," + "d+");
        } else if (sum >= 50) {
            System.out.println("score" + sum + "," + "d");
        } else  (sum >= 45) {
            System.out.println("score" + sum + "," + "e");
        }
    }
}
