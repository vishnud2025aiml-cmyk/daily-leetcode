class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer,List<Integer>> mp=new HashMap<>();

        int max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            if(!mp.containsKey(nums[i])){
                List<Integer> list=new ArrayList<>();
                list.add(i);
                mp.put(nums[i],list);
            }
            else{
               mp.get(nums[i]).add(i);
            }
        }

        int[] check=new int[max+1];

        for(int i=0;i<nums.length;i++){
            check[nums[i]]++;
        }

        int min=Integer.MAX_VALUE;
        for(int i=0;i<check.length;i++){
            if(check[i]>=3){
                List<Integer> res=mp.get(i);
                for(int j=0;j<res.size();j++){
                    if(j+2>=res.size()){
                        break;
                    }
                    int a=res.get(j);
                    int b=res.get(j+1);
                    int c=res.get(j+2);

                    min=Math.min(Math.abs(a-b)+Math.abs(b-c)+Math.abs(c-a),min);
                }      
            }
        }
        if(min==Integer.MAX_VALUE){
            return -1;
        }
        return min;

    }
}