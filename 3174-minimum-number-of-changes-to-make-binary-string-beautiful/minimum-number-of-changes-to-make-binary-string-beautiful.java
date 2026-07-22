class Solution {
    public int minChanges(String s) {
        
        char[] str=s.toCharArray();

        int one=0;
        int count=0;
        char prev=str[0];
        for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
            if(str[i]==prev){
                one++;
            }
            else{
                if(one%2==0){
                    prev=str[i];
                    one=1;
                    continue;
                }
                else{
                    one++;
                    count++;
                    str[i]=prev;
                }
            }
            prev=str[i];
        }

        if(one%2==1){
            count++;
        }
        return count;


    }
}