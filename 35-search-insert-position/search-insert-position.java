class Solution {
    public int searchInsert(int[] nums, int target) {
        int pos = nums.length/2;
        int start = 0;
        int end = nums.length;
        
        while(start < end-1){
            pos = (start + end)/2;
            if(target > nums[pos])
                start = pos;
            else
                end = pos;
        }

    if(nums[start] >= target)
        return start;
    return start + 1;

    }

}