class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count=0;
        for(int x:arr1){
            if(!search(x,arr2,d)){
                count++;
            }
        }
        return count;

    }

    public boolean search(int val,int[] arr,int d){
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(Math.abs(arr[mid]-val)<=d){
                return true;
            }
            if(arr[mid]<val){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return false;
    }

}