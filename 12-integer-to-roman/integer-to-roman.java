class Solution {
    
    public String intToRoman(int num) {
        String rom = "";
        
        while(num >= 1000){
            rom = rom + "M";
            num = num - 1000;
        }
        
        while(num >= 900){
            rom = rom + "CM";
            num = num - 900;
        }
        
        while(num >= 500){
            rom = rom + "D";
            num = num - 500;
        }
        
        while(num >= 400){
            rom = rom + "CD";
            num = num - 400;
        }
        
        while(num >= 100){
            rom = rom + "C";
            num = num - 100;
        }
        
        while(num >= 90){
            rom = rom + "XC";
            num = num - 90;
        }
        
        while(num >= 50){
            rom = rom + "L";
            num = num - 50;
        }
        
        while(num >= 40){
            rom = rom + "XL";
            num = num - 40;
        }
        
        while(num >= 10){
            rom = rom + "X";
            num = num - 10;
        }
        
        while(num >= 9){
            rom = rom + "IX";
            num = num - 9;
        }
        
        while(num >= 5){
            rom = rom + "V";
            num = num - 5;
        }
        
        while(num >= 4){
            rom = rom + "IV";
            num = num - 4;
        }
        
        while(num >= 1){
            rom = rom + "I";
            num = num - 1;
        }
        return rom;
    }
}