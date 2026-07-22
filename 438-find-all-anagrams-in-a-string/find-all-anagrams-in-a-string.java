class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res=new ArrayList<>();

        // int[] p_arr=new int[26];
        // for(int i=0;i<p.length();i++){
        //     p_arr[p.charAt(i)-'a']++;
        // }

        // int[] s_arr=new int[26];
        // for(int i=0;i<s.length();i++){
        //     s_arr[s.charAt(i)-'a']++;

        //     if(i>=p.length()){
        //         s_arr[s.charAt(i-p.length())-'a']--;
        //     }

        //     if(Arrays.equals(s_arr,p_arr)){
        //         res.add(i-p.length()+1);
        //     }
            
        // }
        // return res;

        Map<Character,Integer> mp1=new HashMap<>();
        for(int i=0;i<p.length();i++){
            char ch=p.charAt(i);
            mp1.put(ch,mp1.getOrDefault(ch,0)+1);
        }

        Map<Character,Integer> mp2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            mp2.put(ch,mp2.getOrDefault(ch,0)+1);
            if(i>=p.length()){
                char c=s.charAt(i-p.length());
                mp2.put(c,mp2.get(c)-1);
                if(mp2.get(c)<=0){
                    mp2.remove(c);
                }
            }
            if(mp1.equals(mp2)){
                res.add(i+1-p.length());
            }

        }
        return res;

    }
}