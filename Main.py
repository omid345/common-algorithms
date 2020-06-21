class Solution(object):
    def sortedSquares(self, A):
        return sorted(x*x for x in A)

if __name__ == "__main__":
    print(Solution().sortedSquares([-2,-1,0,1,2,3]))