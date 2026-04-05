class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> mp = new HashMap<>();
        int i=0;
        int j=0;
        int mx=0;
        while(j<s.length()){
         mp.put(s.charAt(j),mp.getOrDefault(s.charAt(j),0)+1);
         if(j-i+1==mp.size()){
            mx=Math.max(mx,j-i+1);
            j++;
         }
         else if(j-i+1>mp.size()){
            while(j-i+1>mp.size()){
                int a=mp.get(s.charAt(i));
                if(a==1){ mp.remove(s.charAt(i));}
                else{

                mp.put(s.charAt(i),--a);}
                i++;


            }
            mx=Math.max(mx,j-i+1);
           
            j++;


         }

        }
        return mx;
    }
}
