class Solution {
    private int l=0;
    private String res="";
    public String getHappyString(int n, int k) {
        char[] s={'a','b','c'};
        StringBuilder words=new StringBuilder();
        backtrack(k,n,s,words);
        return res;

    }

    public void backtrack(int k,int n,char[] s,StringBuilder words){
        if(words.length()==n){
            l++;
            if(l==k){
                res=words.toString();
            }
            // System.out.println(words.toString());
            return ;
        }

        for(int i=0;i<3;i++){

            char ch=s[i];
            if(words.length()>0 && words.charAt(words.length()-1)==ch){
                continue;
            }
            words.append(ch);
            backtrack(k,n,s,words);
            words.deleteCharAt(words.length()-1);
        }

    }

}