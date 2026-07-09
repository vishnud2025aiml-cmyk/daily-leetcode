class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();

        List<String> path=new ArrayList<>();

        backtrack(0,s,path,res);

        return res;

    }

    public void backtrack(int idx,String s,List<String> path,List<List<String>> res){

        if(idx==s.length()){
            res.add(new ArrayList<>(path));
            return ;
        }

        for(int i=idx;i<s.length();i++){
            
            String ans=s.substring(idx,i+1);

            if(ispalindrome(ans)){
                path.add(ans);
                backtrack(i+1,s,path,res);
                path.remove(path.size()-1);
            }
        }
        
    }

    public boolean ispalindrome(String s){
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

}