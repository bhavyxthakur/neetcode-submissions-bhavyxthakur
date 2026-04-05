class Solution {
    public List<List<Integer>> combinationSum2(int[] c, int target) {
        List<List<Integer>> r= new ArrayList<>();
        List<Integer> l= new ArrayList<>();
        Arrays.sort(c);
         h(r,l,c,target,0);
         return r;
    }
    public void h(List<List<Integer>> r, List<Integer> l,int[] a,int t, int st){
        if(t<0){
            return;
        }
        if(t==0){
            r.add(new ArrayList<>(l));
            return;
        }
        for(int i=st;i<a.length;i++){
            if(i>st&&a[i]==a[i-1])continue;
            l.add(a[i]);
            h(r,l,a,t-a[i],i+1);
            l.remove(l.size()-1);
        }
    }
}
