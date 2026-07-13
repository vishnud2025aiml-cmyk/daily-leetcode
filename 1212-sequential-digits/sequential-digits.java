class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res=new ArrayList<>();
        
        for(int i=1;i<=9;i++){
            StringBuilder s=new StringBuilder();
            for(int j=i;j<=9;j++){
                s.append(j);
                String ans=s.toString();
                int val=Integer.parseInt(ans);
                if(val>=low && val<=high){
                    res.add(val);
                }
                else if(val>high){
                    break;
                }
            }
        }
        Collections.sort(res);

        return res;
    }
}