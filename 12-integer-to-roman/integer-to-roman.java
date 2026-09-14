class Solution {
    public String intToRoman(int num) {
        Map<Integer,String> mp=new LinkedHashMap<>();

        mp.put(1000,"M");
        mp.put(900,"CM");
        mp.put(500,"D");
        mp.put(400,"CD");
        mp.put(100,"C");
        mp.put(90,"XC");
        mp.put(50,"L");
        mp.put(40,"XL");
        mp.put(10,"X");
        mp.put(9,"IX");
        mp.put(5,"V");
        mp.put(4,"IV");
        mp.put(1,"I");

        StringBuilder res=new StringBuilder();

        for(int x:mp.keySet()){
            int val=num/x;
            if(val>0){
                res.append(mp.get(x).repeat(val));
                num%=x;
            }
        }

        return res.toString();

    }
}