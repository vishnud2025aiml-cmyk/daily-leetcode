class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        Map<Character,Integer> mp1=new HashMap<>();
        for(int i=0;i<licensePlate.length();i++){
            char ch=licensePlate.charAt(i);
            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                mp1.put(Character.toLowerCase(ch),mp1.getOrDefault(Character.toLowerCase(ch),0)+1);
            }

        }

        int min=Integer.MAX_VALUE;
        String res=" ";
        for(int i=0;i<words.length;i++){
            String check=words[i];
            Map<Character,Integer> mp2=new HashMap<>();
            for(int j=0;j<check.length();j++){
                char ch=check.charAt(j);
                if(mp1.get(ch)!=null){
                    mp2.put(ch,mp2.getOrDefault(ch,0)+1);
                }
            }
            boolean ans=true;
            for(char ch:mp1.keySet()){
                if(mp2.get(ch)==null || mp2.get(ch)<mp1.get(ch)){
                    ans=false;
                    break;
                }
            }
            if(ans==true){
                if(check.length()<min){
                    res=check;
                    min=check.length();
                }
            }
            
        }
        return res;



    }
}