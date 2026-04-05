class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> r= new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        h(nums,r,l,0);
        return r;
    }
    public void h(int[] a,List<List<Integer>> r,List<Integer> l,int st){
        r.add(new ArrayList<>(l));
        for(int i=st;i<a.length;i++){
            l.add(a[i]);
            h(a,r,l,i+1);
            l.remove(l.size()-1);
        }
        return;
    }
}
