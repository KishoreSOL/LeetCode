class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        int i=0;
        int j=1;

        int ans=1;

        while(i<j && j<s.length()){
            if(s.substring(i,j).contains(Character.toString(s.charAt(j)))){
                i++;
            }
            else{
                ans=Math.max(ans,(j-i)+1);
                j++;
            }
            if(i>=j){
                j=i+1;
            }
        }
        return ans;

    }
}