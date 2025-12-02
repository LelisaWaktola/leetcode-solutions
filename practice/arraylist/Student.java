package practice.arraylist;

import java.util.List;
import java.util.ArrayList;
public class Student {

    public String name;
    public int age;

    public Student(String name, int age){
        this.name=name;
        this.age=age;
    }

    public static void main(String [] args ){
        List<Student> students= new ArrayList<>();
        List<Integer> nums= new ArrayList<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

//        nums.stream().filter(n->n>=3).forEach(System.out::println);

//        nums.stream().map(n->n*2).forEach(System.out::println);
        System.out.println(nums);

        Object[] array= nums.toArray();
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }

    }
}




























