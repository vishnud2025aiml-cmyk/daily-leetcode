class Solution {
    public int minimumPushes(String word) {

        Integer[] freq=new Integer[26];
        Arrays.fill(freq,0);
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            freq[ch-'a']++;
        }

        Arrays.sort(freq,Collections.reverseOrder());

        int ans=0;
        for(int i=0;i<freq.length;i++){
            if(i<8){
                ans+=(freq[i]);
            }
            else if(i<16){
                ans+=(freq[i]*2);
            }
            else if(i<24){
                ans+=(freq[i]*3);
            }
            else{
                ans+=(freq[i]*4);
            }
        }
        return ans;

    }
}