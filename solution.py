class Solution:
    def minOperations(self, logs: List[str]) -> int:
        stk = 0
        for s in logs:
            if s.startswith("..") and stk > 0:
                stk -= 1
            elif s[0] != '.':
                stk += 1
        
        return stk
