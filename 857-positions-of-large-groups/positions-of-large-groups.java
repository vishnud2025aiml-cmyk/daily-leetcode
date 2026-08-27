class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        int start=0;
        boolean st=true;
        int len=1;
        List<List<Integer>> res=new ArrayList<>();
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            char prev=s.charAt(i-1);
            if(ch==prev){
                len++;
            }
            else{
                if(len>=3){
                    res.add(new ArrayList<>(List.of(start,i-1)));
                }
                len=1;
                start=i;
            }
        }

        if(len>=3){
            res.add(new ArrayList<>(List.of(start,s.length()-1)));
        }
        
        return res;
    }
}