class Solution {
    public boolean isPrefixString(String s, String[] words) {
        int start=0;
        for(int i=0;i<words.length;i++){
            if(start>=s.length()){
                break;
            }
            String word=words[i];
            if(start + word.length()>s.length()){
                return false;
            }
            String sub=s.substring(start,start+word.length()); 
            // System.out.println(sub);
            if(!word.equals(sub)){
                return false;
            }
            start+=word.length();
        }
        return start==s.length();
    }
}