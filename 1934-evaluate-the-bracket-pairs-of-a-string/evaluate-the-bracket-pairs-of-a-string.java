class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String,String> mp=new HashMap<>();

        int n=s.length();
        int m=knowledge.size();

        for(int i=0;i<m;i++){
            mp.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }

        StringBuilder res=new StringBuilder();

        boolean open=false;
        int start=0;
        boolean close=false;
        int end=0;

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                start=i;
                open=true;
            }
            if(ch==')'){
                end=i;
                close=true;
            }
            if(open && close){
                String key=s.substring(start+1,end);
                if(mp.get(key)!=null){
                    res.append(mp.get(key));
                }
                else{
                    res.append('?');
                }
                open=false;
                close=false;
            }
            else if(!open){
                res.append(ch);
            }
        }

        return res.toString();

    }
}