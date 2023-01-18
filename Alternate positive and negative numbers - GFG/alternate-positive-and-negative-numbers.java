//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java




 class Solution {
    void rearrange(int arr[], int n) {
       ArrayList<Integer> al= new ArrayList<>();
       ArrayList<Integer> al1= new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                al.add(arr[i]);
            }
            if(arr[i]<0){
                al1.add(arr[i]);
            }
        }
        int j=0,k=0;
        while(j<n){
            if(k<al.size()){
                arr[j++]=al.get(k);
            }
            if(k<al1.size()){
                arr[j++]=al1.get(k);
            }
            k++;
        }
         int np=0;
        int nn=0;
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]>=0)
            pos.add(arr[i]);
            else
            neg.add(arr[i]);
        }
        while(nn<n){
            if(np<pos.size()){
                arr[nn++]=pos.get(np);
            }
            if(np<neg.size()){
              arr[nn++]=neg.get(np);
            }
            np++;
        }
    }
}