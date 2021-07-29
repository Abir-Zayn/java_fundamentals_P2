public class StringClass {
    public static void main(String[] args) {
        String strr="java Language";

        int l =strr.length();                          //Finding The Length
        System.out.println(l);
        String s=strr.toLowerCase();            //variable litteral to LowerCase.
        System.out.println(s);

        String s_high=strr.toUpperCase();  //variable litteral to LowerCase.
        System.out.println(s_high);

        String s_trim=strr.trim();
        System.out.println(s_trim);

        String S_substring=strr.substring(1); 
        System.out.println(S_substring);        

        String S_subs=strr.substring(1,5);
        System.out.println(S_subs);

        String replace=strr.replace('a','o');
        System.out.println(replace);
    }
}
