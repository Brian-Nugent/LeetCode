class Solution {
    public int romanToInt(String s) {

        char temp1,temp2;
        int total = 0;
        
        for(int i = 0; i < s.length(); i++){
            temp1 = s.charAt(i);
            if(i+1 < s.length())
                temp2 = s.charAt(i+1);
            else
                temp2 = 'P';

            if(temp1 == 'I'){
                if(temp2 == 'X'){
                    total += 9;
                    i++;
                }

                else if(temp2 == 'V'){
                    total += 4;
                    i++;
                }
                else
                    total += 1;
            }

            if(temp1 == 'X'){
                if(temp2 == 'L'){
                    total += 40;
                    i++;
                }
                else if(temp2 == 'C'){
                    total += 90;
                    i++;
                }
                else
                total += 10;
            }
            if(temp1 == 'C'){
                if(temp2 == 'D'){
                    total += 400;
                    i++;
                }
                else if(temp2 == 'M'){
                    total += 900;
                    i++;
                }
                else
                total += 100;
            }
            if(temp1 == 'V')
                total += 5;

            if(temp1 == 'L')
                total += 50;         

            if(temp1 == 'D')
                total += 500;

            if(temp1 == 'M')
                total += 1000;
        }

        return total;

    }
}