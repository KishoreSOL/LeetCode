class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int len=gas.length;
        int sum1=0;
        int sum2=0;
        int start=0;
        for(int i=0;i<len;i++){
            sum1+=gas[i]-cost[i];
            sum2+=gas[i]-cost[i];
            if(sum2<0){
                sum2=0;
                start=i+1;
            }
            
        }
        if(sum1>=0){
            return start;
        }
        return -1;
    }
}