class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character,Integer> mp=new HashMap<>();
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            mp.put(ch,i);
        }

        int start=0;
        while(start<s.length()){
            int len=mp.get(s.charAt(start));
            for(int i=start;i<len;i++){
                len=Math.max(mp.get(s.charAt(i)),len);
            }
            res.add(len-start+1);
            start=len+1;
        }
        return res;
        

    }
}