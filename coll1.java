//Write a Java program to create a new array list, add some colors (string) and print out the collection. 
import java.util.*;
public class Main{
  public static void main(String args[]){
    List<String> list=new ArrayList<String>();
    list.add("Red");
     list.add("White");
    System.out.println(list);
    for(String a:list)
    System.out.println(a);
  }
}

/*OutPut
  [Red, White]
  Red
White
*/
