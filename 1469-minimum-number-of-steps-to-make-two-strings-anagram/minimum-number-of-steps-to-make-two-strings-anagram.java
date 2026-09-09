class Solution {
    public int minSteps(String s, String t) {
        Map<Character,Integer> mp1=new HashMap<>();
        Map<Character,Integer> mp2=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);

            mp1.put(ch1,mp1.getOrDefault(ch1,0)+1);
            mp2.put(ch2,mp2.getOrDefault(ch2,0)+1);
        }

        int count=0;

        for(char ch:mp2.keySet()){
            if(!mp1.containsKey(ch)){
                count+=mp2.get(ch);
            }
            else if(mp1.containsKey(ch) && mp2.get(ch)>mp1.get(ch)){
                count+=(mp2.get(ch)-mp1.get(ch));
            }
            
        }

        return count;

    }
}