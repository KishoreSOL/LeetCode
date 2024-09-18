class Solution:
    def uncommonFromSentences(self, s1: str, s2: str) -> List[str]:
        l1=list(map(str,s1.split()))
        l2=list(map(str,s2.split()))

        result=l1+l2

        temparr=[]
        removed=[]
        for i in result:
            if i not in temparr and i not in removed:
                temparr.append(i)
            else:
                removed.append(i)
                if( i in temparr):
                    temparr.remove(i)
            
        return temparr