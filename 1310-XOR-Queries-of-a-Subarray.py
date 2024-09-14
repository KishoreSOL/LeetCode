class Solution:
    def xorQueries(self, arr: List[int], queries: List[List[int]]) -> List[int]:
        result=[]
        px=[0]*(len(arr)+1)
        for i in range(len(arr)):
            px[i+1]=px[i]^arr[i]
        for i in queries:
            result.append(px[i[1]+1] ^ px[i[0]])
        return result