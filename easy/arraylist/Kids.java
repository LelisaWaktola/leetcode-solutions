package easy.arraylist;

import java.util.List;
import java.util.ArrayList;

public class Kids {

    public static List<Boolean> kidsWithCandies(int [] candies,int extraCandies){
        ArrayList<Boolean> list= new ArrayList<>();
        int maxCandie=Integer.MIN_VALUE;

        for(int candie: candies){
           if(candie>maxCandie){
               maxCandie=candie;
           }
        }
        for(int candie: candies){
            if(candie+extraCandies>=maxCandie){
                list.add(true);
            }else {
                list.add(false);
            }
        }
      return list;
    }

    public static void main(String[] args) {

        int [] candies= {2,3,4,5,6,7};
        int extraCandies=1;
        System.out.println(kidsWithCandies(candies,extraCandies));
    }
}
