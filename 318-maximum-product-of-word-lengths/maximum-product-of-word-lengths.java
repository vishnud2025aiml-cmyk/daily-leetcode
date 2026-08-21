class Solution {
    public int maxProduct(String[] words) {
        
        Map<String,boolean[]> mp=new HashMap<>();
        for(String word:words){
            boolean[] freq=new boolean[26];
            for(int i=0;i<word.length();i++){
                char ch=word.charAt(i);
                freq[ch-'a']=true;
            }
            mp.put(word,freq);
        }

        int max=0;
        for(int i=0;i<words.length;i++){
            boolean[] freq=mp.get(words[i]);
            for(int j=0;j<words.length;j++){
                String word=words[j];
                boolean check=true;
                for(int k=0;k<word.length();k++){
                    char ch=word.charAt(k);
                    if(freq[ch-'a']==true){
                        check=false;
                        break;
                    }
                }
                if(check){
                    max=Math.max(max,words[i].length()*word.length());
                }
            }
        }
        return max;

    }
}