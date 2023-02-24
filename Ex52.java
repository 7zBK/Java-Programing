import java.util.Scanner;
public class Ex52 {
    
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter n :");
        int n = input.nextInt();
        for(int i=1; i<=100; i++){
            if(i%n==0){
                System.out.println(i+"mod"+n+"divisible");
            }
        }
    }
}
