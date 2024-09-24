class Solution {
    class Trie{
        static class Node{
            Node[] list = new Node[26];
            boolean flag=false;
            public boolean containsKey(char ch){
                if(list[ch-'a']==null){
                    return false;
                }
                return true;
            }
            public void put(char ch){
                Node newnode= new Node();
                list[ch-'a']=newnode;
            }
            public Node get(char ch){
                return list[ch-'a'];
            }
            public void setEnd(){
                flag=true;
            }
            public boolean isEnd(){
                return flag;
            }
        }

        private static Node root;
        public Trie(){
            root=new Node();
        }
        public static void insert(String s){
            Node node=root;
            for(Character ch : s.toCharArray()){
                if(!node.containsKey(ch)){
                    node.put(ch);
                }
                node=node.get(ch);
            }
            node.setEnd();
        }
        public Node getRoot() {
            return root;
        }

    }

    public boolean wordBreak(String s, List<String> wordDict) {
        Trie obj=new Trie();
        for(int i=0;i<wordDict.size();i++){
            obj.insert(wordDict.get(i));
        }
        return wordbreakhelper(s,0,obj,new Boolean[s.length()]);
    }
    public boolean wordbreakhelper(String s, int index,Trie obj,Boolean[] memo){
        if(index==s.length()){
            return true;
        }
        if (memo[index] != null) {
            return memo[index];
        }
        Trie.Node node=obj.root;
        for(int i=index;i<s.length();i++){
            if(!node.containsKey(s.charAt(i))){
                return memo[index]=false;
            }
            node=node.get(s.charAt(i));
            if(node.isEnd() && wordbreakhelper(s,i+1,obj,memo)){
                return memo[index]=true;
            }
        }
        return memo[index]=false;
    }
}