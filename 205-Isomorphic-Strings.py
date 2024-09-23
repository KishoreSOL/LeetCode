class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        hm={}
        for i in range(len(s)):
            if s[i] in hm and hm[s[i]] != t[i] :
                return False
            elif s[i] not in hm:
                hm[s[i]]=t[i]

        if len(hm.keys())!=len(set(hm.values())):
            return False
        return True

            

        