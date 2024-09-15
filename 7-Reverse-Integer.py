class Solution:
    def reverse(self, x: int) -> int:
        INT_MIN, INT_MAX = -2**31, 2**31 - 1

        flag=1
        if(x<0):
            flag=-1
        
        ans=0
        x=abs(x)

        while(x!=0):
            ans=ans*10 + x%10
            x//=10
        

        if ans < INT_MIN or ans > INT_MAX:
            return 0

        return flag*ans
        
