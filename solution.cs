public class Solution {
    public int MinOperations(string[] logs) {
        int stk = 0;
        foreach(string s in logs){
            if(s.StartsWith("..") && stk > 0) stk--;
            else if(s[0] != '.') stk++; 
        }

        return stk;
    }
}
