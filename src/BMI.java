import java.util.Scanner;
public class BMI {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the weight with kg  and height m !");
        System.out.print("weight:");
        double weigth = input.nextDouble();
        System.out.print("height:");
        double height = input.nextDouble();
        double BMI=weigth/(Math.pow(height,2));
        System.out.print("BMI is equal to "+BMI+"\n");
        System.out.print("Your Categoria: ");
       if(BMI<=18.5){
            System.out.println("Underweight");
        }
        else if (BMI>=18.5&&BMI<=24.9){
            System.out.println("Normal");
        }
        else if(BMI>=25&&BMI<=29.9){
            System.out.println("Overweight");
        }
        else if
            (BMI>=30){
            System.out.println("Obese");
        }
    }
}
