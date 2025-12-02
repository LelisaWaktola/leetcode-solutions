package easy.hashset;

import java.util.*;

public class ContainsDuplicate {


    public static boolean containsDuplicate(int [] nums){
        HashSet<Integer> set= new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
    public static void main(String [] args){
        int [] nums={1,2,1,4};
        boolean result=ContainsDuplicate.containsDuplicate(nums);
        System.out.println(result);

        LinkedList<Integer> list= new LinkedList<>();

     }
}
