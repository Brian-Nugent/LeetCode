class Solution {
    public boolean isValid(String s) {
        char[] data = new char[s.length()+1];
        char curr;
        int spot = 0;
        
        for(int i = 0; i < s.length()+1; i++){
            data[i] = 'i';
        }
        
        for(int i = 0; i < s.length(); i++){
            curr = s.charAt(i);
            
            if((curr == '(') || (curr == '{') || (curr == '[')){
                spot++;
                data[spot] = curr;
            }
            
            if(curr == ')'){
                
                if(data[spot] == '(')
                    spot--;
                else
                    return false;
            }
            
            if(curr == '}'){
                
                if(data[spot] == '{')
                    spot--;
                else
                    return false;
            }
            
            if(curr == ']'){
                
                if(data[spot] == '[')
                    spot--;
                else
                    return false;
            }
                
        }
        if(spot == 0)
            return true;
        else
            return false;
    }
}