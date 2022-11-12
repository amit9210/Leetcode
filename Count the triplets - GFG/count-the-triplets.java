//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            int n = Integer.parseInt(read.readLine());
            String input[] = read.readLine().split(" ");
            
            int arr[] = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = Integer.parseInt(input[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.countTriplet(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int countTriplet(int arr[], int n) {
        Arrays.sort(arr);
        int count =0,temp=0;  // 1 2 3 5
        for(int i= n-1;i>=0;i--){
            temp=arr[i];
            int a=0,b=i-1;
            while(a<b){
                if(temp==arr[a]+arr[b]){
                    count++;
                    a++;
                    b++;
                }
                else if(temp<arr[a]+arr[b]){
                    b--;
                }
                else{
                    a++;
                }
            }
        }
        return count;
        
    }
}