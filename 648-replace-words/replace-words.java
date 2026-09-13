class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String arr[]=sentence.split(" ");
        StringBuilder res=new StringBuilder();

        for(String word:arr){
            String ans=word;
            for(String str:dictionary){
                if(ans.length()>=str.length()){
                    if(ans.substring(0,str.length()).equals(str)){
                        ans=str;
                    }
                }
            }
            res.append(ans).append(" ");
            
        }

        res.deleteCharAt(res.length()-1);

        return res.toString();

        
    }
}