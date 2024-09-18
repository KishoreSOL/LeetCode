class Solution {
    public String largestNumber(int[] nums) {
        StringBuilder sb=new StringBuilder();

        int len=nums.length;
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                String s1=String.valueOf(nums[i]);
                String s2=String.valueOf(nums[j]);

                if((s1+s2).compareTo(s2+s1)<0){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
            if(nums[0]==0){
                return \0\;
            }
            sb.append(nums[i]);
        }
        sb.append(nums[len-1]);
        return sb.toString();
    }
}