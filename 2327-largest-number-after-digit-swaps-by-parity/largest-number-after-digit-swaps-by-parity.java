class Solution {
    public int largestInteger(int num) {

        String s=Integer.toString(num);
        char[] arr=s.toCharArray();

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j] && (arr[i]-'0')%2==(arr[j]-'0')%2){
                    char temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        int res=Integer.parseInt(String.valueOf(arr));
        return res;

        
    }
}