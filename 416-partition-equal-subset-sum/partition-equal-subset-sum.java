class Solution {
    public boolean canPartition(int[] nums) {
        
        int total = 0;
        
        for(int num : nums)
            total += num;
        
        if(total % 2 == 1)
            return false;
        
        total = total/2;
        
        boolean[] pSum = new boolean[total + 1];
        
        for(int i = 0; i < total+1;i++)
            pSum[i] = false;
        
        pSum[0] = true;
            
        for(int i = 0; i < nums.length; i++)
            for(int j = total; j >= nums[i]; j--)
                pSum[j] = pSum[j] || pSum[j-nums[i]];
        
        return pSum[total];        
        
    }
}