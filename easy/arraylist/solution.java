package easy.arraylist;

import java.util.ArrayList;
import java.util.List;

public class solution {

    public static int[] createTargetArray(int [] nums, int [] index){

        List<Integer> target= new ArrayList<>();
        for(int i=0; i< nums.length; i++){
            target.add(index[i], nums[i]);
        }

        int [] result= new int[target.size()];
        for(int i=0;i< result.length;i++){
            result[i]=target.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int [] nums= {0,1,2,3,4};
        int [] index={0,1,2,2,1};
        int [] result= createTargetArray(nums,index);
        for(int results: result) System.out.println(results);
    }

}































