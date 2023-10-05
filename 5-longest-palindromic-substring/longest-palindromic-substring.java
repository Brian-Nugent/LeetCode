class Solution {
    public boolean isPalindrome(String s){
        int n = s.length();
        
        for(int i = 0; i < n/2; i++){
            if(!(s.charAt(i) == s.charAt(n-i-1)))
                return false;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        
        int inc = 0;
        String leader1 = "";
        String leader2 = "";
        int record1 = 0;
        int record2 = 1;
        int n = s.length();
        
        for(int i = 0; i < s.length();i++){
            inc = record1;
            while(((i-inc) >= 0) && ((i+inc+1) <= n) && isPalindrome(s.substring(i-inc,i+inc+1))){
                if(inc >= record1){
                    leader1 = s.substring(i-inc,i+inc+1);
                    record1 = inc;
                }
                inc++;
            }
            inc = record2;
            while(((i-inc) >= 0) && ((i+inc) <= n) && isPalindrome(s.substring(i-inc,i+inc))){
                if(inc >= record2){
                    leader2 = s.substring(i-inc,i+inc);
                    record2 = inc;
                }
                inc++;
            }
        }
        if(leader1.length() > leader2.length())
            return leader1;
        
        return leader2;
    }
}