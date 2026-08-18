class Solution:
    def removeElement(self, nums: list[int], val: int) -> int:
        luna = []
        for num in nums:
            if num == val:
                continue
            luna.append(num)
        for i in range(len(luna)):
            nums[i] = luna[i]
        return len(luna)