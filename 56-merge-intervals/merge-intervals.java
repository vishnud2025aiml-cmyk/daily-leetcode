class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));

        List<List<Integer>> res=new ArrayList<>();

        int start=intervals[0][0];
        int prev=intervals[0][1];

        int index=0;
        for(int i=1;i<intervals.length;i++){
            int check=intervals[i][0];
            if(prev>=check){
                prev=Math.max(prev,intervals[i][1]);
            }
            else{
                List<Integer> temp=new ArrayList<>();
                temp.add(start);
                temp.add(prev);
                res.add(temp);

                start=intervals[i][0];
                prev=intervals[i][1];
            } 

        }

        List<Integer> temp=new ArrayList<>();
        temp.add(start);
        temp.add(prev);
        res.add(temp);


        int[][] ans=new int[res.size()][2];

        for(int i=0;i<res.size();i++){
            
            ans[i][0]=res.get(i).get(0);
            ans[i][1]=res.get(i).get(1);
        }


        return ans;

    }
}