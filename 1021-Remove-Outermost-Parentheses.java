class Solution {
    public String removeOuterParentheses(String s) {
        int count=0;
        String result="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(count==0){
                    count++;
                    continue;
                }
                else{
                    result+="(";
                    count++;
                }
            }
            else{
                if(count==1){
                    count--;
                    continue;
                }
                else{
                    result+=")";
                    count--;
                }
            }
        }
        return result;
    }
}