class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> path=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        backtrack(0,nums,path,res);
        return res;
    }

    public void backtrack(int idx,int[] nums,List<Integer> path,List<List<Integer>> res){
        res.add(new ArrayList<>(path));
        if(path.size()==nums.length){
            return ;
        }
        for(int i=idx;i<nums.length;i++){
            path.add(nums[i]);
            backtrack(i+1,nums,path,res);
            path.remove(path.size()-1);
        }
    }

}