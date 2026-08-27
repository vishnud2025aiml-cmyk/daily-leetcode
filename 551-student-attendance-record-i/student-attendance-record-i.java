class Solution {
    public boolean checkRecord(String s) {
        int a=0;
        int l=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='A'){
                a++;
            }
            if(ch=='L'){
                l++;
            }
            else if(l>0){
                max=Math.max(max,l);
                l=0;
            }
        }
        max=Math.max(max,l);
        // System.out.println(max);
        if(a<2 && max<3){
            return true; 
        }
        return false;
    }
}