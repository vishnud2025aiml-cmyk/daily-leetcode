class Solution {
    public int minDeletions(String s) {
        Map<Character,Integer> freq=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }

        int count=0;

        Set<Integer> set=new HashSet<>();
        for(int x:freq.values()){
            while(x>0 && set.contains(x)){
                x--;
                count++;
            }
            set.add(x);

        }

        return count;



    }
}