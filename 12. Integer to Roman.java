class Solution {
    public String intToRoman(int num) {
        String ones[]={"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String tens[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String hund[]={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String thousand[]={"","M","MM","MMM"};
        if(num<=9){
            return ones[num];
        }
        StringBuilder ans=new StringBuilder();
        if(num>=10 && num<100){
            ans.append(tens[num/10]+ones[num%10]);
            return ans.toString();
        }
        if(num>=100 && num<1000){
            ans.append(hund[num/100]);
            num=num%100;
            ans.append(tens[num/10]+ones[num%10]);
            return ans.toString();
        }
        if(num>=1000){
            ans.append(thousand[num/1000]);
            num=num%1000;
            System.out.println(num);
            ans.append(hund[num/100]);
            num=num%100;
            ans.append(tens[num/10]+ones[num%10]);
            return ans.toString();
        }
        return ans.toString();
    }
}
