class Solution {
    public int lengthOfLastWord(String s) {
        String d[]=s.split(" ");
        int n=d.length;
        String f=d[n-1];
       int m= f.length();
        return m;
    }
}