class Solution {
    public int minChanges(String s) {
        
        char[] str=s.toCharArray();

        int count=0;
        for(int i=0;i<str.length;i+=2){
            if(str[i]!=str[i+1]){
                count++;
            }
        }
        return count;

    }
}