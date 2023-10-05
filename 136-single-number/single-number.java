class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> list = new HashSet<Integer>();
        
        for(int i : nums){
            if(list.contains(i))
                list.remove(i);
            else
                list.add(i);
            
        }
        
        for(Integer i : list)
            return i;
        
        return 0;
        
    }
}