class Solution {
    public String intToRoman(int num) {
        int[] val=new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] ch=new String[]{\M\,\CM\,\D\,\CD\,\C\,\XC\,\L\,\XL\,\X\,\IX\,\V\,\IV\,\I\};

        String res=\\;

        int times=0;

        for(int i=0;i<13;i++){
            times=num/val[i];

            while(times!=0){
                res+=ch[i];
                times--;
            }
            num=num%val[i];
        }
        return res;
    }
}