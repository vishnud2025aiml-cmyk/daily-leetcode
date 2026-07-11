class Solution {
    public int findChampion(int n, int[][] edges) {
        int res=-1;
        
        List<Integer> check=new ArrayList<>();
        for(int[] list:edges){
            check.add(list[1]);
        }

        int count=0;
        for(int i=0;i<n;i++){
            if(!check.contains(i)){
                res=i;
                count++;
            }
        }
        if(count==1){
            return res;
        }
        else{
            return -1;
        }

    }
}