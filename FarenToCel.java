package meethods;

class tempCal {
    public double farenheit(double cel){
        return (cel*9)/5 +32;
    }

    public void Celcius(double faren) {
        System.out.println(((faren - 32) * 5) / 9);

    }

        }
public class FarenToCel {
    public static void main(String[] args) {
        tempCal temp=new tempCal();
        System.out.println(  temp.farenheit(26));
        temp.Celcius(40);
    }
}
