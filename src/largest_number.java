import java.util.Scanner;
public class largest_number {
    public static void main(String[] args){
        int largest=Integer.MIN_VALUE, largest2=Integer.MIN_VALUE;
        Scanner input = new Scanner(System.in);
        for(int i=1; i<=10;i++){
           System.out.printf("enter the %d number :",i);
           int number=input.nextInt();
           if(number>largest) {
               largest2=largest;
               largest=number;
           }
           else if (number>largest2){
               largest2=number;
           }
        }
        System.out.printf("The largest number :%d and largest:%d ",largest,largest2);
    }
}
