//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(m, n, s);
            for(int ii = 0;ii<res.size();ii++)
                System.out.print(res.get(ii) + " ");
            System.out.println();
        }
    }

}
// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        HashMap<Integer,Integer>map= new HashMap<>();
        ArrayList<Integer>al= new ArrayList<>();
        int currsum=0;
        int start =0;
        int end=-1;
        for(int i=0;i<arr.length;i++){
            currsum+=arr[i];
            if(currsum-s==0){
                start=1;
                end=i+1;
                break;
            }
            if(map.containsKey(currsum-s)){
                start=map.get(currsum-s)+2;
                end=i+1;
                break;
            }
            map.put(currsum,i);
        }
        if(end==-1){
            al.add(-1);
            return al;
        }
        
        al.add(start);
        al.add(end);
        return al;
    }
}