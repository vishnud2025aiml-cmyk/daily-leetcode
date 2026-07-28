class Solution {
    public String smallestPalindrome(String s) {
        
        if(s.length()==1){
            return s;
        }

        int n=s.length();
        int[] freq=new int[26];

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
        }

        StringBuilder left=new StringBuilder();
        StringBuilder mid=new StringBuilder();

        for(int i=0;i<26;i++){
            for(int j=0;j<freq[i]/2;j++){
                left.append((char) (i+'a'));
            }
            if(freq[i]%2==1){
                mid.append((char) (i+'a'));
            }
        }

        StringBuilder right=new StringBuilder(left).reverse();

        left.append(mid).append(right);

        String ans=new String(left);
        
        return ans;

        
    }
}