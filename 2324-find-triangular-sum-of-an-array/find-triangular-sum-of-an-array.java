class Solution {
    public void arraySum(int[] nums){
        
        for(int i = 0; i < nums.length-1; i++)
            nums[i] = (nums[i]+nums[i+1])%10;

        return;
    }
    
    public int triangularSum(int[] nums) {
        for(int i = 0; i < nums.length-1;i++)
            arraySum(nums);
        
        return nums[0];
        
    }
}