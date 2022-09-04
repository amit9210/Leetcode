class Solution {
    public boolean isPalindrome(int x) {
        int reverse =0;
        int k=x;
        if(x<0){
            return false;
        }
        else{
        while(x!=0){
            int o=0;
            o=x%10;
     reverse=(reverse*10)+o;
        x=x/10;
        }
        }
        if(reverse == k){
            return true;
        }
        return false;
    }
}