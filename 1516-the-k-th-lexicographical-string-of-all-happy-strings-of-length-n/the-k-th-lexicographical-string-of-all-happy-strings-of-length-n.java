class Solution {
    public String getHappyString(int n, int k) {
        char[] s={'a','b','c'};
        StringBuilder words=new StringBuilder();
        List<String> res=new ArrayList<>();
        backtrack(n,s,words,res);
        Collections.sort(res);
        if(res.size()<k){
            return "";
        }
        return res.get(k-1);

    }

    public void backtrack(int n,char[] s,StringBuilder words,List<String> res){
        if(words.length()==n){
            res.add(words.toString());
            return ;
        }

        for(int i=0;i<3;i++){

            char ch=s[i];
            if(words.length()>0 && words.charAt(words.length()-1)==ch){
                continue;
            }
            words.append(ch);
            backtrack(n,s,words,res);
            words.deleteCharAt(words.length()-1);
        }

    }

}