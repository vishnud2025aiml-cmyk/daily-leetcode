class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> res=new ArrayList<>();
        for(int i=0;i<l.length;i++){
            int[] ans=Arrays.copyOfRange(nums,l[i],r[i]+1);
            Arrays.sort(ans);
            boolean check=true;
            for(int j=0;j<ans.length-1;j++){
                if(ans[j+1]-ans[j]!=ans[1]-ans[0]){
                    check=false;
                    break;
                }
            }
            res.add(check);
        }
        return res;
    }
}