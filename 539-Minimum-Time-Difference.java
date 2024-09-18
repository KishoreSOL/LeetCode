class Solution {
    public static int convert_to_minutes(String time){
        // StringBuffer strbuf=new StringBuffer(time);
        int hours=Integer.parseInt(time.substring(0,2));
        int minutes=Integer.parseInt(time.substring(3,5));

        return hours*60 + minutes;
    }
    public int findMinDifference(List<String> timePoints) {
        ArrayList<Integer> result=new ArrayList<>();
        
        for(String s: timePoints){
            int temp=convert_to_minutes(s);
            result.add(temp);
        }
        Collections.sort(result);

        int min=Integer.MAX_VALUE;
        int len=timePoints.size();
        for(int i=0;i<len-1;i++){
            int t=result.get(i+1)-result.get(i);
            if(t<min){
                min=t;
            }
        }
        int t4=result.get(len-1)-result.get(0);
        int t3=Math.min(t4,1440-t4);
        min=Math.min(min,t3);
        return min;
    }
}