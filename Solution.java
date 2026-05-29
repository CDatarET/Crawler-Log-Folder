class Solution {
    public int minOperations(String[] logs) {
        int stk = 0;
        for(int i = 0; i < logs.length; i++){
            if(logs[i].startsWith("..")){
                if(stk > 0){
                    stk--;
                }
            }
            else if(logs[i].charAt(0) != '.'){
                stk++;
            }
        }

        return(stk);
    }
}
