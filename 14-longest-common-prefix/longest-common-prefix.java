class Solution {
    public boolean sameLet(String[] strs, int index){
        
        for(int i = 0; i < strs.length; i++){
            
            if(index >= (strs[i].length()) || !(strs[i].charAt(index) == strs[0].charAt(index)))
                return false;
        }
        
        return true;
    }
    
    public String longestCommonPrefix(String[] strs) {
        
        int n = 0;
        
        while(sameLet(strs,n))
            n++;
        
        return strs[0].substring(0,n);
        
    }
}