class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        int num = 0;
        List<Integer> temp = new ArrayList<Integer>();
        List<List<Integer>>[] megaList = new ArrayList[target+1];
        
        for(int i = 0; i < target+1; i++)
            megaList[i] = new ArrayList<List<Integer>>();
        
        megaList[0].add(temp);
        
        for(int i = 0; i < candidates.length; i++){
            num = candidates[i];
            for(int j = 0; j < target + 1; j++){
                if(num + j <= target){
                    for(List<Integer> list : megaList[j]){
                        temp = new ArrayList<Integer>(list);
                        temp.add(num);
                        megaList[num+j].add(temp);
                    }
                }
            }
        }
        return megaList[target];
    }
}