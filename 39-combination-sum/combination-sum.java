class Solution {
    public List<List<Integer>> combinationSum(int[] candi , int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> path=new ArrayList<>();

        backtrack(candi,0,0,target,path,res);

        return res;

    }

    public void backtrack(int[] candi,int idx,int sum,int target,List<Integer> path,List<List<Integer>> res){
        if(sum==target && !res.contains(path)){
            res.add(new ArrayList<>(path));
            return ;
        }
        if(sum>target || idx==candi.length){
            return ;
        }

        for(int i=idx;i<candi.length;i++){
            path.add(candi[i]);
            sum+=candi[i];
            backtrack(candi,i,sum,target,path,res);
            sum-=path.get(path.size()-1);
            path.remove(path.size()-1);

        }


    }

}