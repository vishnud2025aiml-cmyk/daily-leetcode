class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int[] res=new int[s.length()];

        for(int i=0;i<s.length();i++){
            String str=s.substring(i);
            res[i]=check(startPos[0],startPos[1],n,str);
        }
        return res;

    }

    public int check(int x,int y,int n,String s){
        int count=0;
        int nx=x;
        int ny=y;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L'){
                if(safe(nx,ny-1,n)){
                    count++;
                    ny-=1;
                }
                else{
                    break;
                }
            }
            if(s.charAt(i)=='R'){
                if(safe(nx,ny+1,n)){
                    count++;
                    ny+=1;
                }
                else{
                    break;
                }
            }
            if(s.charAt(i)=='U'){
                if(safe(nx-1,ny,n)){
                    count++;
                    nx-=1;
                }
                else{
                    break;
                }
            }
            if(s.charAt(i)=='D'){
                if(safe(nx+1,ny,n)){
                    count++;
                    nx+=1;
                }
                else{
                    break;
                }
            }
        }
        return count;
    }

    public boolean safe(int x,int y,int n){
        if(x>=0 && x<n && y>=0 && y<n){
            return true;
        }
        return false;
    }

}