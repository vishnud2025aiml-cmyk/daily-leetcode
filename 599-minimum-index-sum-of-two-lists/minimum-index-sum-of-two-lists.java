class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer> mp1=new HashMap<>();
        Map<String,Integer> mp2=new HashMap<>();
        for(int i=0;i<list1.length;i++){
            mp1.put(list1[i],i);
        }
        for(int i=0;i<list2.length;i++){
            mp2.put(list2[i],i);
        }   
        List<String> res=new ArrayList<>();
        int check=answer(list1,mp1,mp2,res,0);
        if(check==0){
            return new String[]{list1[0]};
        }
        answer(list1,mp1,mp2,res,check);
        String[] ans=new String[res.size()];
        for(int i=0;i<res.size();i++){
            ans[i]=res.get(i);
        }
        return ans;
        
    }
    public static int answer(String[] list1,Map<String,Integer> mp1,Map<String,Integer> mp2,List<String>res,int check){
        int sum=Integer.MAX_VALUE;
        for(String word:list1){
            if(mp1.get(word)!=null && mp2.get(word)!=null){
                int total=mp1.get(word)+mp2.get(word);
                if(sum>total){
                    sum=total;
                }
                if(check==total){
                    res.add(word);
                }
            }
        } 
        return sum;
    }
}