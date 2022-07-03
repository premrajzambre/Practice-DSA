class Solution:
    # @param A : integer
    # @return an integer
    def solve(self, A):
        high = A
        low = 1
        while low <= high:
            mid = (low+high)//2
            i = mid*mid
            if i > A:
                high = mid - 1
            elif i < A:
                low = mid + 1
            elif i == A:
                return mid
        return -1
