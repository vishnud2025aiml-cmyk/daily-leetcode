class Solution {
    public String toGoatLatin(String sentence) {
        String[] s=sentence.split(" ");
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length;i++){
            StringBuilder word=new StringBuilder(s[i]);
            char ch=word.charAt(0);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                word.append("ma");
            }
            else{
                word.append(ch);
                word.append("ma");
                word.deleteCharAt(0);
            }
            word.append("a".repeat(i+1));
            res.append(word);
            res.append(" ");
        }
        res.deleteCharAt(res.length()-1);
        return res.toString();
        
    }
}