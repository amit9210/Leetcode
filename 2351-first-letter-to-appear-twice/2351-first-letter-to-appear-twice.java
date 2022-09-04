class Solution {
    public char repeatedCharacter(String s) {
        char c=' ';
        HashMap<Character,Integer>map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                 c=s.charAt(i);
                return c;
            }
               else{
                   map.put(s.charAt(i),0);
               }
        }
        return c;
    }
              
}