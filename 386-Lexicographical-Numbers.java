class Solution {
    public List<Integer> lexicalOrder(int n) {
        String[] words=new String[n];
        for(int i=1;i<=n;i++){
            words[i-1]=String.valueOf(i);
        }
        Arrays.sort(words);
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<n;i++){
            result.add(Integer.parseInt(words[i]));
        }
        return result;
    }
}