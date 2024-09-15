class Solution:
    def convert(self, s: str, numRows: int) -> str:
        if(numRows==1):
            return s
            
        strings=[\\]*numRows
        turn=0
        i=1
        strings[0]+=s[0]
        while(i<len(s)):
            if(turn==0):
                for j in range(1,numRows):
                    strings[j]+=s[i]
                    i+=1
                    if(i>=len(s)):
                        break
                turn=1
            else:
                for j in range(numRows-2,-1,-1):
                    strings[j]+=s[i]
                    i+=1
                    if(i>=len(s)):
                        break
                turn=0

        result=\\
        for i in strings:
            result+=i
        return result

