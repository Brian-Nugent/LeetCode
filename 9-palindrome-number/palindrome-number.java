class Solution {
    
    public boolean isPalindrome(int x) {
        String y = String.valueOf(x);
        int l = y.length();
        
        for(int i = 0; i < l/2; i++){
            if(!(y.charAt(i) == y.charAt(l-i-1)))
                return false;
        }
        return true;
    }
}