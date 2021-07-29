//char to string conversion.

public class CharToString {
    public static void main(String[] args){
        char c[]={'a', 'b', 'c', 'd', 'e', 'f'};
        String str=new String(c);
        System.out.println(str);

        //byte to string conversion.
        byte b[]={65,66,67,68,69,70};
        //               65=A,        66=B,   67=C,     68=D, 69=E, 70=F
        // Indexing   =  0,         1,          2,        3,           4,          5
        String s=new String(b,1,4);  // here it will create a new string taking index one to 4
        System.out.println(s);

    }
}
