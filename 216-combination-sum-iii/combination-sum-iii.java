class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> path=new ArrayList<>();

        backtrack(k,n,1,0,path,res);

        return res;

    }

    public void backtrack(int k,int n,int idx,int sum,List<Integer> path,List<List<Integer>> res){
        if(path.size()==k && sum==n){
            res.add(new ArrayList<>(path));
            return ;
        }

        if(sum>n || path.size()>k){
            return ;
        }

        for(int i=idx;i<=9;i++){
            
            path.add(i);
            sum+=i;
            
            backtrack(k,n,i+1,sum,path,res);
            sum-=path.get(path.size()-1);
            path.remove(path.size()-1);
        }

    }

}