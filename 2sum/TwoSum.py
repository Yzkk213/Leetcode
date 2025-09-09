from typing import List
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hash={}
        index=0
        for val in nums:
            x=target-val
            if x in hash:
                return[index,hash[x]]
            else:
                hash[val]=index
                index+=1
