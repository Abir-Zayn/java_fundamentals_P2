public class App {
    public static void main(String[] args) throws Exception {
        int x=10, y=20;

        //Here by enclosing the value we get the number(Integer)
        System.out.println("Sum of  " + x + "and "+ y +" is "+ (x+y));

        //If not  enclosing x and y then it will consider all as a string
        System.out.println("Sum of  " + x + " and "+ y +" is " +x+y);
    }
}
