class Solution {
    public int min(int a, int b){
        if(a < b)
            return a;
        else
            return b;
    }
    public int maxArea(int[] height) {
        int n = height.length;
        int end = n-1;
        int str = 0;
        int leader = 0;
        
        while(!(str == end)){
            
            if((end-str)*min(height[str],height[end]) > leader)
                leader = (end-str)*min(height[str],height[end]);
            
            if(height[str] > height[end])
                end--;
            else
                str++;
            

            
        }
        
        return leader;
    }
}