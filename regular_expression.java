public class regular_expression {
    public static void main(String[] args){
        String s=".";
        System.out.println(s.matches(".")); // RE=>"." for characters check

        String sp="a";
        System.out.println(sp.matches("[abc]")); //RE=>"abc" for  ABC characters check.For 1 single character
        
        String sq="T";
        System.out.println(sq.matches("[^abc]")); //RE=>"^abc" for  except ABC characters check.For 1 single character
        
        String sr="r3";
        System.out.println(sr.matches("[a-z][0-9]")); //RE=>"[a-z][0-9]" for  A to Z and 0 to 9 characters check.For per single character.

        String ss="B";
        System.out.println(ss.matches("A|B")); //RE=>"A|B" for  A or B characters check.For 1 single character

        String st="5";
        System.out.println(st.matches("\\d")); //RE=>"\\d" for  digit characters check.For 1 single character
        
        String su="w";
        System.out.println(su.matches("\\D")); //RE=>"\\D" for  any alphabet characters check.For 1 single character
        
        String sv="$";
        System.out.println(sv.matches("\\W")); //RE=>"\\W" for  not characters check.For 1 single character

        String sx="tiger";
        System.out.println(sx.matches("tiger"));
    }
}
