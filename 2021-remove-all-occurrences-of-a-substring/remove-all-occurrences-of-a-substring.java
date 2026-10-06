class Solution {
    public String removeOccurrences(String s, String part) {
        String temp=s;
        while(temp.length()>=part.length()){
            boolean found=false;
            for(int i=0;i<=temp.length()-part.length();i++){
                if(temp.substring(i,i+part.length()).equals(part)){
                    temp=temp.substring(0,i)+temp.substring(i+part.length());
                    found=true;
                    break;
                }
            }
            if(!found){
                break;
            }
        }
        return temp;
    }
}