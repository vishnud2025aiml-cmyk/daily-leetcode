class Solution {
    public int maxScore(String s) {
        int one=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='1'){
                one++;
            }
        }

        StringBuilder prefix=new StringBuilder();
        int score=0;
        int o=0;
        int z=0;
        for(int i=0;i<s.length()-1;i++){
            char ch=s.charAt(i);
            prefix.append(ch);
            if(ch=='1'){
                o++;
            }
            if(ch=='0'){
                z++;
            }
            score=Math.max(score,z+one-o);
        }
        return score;

    }
}