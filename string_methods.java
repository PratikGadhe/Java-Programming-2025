public class string_methods {
    public static void main(String []args){
        //string methods
        //1.concatenate
        String name1 = "pratik";
        String name2 = "Gadhe";
        String name3 = name1 + " Vilas " + name2 ;
        System.out.println(name3);
        //charAt
        System.out.println(name1.charAt(2));
        //length
        System.out.println(name3.length());
        //replace
        System.out.println(name3.replace("pratik","Sanket"));
        //substring
        System.out.println(name3.substring(0,7));
        //STRINGS ARE IMMUTABLE
    }
}
