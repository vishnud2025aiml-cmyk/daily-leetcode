class Solution {
    int count=0;
    public int totalNumbers(int[] digits) {
        StringBuilder s=new StringBuilder();
        Set<String> set=new HashSet<>();
        boolean[] used=new boolean[digits.length];

        recursion(used,digits,s,set);

        return count;
    }

    public void recursion(boolean[] used,int[] digits,StringBuilder s,Set<String> set){
        if(s.length()==3){
            if(Integer.parseInt(s.toString())%2==0 && !set.contains(s.toString()) && s.charAt(0)!='0'){
                set.add(s.toString());
                count++;
            }
            return ;
        }

        for(int i=0;i<digits.length;i++){
            if(used[i]){
                continue;
            }
            used[i]=true;
            s.append(digits[i]);
            recursion(used,digits,s,set);
            s.deleteCharAt(s.length()-1);
            used[i]=false;
        }

    }

}