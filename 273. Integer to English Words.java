class Solution {
    public String numberToWords(int num) {
        if(num==0){
            return "Zero";
        }
        String ones[]={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        String tens[]={"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
        String thous[]={"","Thousand","Million","Billion"};
        StringBuilder res=new StringBuilder();
        int groupidx=0;
        while(num>0){
            if(num%1000!=0){
                StringBuilder curr=new StringBuilder();
                int part=num%1000;
                if(part>=100){
                    curr.append(ones[part/100]).append(" Hundred ");
                    part=part%100;
                }
                if(part>=20){
                    curr.append(tens[part/10]).append(" ");
                    part=part%10;
                }if(part>0){
                    curr.append(ones[part]).append(" ");
                }
                curr.append(thous[groupidx]).append(" ");
                res.insert(0,curr);
            }
            num=num/1000;
            groupidx++;
        }
        return res.toString().trim();
    }
}
