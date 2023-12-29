import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.print.FlavorException;

public class SetTest {
    public static void main(String args[]){
        TreeSet<String> stringList=new TreeSet<>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        stringList.add("C");

        for(String s:stringList){
            System.out.println(s);
        }

        System.out.println(stringList.tailSet("C", true));
        System.out.println(stringList.headSet("B", false));
        System.out.println(stringList.descendingSet());
        System.out.println(stringList);

    }
}

class Product implements Comparable<Product>{
    int pid;
    String pName;
    String pLocation;

    public Product( int pid,String pName,String pLocation){
        this.pid=pid;
        this.pName=pName;
        this.pLocation=pLocation;
    }
}


