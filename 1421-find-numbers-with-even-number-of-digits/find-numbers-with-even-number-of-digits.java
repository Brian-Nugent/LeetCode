class Solution {
    public int numDigits(int a){
        int ans = 0;
        while(a != 0){
            a = a/10;
            ans++;
        }
        return ans;
    }
    
    public int findNumbers(int[] nums) {
        
        int ans = 0;
        
        for(int i : nums)
            if(numDigits(i) % 2 == 0)
                ans++;
        return ans;
        
    }
}