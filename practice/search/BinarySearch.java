package practice.search;

public class BinarySearch {

    public static int binarySearch(int [] array, int target){
        int left=0;
        int right=array.length;

        while (left<=right){
            int mid =(left+right)/2;
            if(array[mid]==target){
                return mid;
            } else if (array[mid]>target) {
                right=mid;
            }else if(array[mid]<target){
                left=mid+1;
            }
        }
        return -1;
    }
    public static void main(String [] args){

        int [] array= {1,4,3,6,8,23,9,12};

        System.out.println(BinarySearch.binarySearch(array,3));;
    }
}
