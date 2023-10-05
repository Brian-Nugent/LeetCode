class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] inNums = new boolean[nums.length+1];
        
        for(int i = 0; i < nums.length+1; i++)
            inNums[i] = false;
        
        for(int i = 0; i < nums.length; i++)
            inNums[nums[i]] = true;
        
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 1; i < nums.length+1; i++)
            if(!inNums[i])
                list.add(i);
        return list;
    }
}