class Solution {
    public boolean checkZeroOnes(String s) {
        int one=0;
        int max_one=0;
        int zero=0;
        int max_zero=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='1'){
                one++;
                max_zero=Math.max(max_zero,zero);
                zero=0;
            }
            else{
                zero++;
                max_one=Math.max(max_one,one);
                one=0;
            }
        }

        max_zero=Math.max(max_zero,zero);
        max_one=Math.max(max_one,one);

        return max_one>max_zero;

    }
}