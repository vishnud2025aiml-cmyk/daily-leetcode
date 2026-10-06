class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> res=new ArrayList<>();
        Map<String,Integer> mp=new HashMap<>();
        for(String str:cpdomains){
            String[] ans=str.split(" ");
            String val=ans[0];
            String id=ans[1];
            String[] domain=id.split("\\.");
            String curr="";
            for(int i=domain.length-1;i>=0;i--){
                if(curr.equals("")){
                    curr=domain[i];
                }
                else{
                    curr=domain[i]+"."+curr;
                }
                if(!mp.containsKey(curr)){
                    mp.put(curr,Integer.parseInt(val));
                }
                else{
                    mp.put(curr,mp.get(curr)+Integer.parseInt(val));
                }
            }
        }
        

        for(Map.Entry<String,Integer> entry:mp.entrySet()){
            String key=entry.getKey();
            int val=entry.getValue();
           
            res.add(String.valueOf(val)+" "+key);
            
        }

        return res;

    }
}