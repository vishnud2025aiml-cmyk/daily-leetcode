class Solution {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        List<Integer> res=new ArrayList<>();
        boolean[] inc=new boolean[security.length];
        boolean[] dec=new boolean[security.length];

        if(time==0){
            for(int i=0;i<security.length;i++){
                res.add(i);
            }
            return res;
        }

        int count=0;
        for(int i=1;i<security.length;i++){
            if(security[i]<=security[i-1]){
                count++;
            }
            else{
                count=0;
            }
            if(count>=time){
                dec[i]=true;
            }
        }

        count=0;
        for(int i=security.length-2;i>=0;i--){
            if(security[i]<=security[i+1]){
                count++;
            }
            else{
                count=0;
            }
            if(count>=time){
                inc[i]=true;
            }
        }

        for(int i=0;i<security.length;i++){
            if(inc[i] && dec[i]){
                res.add(i);
            }
        }

        return res;
        

    }
}