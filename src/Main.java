import java.util.Arrays;
import java.util.List;

public class Main {
    private static int[]ints={-1,1,0,-3,3};
    public static void main(String[] args) {
        
    }

    private static int[] productExceptSelf(int[] nums) {
        int sum=1;
        int count=0;
        int[]tab=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i==j){
                    sum*=1;
                }else
                sum*=nums[j];

            }

            tab[count]=sum;
            count++;
            sum=1;

        }
        return tab;
    }
}