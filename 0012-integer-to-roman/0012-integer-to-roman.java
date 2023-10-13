class Solution {
    public String intToRoman(int num) {
        
        String result = "";
        int cnt = 0;

        cnt = num/1000;
        result += "M".repeat(cnt);
        num %= 1000;

        cnt = num/100;
        if (cnt == 9) {
            result += "CM"; 
            cnt -= 9;
        } else if (cnt >= 5) {
            result += "D";
            cnt-= 5;
        } else if (cnt == 4) {
            result += "CD";
            cnt -= 4;
        }
        result += "C".repeat(cnt);
        num %= 100;
        
        cnt = num/10;
        if (cnt == 9) {
            result += "XC"; 
            cnt -= 9;
        } else if (cnt >= 5) {
            result += "L";
            cnt-= 5;
        } else if (cnt == 4) {
            result += "XL";
            cnt -= 4;
        }
        result += "X".repeat(cnt);
        num %= 10;
        
        cnt = num;
        if (cnt == 9) {
            result += "IX"; 
            cnt -= 9;
        } else if (cnt >= 5) {
            result += "V";
            cnt-= 5;
        } else if (cnt == 4) {
            result += "IV";
            cnt -= 4;
        }
        result += "I".repeat(cnt);
        
        
        return result;
        
    }
}