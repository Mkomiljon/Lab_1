import java.util.Scanner;
public class palindromes {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter number 5-digits number");
        System.out.print("number:");
        int num = input.nextInt();
        int num1=num/10000;
        int rem1=num%10000;
        int num2=rem1/1000;
        int rem2=rem1%1000;
        int num3=rem2/100;
        int rem3=rem2%100;
        int num4=rem3/10;
        int rem4=rem3%10;
        int palindromes=rem4*10000+num4*1000+num3*100+num2*10+num1;
        System.out.println("Palindromes:"+palindromes);
        if(palindromes==num){
            System.out.println("Palindromes namber ");
        }
        else
            System.out.println("Error enter another number");
    }
}
