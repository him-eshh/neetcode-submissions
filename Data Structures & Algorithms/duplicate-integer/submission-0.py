
class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        duplicatemap = set()

        for x in nums:
            if x in duplicatemap:
                return True
            duplicatemap.add(x)
        return False
        