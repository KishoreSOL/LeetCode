class Solution {
    public int maxDepth(String s) {
        int maxx=0;
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                c++;
            }
            if(s.charAt(i)==')'){
                c--;
            }
            maxx=Math.max(maxx,c);
        }
        return maxx;
    }
}