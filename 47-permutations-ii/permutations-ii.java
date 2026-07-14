class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        boolean[] visited=new boolean[nums.length];
        Arrays.sort(nums);
        backtrack(nums,path,res,visited);
        return res;
    }

    public void backtrack(int[] nums,List<Integer> path,List<List<Integer>> res,boolean[] visited){
        if(path.size()==nums.length){
            res.add(new ArrayList<>(path));
            return ;
        }

        for(int i=0;i<nums.length;i++){
            if(visited[i]==true) continue;

            // !visited[i-1]  this condition is used to If the current number is the same as the previous one, always skip it."This is too aggressive. It prevents the algorithm from picking the same number twice even when it is logically allowed to do so (i.e., at different positions in the final permutation)

            if(i>0 && nums[i]==nums[i-1] && !visited[i-1]){
                continue;
            }

            path.add(nums[i]);
            visited[i]=true;
            backtrack(nums,path,res,visited);
            path.remove(path.size()-1);
            visited[i]=false;
        }

    }

}