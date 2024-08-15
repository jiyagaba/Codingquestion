import java.util.* ;
import java.io.*; 
public class Solution {
    public static int pairSum(int arr[], int n, int target) {
        // Write your code here.
        int count=0;
        boolean found=false;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    count++;
                    found=true;
                }
            }
        }
        if(found)
        {
            return count;
        }
        else
        {
            return -1;
        }
    }
}
