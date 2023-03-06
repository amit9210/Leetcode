//{ Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
       HashMap<Integer,Integer>map = new HashMap<>();
        int sum=0;
        int start=0;
        int end=-1;
        int max=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0){
                start=0;
                end=i;
                max=Math.max(max,end-start+1);
            }
            if(map.containsKey(sum)){
                start=map.get(sum)+1;
                end=i;
                max=Math.max(max,end-start+1);
            }
            else{
                map.put(sum,i);
            }
        }
        return max;
    }
}