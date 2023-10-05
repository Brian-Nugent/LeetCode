class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)
            return 0;
        
        if(nums.length == 1)
            return 1;
        
        int i = 0;
        
        if(nums[0] == nums[1])
            i = 1;
        
        for(int j = 1; j < nums.length; j++){
            if(nums[i] != nums[j]){
                if(j < (nums.length -1) && nums[j] == nums[j+1]){
                    nums[i+1] = nums[j];
                    nums[i+2] = nums[j];
                    i = i+2;
                }
                else{
                    i++;
                    nums[i] = nums[j];   
                }
            }    
        }
        
        return i+1;
    }
}