class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxm,i,j = 0,0,len(height)-1
        while i<j:
            maxm = max(min(height[i], height[j]) * (j-i), maxm)
            if height[i]>height[j]:
                j-=1
            else:
                i+=1
        return maxm;  