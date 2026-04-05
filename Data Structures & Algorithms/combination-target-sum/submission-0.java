class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> r= new ArrayList<>();
        List<Integer> l= new ArrayList<>();
         h(r,l,nums,target,0);
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
            l.add(a[i]);
            h(r,l,a,t-a[i],i);
            l.remove(l.size()-1);
        }
    }
}
