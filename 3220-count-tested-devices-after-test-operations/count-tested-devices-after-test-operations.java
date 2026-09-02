class Solution {
    public int countTestedDevices(int[] battery) {
        int count=0;
        for(int i=0;i<battery.length;i++){
            if(battery[i]==0){
                continue;
            }
            count++;
            for(int j=i+1;j<battery.length;j++){
                battery[j]=battery[j]-1;
                battery[j]=Math.max(0,battery[j]);
                // System.out.println(battery[j]);
            }
        }
        return count;
    }
}