class Solution {
    public boolean rotateString(String s, String goal) {
        int l1=s.length();
        int l2=goal.length();
        int start=-1;

        if(l1!=l2){
            return false;
        }

        for(int k=0;k<l1;k++){
            start=k;
            int c=0;
            for(int i=0;i<l1;i++){
                if(goal.charAt(start)==s.charAt(i)){
                    c++;
                }
                else{
                    break;
                }
                start++;
                start=start%l2;
            }
            if(c==l1){
                return true;
            }
        }

        return false;
    }
}