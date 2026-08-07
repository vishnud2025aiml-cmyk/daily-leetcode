class Solution {
    public String getHint(String secret, String guess) {
        
        Map<Character,Integer> mp1=new HashMap<>();
        Map<Character,Integer> mp2=new HashMap<>();
        int bull=0;
        int cow=0;
        for(int i=0;i<secret.length();i++){
            char ch1=secret.charAt(i);
            char ch2=guess.charAt(i);
            if(ch1==ch2){
                bull++;
            }
            mp1.put(ch1,mp1.getOrDefault(ch1,0)+1);
            mp2.put(ch2,mp2.getOrDefault(ch2,0)+1);
        }

        boolean[] visited=new boolean[1000];
        for(int i=0;i<guess.length();i++){
            char ch=guess.charAt(i);
            if(visited[(int) ch]==true){
                continue;
            }
            if(mp1.get(ch)!=null && mp2.get(ch)!=null){
                cow+=Math.min(mp1.get(ch),mp2.get(ch));
            }
            visited[(int) ch]=true;
        }
        cow-=bull;
        System.out.println(bull);
        System.out.println(cow);

        return bull + "A"+ cow + "B";

    }
}