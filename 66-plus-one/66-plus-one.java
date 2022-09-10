class Solution {
    public int[] plusOne(int[] digits) {
        int i=digits.length-1;
         while(i>=0){
             if(digits[i]==9){
                 digits[i]=0;
             }else{
                 digits[i]=digits[i]+1;
                 break;
             }
             i--;
         }
        int k=0;
        if(digits[0]==0){
            int res[]= new int[digits.length+1];
            res[0]=1;
            
            return res;
        }
        return digits;
    }
}