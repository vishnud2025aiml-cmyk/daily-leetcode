class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] s=text.split(" ");
        List<String> res=new ArrayList<>();
        
        for(int i=1;i<s.length-1;i++){
            if(s[i-1].equals(first) && s[i].equals(second)){
                res.add(s[i+1]);
            }
        }
        
        String[] ans=new String[res.size()];
        for(int i=0;i<res.size();i++){
            ans[i]=res.get(i);
        }
        return ans;

    }
}