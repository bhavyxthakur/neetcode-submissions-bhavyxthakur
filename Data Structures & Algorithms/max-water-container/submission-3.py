class Solution:
    def maxArea(self, heights: List[int]) -> int:

        i = 0
        j = len(heights) - 1
        water = 0

        while i < j:

            height = min(heights[i], heights[j])
            width = j - i

            temp = height * width
            water = max(temp, water)

            if heights[i] > heights[j]:
                j -= 1
            else:
                i += 1

        return water