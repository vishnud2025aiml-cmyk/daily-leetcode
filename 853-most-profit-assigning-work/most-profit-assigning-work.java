class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int[][] jobs=new int[profit.length][2];

        for(int i=0;i<profit.length;i++){
            jobs[i][0]=difficulty[i];
            jobs[i][1]=profit[i];
        }

        Arrays.sort(jobs , (a,b) -> Integer.compare(a[0],b[0]));

        for(int i=0;i<profit.length;i++){
            difficulty[i]=jobs[i][0];
            profit[i]=jobs[i][1];
        }

        for(int i=1;i<profit.length;i++){
            profit[i]=Math.max(profit[i-1],profit[i]);
        }

        int total=0;

        for(int x:worker){
            int ans=level(x,difficulty);
            if(ans==-1){
                continue;
            }
            total+=profit[ans];
        }

        return total;

    }

    public int level(int val,int[] difficulty){
        int l=0;
        int h=difficulty.length-1;
        int ans=-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(difficulty[mid]<=val){
                ans=mid;
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return ans;
    }

}