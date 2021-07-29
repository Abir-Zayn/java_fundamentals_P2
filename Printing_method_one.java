public class Printing_method_one {
    
    public static void main(String[] args) {{
        float i =122.6f;
        float f= 12.56f;
        // char c = 'z';
        int a=6;
        String s ="My name is Zayn";

        System.out.printf("The float number in scientific Form is %e \n ",f);       //e+01 means ato the power 1
        System.out.printf("The int number in Scientific Form is %e \n ",i);         // e+02 means a to the power 2
        System.out.println("Hello "+s);         //Print a string
       

        //Arguement Index ==> Format Specifier is independent of the order of arguements to print as you like.
        System.out.printf(" %2$s  %1$f  \n", f, s);     
        System.out.printf(" %08d" , a);  //%means width ,how much width you need can be define with %[number][conversion_Type]
        }}
 }
