class Solution {
    public int countAsterisks(String s) {
        String[] ans=s.split("\\|");
        int count=0;
        for(int i=0;i<ans.length;i+=2){
            String check=ans[i];
            for(int j=0;j<check.length();j++){
                if(check.charAt(j)=='*'){
                    count++;
                }
            }
        }
        return count;

    }
}