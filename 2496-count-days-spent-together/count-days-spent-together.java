class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {

        int startdatealice=Integer.parseInt(arriveAlice.substring(3));
        int enddatealice=Integer.parseInt(leaveAlice.substring(3));
        int startmonthalice=Integer.parseInt(arriveAlice.substring(0,2));
        int endmonthalice=Integer.parseInt(leaveAlice.substring(0,2));

        int startdatebob=Integer.parseInt(arriveBob.substring(3));
        int enddatebob=Integer.parseInt(leaveBob.substring(3));
        int startmonthbob=Integer.parseInt(arriveBob.substring(0,2));
        int endmonthbob=Integer.parseInt(leaveBob.substring(0,2));

        int[] month={31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};

        int SA=0;
        if(startmonthalice==1){
            SA=startdatealice;
        }
        else{
            SA=month[startmonthalice-2]+startdatealice;
        }

        int EA=0;
        if(endmonthalice==1){
            EA=enddatealice;
        }
        else{
            EA=month[endmonthalice-2]+enddatealice;
        }
        
        int SB=0;
        if(startmonthbob==1){
            SB=startdatebob;
        }
        else{
            SB=month[startmonthbob-2]+startdatebob;
        }
        int EB=0;
        if(endmonthbob==1){
            EB=enddatebob;
        }
        else{
            EB=month[endmonthbob-2]+enddatebob;
        }

        int ans=0;
        int start=Math.max(SA,SB);
        int end=Math.min(EA,EB);

        if(start<=end){
            ans=end-start+1;
        }

        return ans;
        
    }
}