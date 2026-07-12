class Solution {
    public int[] sortByReflection(int[] nums) {
        int[] res=new int[nums.length];
        List<int[]>pairs=new ArrayList<>();
        for(int x:nums){
            String bin = new StringBuilder(Integer.toBinaryString(x)).reverse().toString();
            int val=Integer.parseInt(bin,2);
            pairs.add(new int[]{val,x});
        }

        Collections.sort(pairs,(a,b)-> {
            if(a[0]!=b[0]){
                return Integer.compare(a[0],b[0]);
            }
            return Integer.compare(a[1],b[1]);
        });

        for(int i=0;i<pairs.size();i++){
            res[i]=pairs.get(i)[1];
        }
        return res;

    }
}