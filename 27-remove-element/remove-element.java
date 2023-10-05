class Solution {
    public int removeElement(int[] nums, int val) {
        
        int k = nums.length;
        
        for(int i = 0; i < nums.length; i++){
            
            if(i >= k)
                return k;
            
            if(nums[i] == val){
                for(int j = i; j < (nums.length-1); j++){
                    nums[j] = nums[j+1];
                    
                }
                k--;
                i--;
            }
            
        }
        return k;
    }
}