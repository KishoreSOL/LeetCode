class Solution:
    def beautySum(self, s: str) -> int:

        ans=0
        for i in range(len(s)):
            freq={}
            for j in range(i,len(s)):
                freq[s[j]]=freq.get(s[j],0)+1
                if(len(freq)>=2):
                    maxx=-1
                    minn=999
                    for key in freq:
                        maxx=max(freq[key],maxx)
                        minn=min(freq[key],minn)
                    ans+=maxx-minn
    
        return ans