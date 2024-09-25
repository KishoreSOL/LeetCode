class Trie {

    public class Node{
        Node[] links= new Node[26];
        boolean flag=false;
        int count=0;

        boolean containsKey(char ch){
            return links[ch-'a']!=null;
        }
        void put(char ch){
            Node newNode=new Node();
            links[ch-'a']=newNode;
        }
        Node get(char ch){
            return links[ch-'a'];
        }
        void setend(){
            flag=true;
        }
        boolean isEnd(){
            return flag;
        }
        void increase_count(){
            count++;
        }
        int get_count(){
            return count;
        }
    }


    private Node root;
    public Trie() {
        root= new Node();
    }
    public void insert(String word) {
        Node node=root;
        for(Character ch:word.toCharArray()){
            if(!node.containsKey(ch)){
                node.put(ch);
            }
            node = node.get(ch);
            node.increase_count();
        }
        node.setend();
    }
    
    public int startsWith(String prefix) {
        Node node=root;
        int ans=0;
        for(Character ch:prefix.toCharArray()){
            node=node.get(ch);
            ans+=node.get_count();
        }
        return ans;
    }
}
class Solution {
    public int[] sumPrefixScores(String[] words) {
        Trie obj= new Trie();

        for(String s:words){
            obj.insert(s);
        }
        int[] res=new int[words.length];
        int t=0;
        for(String s:words){
            int len=s.length();
            res[t]=obj.startsWith(s);
            t++;
        }
        return res;
    }
}