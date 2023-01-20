import java.util.Scanner;

public class InputData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Your Name:");
        String name = input.nextLine();
        System.out.print("Your SurName:");
        String Surname = input.nextLine();
        System.out.print("Your NickName:");
        String Nickname = input.nextLine();
        System.out.print("Your Major:");
        String Major = input.nextLine();
        System.out.print("Your studen ID:");
        int StudenID = input.nextInt();
        input.close();
        System.out.println("Your name is" + name);
        System.out.println("Your Surname is" + Surname );
        System.out.println("Your Nickname is" + Nickname);
        System.out.println("Your Major" + Major);
        System.out.println("Your StudenId" + StudenID);
    }
}