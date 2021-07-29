public class StringClass_three {
    public static void main(String[] args){
        String str="Md.Abir Hasan";

        String st="Name :";
        for(int i=2; i<str.length(); i++){
            System.out.print(str.charAt(i));
        }
        System.out.println("");
        //use of concat class
        System.out.println(st.concat(str));     //concat brings two strings in a single string. 

    }
}
