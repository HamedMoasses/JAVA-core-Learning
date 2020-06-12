import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        System.out.println("Enter weight:");
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        System.out.println(w);
        System.out.println("Enter height:");
        double h=sc.nextDouble();

        BMI bmi=new BMI();
      double bmiValue=  bmi.calculateBMI(w,h);
        bmi.checkStatus(bmiValue);







    }
}
