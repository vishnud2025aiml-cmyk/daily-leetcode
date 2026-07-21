class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> s=new Stack<>();
        StringBuilder res=new StringBuilder();

        int check=0;
        for(int i=0;i<num.length();i++){
            char ch=num.charAt(i);
            int val=ch-'0';
            while(!s.isEmpty() && s.peek()>val && check<k){
                s.pop();
                check++;
            }
            s.add(val);
        }

        while(check<k){
            s.pop();
            check++;
        }

        for(int ch:s){
            res.append(ch);
        }
        
        while(res.length()>0 && res.charAt(0)=='0'){
            res.deleteCharAt(0);
        }

        if(res.length()==0){
            return "0";
        }

        return res.toString();
        
        

    }
}