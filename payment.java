import java.util.Scanner;

public class payment {
    public static void main(String[] args) {
           Scanner a= new Scanner(System.in);
            int amount=a.nextInt();

            int pay=amount/10;
            int remain=amount-pay;
           // System.out.println(amount);
           System.out.println(remain);

           int pay2=remain/10;
           int remain2=remain-pay2;
           System.out.println(remain2);

           int pay3=remain2/10;
           int remain3=remain2-pay3;
           System.out.println(remain3);

           System.out.println("Total Paid : "+(pay+pay2+pay3));
          
    }
}
