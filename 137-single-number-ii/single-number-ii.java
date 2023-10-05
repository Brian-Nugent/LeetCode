
class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> list = new HashSet<Integer>();
        Set<Integer> list2 = new HashSet<Integer>();
        
        for(int i : nums){
            if(list.contains(i))
                if(list2.contains(i))
                    list.remove(i);
                else
                    list2.add(i);
            else
                list.add(i);
            
        }
        
        for(Integer i : list)
            return i;
        
        return 0;
        
    }
}