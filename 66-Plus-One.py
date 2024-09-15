class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        
        i=len(digits)-1
        r=1
        while(i>=0 and r!=0):
            if(digits[i]==9):
                digits[i]=0
                i-=1
                continue
            digits[i]+=1
            r=0

        if(r==1):
            digits.insert(0,1)
        return digits



            
