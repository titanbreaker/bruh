/*Problem Statement 13*/
import java.util.*;
class student{
int id;
String name;
public student(int id, String name){
    this.id=id;
    this.name=name;
  }
}
public class HashSetExample{
public static void main(String[] args){
    HashSet<student> set=new HashSet<student>();
    student b1=new student(31,"Amit");
    student b2=new student(32,"Kunal");
    student b3=new student(33,"Tarun");
    set.add(b1);
    set.add(b2);
    set.add(b3);
    //Iterator<student>b=set.iterator();
    //student i=set;
    /*while(a.hasNext()){
      System.out.println(a.id+" "+a.name+" ");
    }*/
    for(student b:set){
    System.out.println(b.id+" "+b.name+" ");
  }
  }
}
