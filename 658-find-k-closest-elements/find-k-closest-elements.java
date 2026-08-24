class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> res=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            if(i<k){
                res.add(arr[i]);
            }
            else{
                if(Math.abs(res.get(0)-x)>Math.abs(arr[i]-x)){
                    res.remove(0);
                    res.add(arr[i]);
                }
            }
        }
        Collections.sort(res);
        return res;
        
    }
}