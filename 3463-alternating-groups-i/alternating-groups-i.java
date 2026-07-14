class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int n=colors.length;
        int first=colors[0];
        int last=colors[n-1];

        int count=0;
        for(int i=0;i<n;i++){
            if(i==0){
                if(colors[i]!=colors[i+1] && colors[i]!=last){
                    count++;
                }
            }
            else if(i==n-1){
                if(colors[i]!=colors[i-1] && colors[i]!=first){
                    count++;
                }
            }
            else{
                if(colors[i]!=colors[i-1] && colors[i]!=colors[i+1]){
                    count++;
                }
            }
            
        }
        return count;

    }
}