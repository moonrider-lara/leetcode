class Solution {
    public String intToRoman(int num) {
        
        StringBuilder result = new StringBuilder();
        
        String ones[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String tens[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String hrns[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String ths[]={"","M","MM","MMM"};

        result.append(ths[num / 1000]);
        result.append(hrns[(num % 1000) / 100]);
        result.append(tens[(num % 100) / 10]);
        result.append(ones[num % 10]);
        
        return result.toString();
        
    }
}