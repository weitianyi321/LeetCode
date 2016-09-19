"""
'Double pointer approach':
Because of the fact that the returned list is going to be smaller
than the input array in size. It is fully capable to use the very
front part of the list to store the adjusted array.
"""

class Solution(object):
    def removeDuplicates(self, nums):
        if len(nums) == 0:
            return 0
        count = 1
        slow = 0
        for fast in range(1, len(nums)):
            if nums[fast] != nums[slow]:         
                nums[slow+1] = nums[fast]
                slow += 1
                count +=1

        return slow+1
                
            
            
            
            
