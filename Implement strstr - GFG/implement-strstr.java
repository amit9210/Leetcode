// { Driver Code Starts
import java.util.*;


class Implement_strstr
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String line = sc.nextLine();
			String a = line.split(" ")[0];
			String b = line.split(" ")[1];
			
			GfG g = new GfG();
			System.out.println(g.strstr(a,b));
			
			t--;
		}
	}
}// } Driver Code Ends


class GfG
{
    //Function to locate the occurrence of the string x in the string s.
    int strstr(String s, String x)
    {
       // Your code here
       int a=x.length();
       int p=0;
      /* char c=x.charAt(0);
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)==c){
               p=i;
           if((s.substring(p,a)).equals(x)){
               return p;
           }
       }
       }*/
       int i=0,j=x.length();
       while(j<=s.length()){
           if((s.substring(i,j)).equals(x)){
               return i;
           }
           i++;
           j++;
       }
       return -1;
}
}