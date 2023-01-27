import java.util.Scanner;
public class Ex25 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.print("Please enter your weight: ");
int BMI = scan.nextInt();
double weight = scan.nextDouble();
System.out.print("Please enter your height: ");
double height = scan.nextDouble();
double h = (height/100);
double bmi = weight /(h*h);
System.out.println("You BMI IS"+ bmi);
String status;
if(BMI<30.0)
status = "อ้วนมาก";
else if(BMI<25)
status = "อ้วน";
else if(BMI<23)
status = "น้ำหนักเกิน";
else if(BMI<18.6)
status = "น้ำหนักปกติ เหมาะสม ";
else if(BMI<18.5)
status = "ผอมเกินไป";
else
status = "อิหยังวะ";
    } 
}