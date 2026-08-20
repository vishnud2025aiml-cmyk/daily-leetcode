class Solution {
    public int[] resultArray(int[] nums) {
        int[] res=new int[nums.length];
        int[] arr1=new int[nums.length-1];
        int[] arr2=new int[nums.length-1];

        int j=0;
        int k=0;

        for(int i=0;i<nums.length;i++){
            if(i==0){
                res[j]=nums[i];
                j++;
                continue;
            }
            if(i==1){
                arr2[k]=nums[i];
                k++;
                continue;
            }
            else if(res[j-1]>arr2[k-1]){
                res[j]=nums[i];
                j++;
            }
            else{
                arr2[k]=nums[i];
                k++;
            }
        }
        
        for(int i=0;i<k;i++){
            res[j]=arr2[i];
            j++;
        }

        return res;


    }
}