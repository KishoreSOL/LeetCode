class Solution {
    public int isPrefixOfWord(String sentences, String searchWord) {
        int i=0;
        int cnt=0;
        while(i<sentences.length()){
            int j=0;
            cnt++;
            while(i<sentences.length() && (!(sentences.charAt(i)==' '))){
                if(searchWord.charAt(j)!=sentences.charAt(i)){
                    break;
                }
                j++;
                i++;
                if(j>=searchWord.length()){
                    return cnt;
                }
            }
            while(i<sentences.length() && sentences.charAt(i)!=' '){
                i++;
            }
            i++;
        }
        return -1;
    }
}