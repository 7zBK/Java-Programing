import java.util.Scanner;
public class Ex54 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.println("จำนวนนาทีที่โทรศัพท์");
    float min = input.nextInt();
    float totapay;
    if (min < 3 ) {
        totapay = min * 5;
    } else{
        totapay = 10 + (min - 2 ) *2;
    }
    System.out.println("ค่าโทรศัพท์คือ : " + totapay);
}
}

    