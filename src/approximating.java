import java.util.Scanner;

public class approximating {
    public static void start(){
        Scanner input = new Scanner(System.in);
        // Pi=4(1-1/3+1/5-1/7+1/9....)===3.14159?
        //sum1= 1/3+1/7+1/11+........
        //sum2= 1/5+1/9+1/13+........

        System.out.println("Please input the number of terms : ");
        double Term=input.nextInt();
        double sum1=0;
        double sum2=0;
        for(double i=3;i<=Term;i=i+4) { sum1 += (double)1/i; }
        for(double j=5;j<=Term;j=j+4){sum2 +=(double)1/j;}

        double Pi=4*(1-sum1+sum2);
        System.out.print(Pi);

    }
}

