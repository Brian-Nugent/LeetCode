class Solution {
    public int[] singleNumber(int[] nums) {
        Set<Integer> list = new HashSet<Integer>();
        
        for(int i : nums){
            if(list.contains(i))
                list.remove(i);
            else
                list.add(i);
            
        }
        
        int j = 0;
        int[] ans = new int[2];
        
        for(Integer i : list){
            ans[j] = i;
            j++;
        }
            
        
        return ans;
        
    }
}