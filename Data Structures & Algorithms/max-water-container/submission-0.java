class Solution {
    public int maxArea(int[] h) {
        int i=0;
        int j=h.length-1;
        int mx=0;
        while(i<j){
       int l=j-i;
       int b=Math.min(h[i],h[j]);
       int y=l*b;
       mx=Math.max(mx,y);
       if(h[i]<h[j]){
        i++;
       }
       else{
        j--;
       }
        }
        return mx;
    }
}
