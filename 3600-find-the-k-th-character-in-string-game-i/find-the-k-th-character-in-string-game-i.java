class Solution {
    public char kthCharacter(int k) {
        StringBuilder res=new StringBuilder("a");

        while(res.length()<k){
            int n=res.length();
            for(int i=0;i<n;i++){
                char ans = (char) (((res.charAt(i)-'a')+1)%26 + 'a');
                res.append(ans);
            }
        }

        return res.charAt(k-1);
        

    }
}