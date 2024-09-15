class Solution {
    public List<Integer> getRow(int numRows ) {
        List<List<Integer>> Result=new ArrayList<>();
        List<Integer> temp1=new ArrayList<>();
        
        temp1.add(1);
        Result.add(temp1);
        if(numRows==0){
            return temp1;
        }
        
        for(int i=1;i<=numRows;i++){
            List<Integer> temp=new ArrayList<>();
            int len=Result.size();
            temp.add(Result.get(len-1).get(0));
            for(int j=0;j<len-1;j++){
                temp.add(Result.get(len-1).get(j) + Result.get(len-1).get(j+1) );
            }
            temp.add(Result.get(len-1).get(len-1));
            Result.add(temp);
        }
        
        return Result.get(numRows);
    }
}