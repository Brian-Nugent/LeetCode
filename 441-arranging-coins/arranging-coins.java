class Solution {
    public int arrangeCoins(int n) {
        
        int pull = 1;
        
        while(n - pull >=0){
            n = n - pull;
            pull++;
        }
        
        return pull - 1;
    }
}