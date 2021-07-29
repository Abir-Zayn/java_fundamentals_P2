public class StringClass_two {
    public static void main(String[] args){
        String str="www.example.com";
        
        //use of StartsWith
        System.out.println("use of StartsWith");
        System.out.println(str.startsWith("www"));

        //use of endsWith
        System.out.println("use of endsWith");
        System.out.println(str.endsWith("org"));

        //equals ignoreCase
        String s="HI";
        String SH="hi";
        String SHJ="Hello";
        System.out.println("Use of EqualsIgnoreCase");
        System.out.println(s.equalsIgnoreCase(SH));

        // Use of Contains
        System.out.println("Use of Contains");
        System.out.println(SHJ.contains("hi"));
    }
}
