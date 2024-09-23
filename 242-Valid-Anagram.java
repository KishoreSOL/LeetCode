class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> hm1=new HashMap<>();

        for(int i=0;i<s.length();i++){
            hm1.put(s.charAt(i),hm1.getOrDefault(s.charAt(i),0)+1);
        }
        for(int j=0;j<t.length();j++){
            if(!hm1.containsKey(t.charAt(j))){
                return false;
            }
            hm1.put(t.charAt(j),hm1.get(t.charAt(j))-1);
        }
        for(Character c:hm1.keySet()){
            if(hm1.get(c)!=0){
                return false;
            }
        }
        return true;
    }
}