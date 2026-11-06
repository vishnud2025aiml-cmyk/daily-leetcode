class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] freq=new int[10];
        for(int x:digits){
            freq[x]++;
        }
        List<Integer> ans=new ArrayList<>();
        int count=0;
        for(int i=100;i<=998;i+=2){
            int[] check=new int[10];
            int a=i%10;
            int b=(i/10)%10;
            int c=i/100;
            check[a]++;
            check[b]++;
            check[c]++;
            if(freq[a]<check[a] || freq[b]<check[b] || freq[c]<check[c]){
                continue;
            }
            else{
                ans.add(i);
            }
        }

        int[] res=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            res[i]=ans.get(i);
        }
        return res;
        
    }
}