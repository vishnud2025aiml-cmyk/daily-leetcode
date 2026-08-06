class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count=new int[1001];
        for(int x:arr1){
            count[x]++;
        }

        int[] res=new int[arr1.length];
        int index=0;
        for(int x:arr2){
            while(count[x]>0){
                res[index++]=x;
                count[x]--;
            }
        }

        for(int i=0;i<=1000;i++){
            
            while(count[i]>0){
                res[index++]=i;
                count[i]--;
            }
        }
        return res;

    }
}