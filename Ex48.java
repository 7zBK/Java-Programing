import java.util.Scanner;
public class Ex8 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for (int n = 1; n <= 10; n++){
            System.out.println("รอบที่" + n + " : " + sum + " + " + n + " = " +(sum));
            sum += n;
        }
        System.out.println("ผลบวกตัวเลขตั้งแต่ 1 - 10 มีค่าเท่ากับ "+ sum);
    }
    
}
