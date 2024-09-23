class Solution {
    public class pair{
        char c;
        int count;
        public pair(char c,int count){
            this.c=c;
            this.count=count;
        }
    }
    public String frequencySort(String s) {
        PriorityQueue<pair> pq= new PriorityQueue<>((x,y)->(y.count-x.count));

        int[] freq=new int[128];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }
        for(int i=0;i<128;i++){
            pq.add(new pair((char)(i),freq[i]));
        }
        String result=\\;
        while(!pq.isEmpty()){
            pair elmt= pq.poll();
            char c=elmt.c;
            int count=elmt.count;
            for(int i=0;i<count;i++){
                result+=c;
            }
        }
        return result;

    }
}