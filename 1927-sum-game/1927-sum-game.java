class Solution {
    public boolean sumGame(String num) {
       int n=num.length();
       int leftSum=0,rightSum=0;
       int left=0,right=0;
       for(int i=0;i<n/2;i++){
        if(num.charAt(i)=='?'){
            left++;
        }else{
            leftSum+=num.charAt(i)-'0';
        }
       }
        for(int j=n/2;j<n;j++){
        if(num.charAt(j)=='?'){
            right++;
        }else{
            rightSum+=num.charAt(j)-'0';
        }
        }
       return (leftSum-rightSum)*2!=(right-left)*9;
    
}
}