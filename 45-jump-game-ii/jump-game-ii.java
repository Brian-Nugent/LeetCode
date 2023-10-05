class Solution {
    public int jump(int[] nums) {
        if(nums.length == 1)
            return 0;
        
        int numJumps = 0;
        int spot = 0;
        int n = nums.length;
        int far = 0;
        int best = 0;
        
        while(spot + nums[spot] < n-1){
            
            far = 0;
            
            for(int i = spot; i <= spot + nums[spot]; i++){
                if(i + nums[i] > far){
                    best = i;
                    far = i + nums[i];
                }
            }
            spot = best;
            numJumps++;
        }
        return numJumps+1;
    }
}