class Solution {
    public boolean checkDivisibility(int n) {
        int sumDigit=0;
        int productDigit=1;
        int temp=n;
        while(temp>0){
            sumDigit+=temp%10;
            productDigit*=temp%10;
            temp/=10;
        }
    
    return n%(sumDigit+productDigit)==0;
    }
}