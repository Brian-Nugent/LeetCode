class Solution {
    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
        
        int n = status.length;
        boolean change = true;
        boolean[] boxes = new boolean[n];
        boolean[] stat = new boolean[n];
        boolean[] key = new boolean[n];
        boolean[] search = new boolean[n];
        
        for(int i = 0; i < boxes.length; i++){
            boxes[i] = false;
            stat[i] = false;
            key[i] = false;
            search[i] = false;
        }
        
        for(int i : initialBoxes)
            boxes[i] = true;
        
        for(int i = 0; i < n; i++)
            if(status[i] == 1)
                stat[i] = true;
        
        while(change){
            change = false;
            
            for(int i = 0; i < n; i++)                              //Searching all the boxes that are open but unsearched
                if(boxes[i] && stat[i] && !search[i]){
                    change = true;
                    search[i] = true;
                    for(int k : keys[i])
                        key[k] = true;
                    for(int k : containedBoxes[i])
                        boxes[k] = true;
                }
            
            for(int i = 0; i < n; i++)              //Unlocking all boxes that we can
                if(boxes[i] && !stat[i] && key[i]){
                    stat[i] = true;
                    change = true;
                }
        }
        int ans = 0;
        
        for(int i = 0; i < n; i++)
            if(boxes[i] && stat[i])
                ans += candies[i];
        
        return ans;
    }
}