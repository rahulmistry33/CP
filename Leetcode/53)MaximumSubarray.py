class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        current_sum = nums[0]
        total_sum = nums[0]
        for i in range(1,len(nums)):
            if nums[i] > current_sum + nums[i]:
                current_sum = nums[i]
            else:
                current_sum += nums[i]
            if current_sum > total_sum:
                total_sum = current_sum
        return total_sum
        