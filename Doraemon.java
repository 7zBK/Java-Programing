import java.io.*;

public class Doraemon {

    public static void main(String[] args) {
        try {
            InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader stdin = new BufferedReader(reader);
            System.out.println("Doraemon:" + "Hello, Who are you?");
            System.out.println("Me:" +"Hello, my name is : ");
            String input = stdin.readLine();
            System.out.println("Doraemon:" + "Oh ! hi, " + input  );
            System.out.println("Doraemon:" + "What can I do for you?");
            System.out.println("Boy:" + "I want go to future.");
            System.out.println("Doraemon:" + "Of course, what is the present year?");
            System.out.println("Boy:" + "It is : ");
            String Yearnow = stdin.readLine();
            System.out.println("Doraemon:" + "Ok. How many years do you want to travel?");
            System.out.println("Boy:" + "I want to go for : " );
            String Yeargo = stdin.readLine();
            System.out.println("------------");
            System.out.println("------------");
            System.out.println("------------");
            int futureyear = Integer.valueOf(Yearnow) + Integer.valueOf(Yeargo);
            System.out.println("Doraemon:" + "Hello, welcome to :" + futureyear );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}