class Solution {
    public String convert(String s, int numRows) {
        StringBuilder res=new StringBuilder();

        if(numRows==1){
            return s;
        }

        List<List<Character>> ans=new ArrayList<>();

        for(int i=0;i<numRows;i++){
            ans.add(new ArrayList<>());
        }

        boolean down=true;
        int row=0;
        for(int i=0;i<s.length();i++){
            ans.get(row).add(s.charAt(i));
            if(row==numRows-1){
                down=false;
            }
            if(!down){
                row--;
                if(row==0){
                    down=true;
                }
            }
            else{
                row++;
            }
        }

        for(int i=0;i<ans.size();i++){
            for(int j=0;j<ans.get(i).size();j++){
                res.append(ans.get(i).get(j));
            }
        }

        return res.toString();

    }
}