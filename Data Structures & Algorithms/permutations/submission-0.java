class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> r=new ArrayList<>();
        List<Integer> l= new ArrayList<>();
        boolean[] v=new boolean[nums.length];
        h(nums,r,l,0,v);
        return r;
    }
    public void h(int[] a,List<List<Integer>> r,List<Integer> l,int st,boolean[] v){
        if(st==a.length){
            r.add(new ArrayList<>(l));
            return;
        }
        for(int i=0;i<a.length;i++){
            if(v[i]) continue;
            v[i]=true;
            l.add(a[i]);
            h(a,r,l,st+1,v);
            l.remove(l.size()-1);
            v[i]=false;
        }
    }
}
