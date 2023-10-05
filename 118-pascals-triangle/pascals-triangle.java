class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> currRow = new ArrayList<Integer>();
        List<Integer> prevRow = new ArrayList<Integer>();
        
        prevRow.add(1);
        
        list.add(prevRow);
        
        for(int i = 0; i < numRows-1; i++){
            
            currRow.add(1);
            
            for(int k = 0; k < i; k++){
                currRow.add(prevRow.get(k) + prevRow.get(k+1));
            }
            
            currRow.add(1);
            
            list.add(currRow);
            
            prevRow = currRow;
            
            currRow = new ArrayList<Integer>();
        }
        
        
        return list;
        
    }
}