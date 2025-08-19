import java.util.*;
public class array {
    public static void main(String []args){
        //syntax for array
        int [] marks = new int[4];
        marks[0]=90;
        marks[1]=80;
        marks[2]=70;
        int total=marks[0]+marks[1]+marks[2];
        System.out.println(total);
        //method in array
        System.out.println(marks.length);
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);

        int[] mark = {110,90,100};
        Arrays.sort(mark);
        System.out.println(mark[1]);
        //constant
        final float pie=3.14f;
        //math
        //max():
        System.out.println(Math.max(1,2));
        //min():
        System.out.println(Math.min(1,2));
        //.random()
        System.out.println((int)(Math.random()*100));
        //if else condition
        int age =19;
        if(age>18){
            System.out.println("Can vote");
        }
        else{
            System.out.println("Can't vote");
        }
    }
}