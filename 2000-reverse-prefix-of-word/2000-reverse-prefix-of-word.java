class Solution {
    public String reversePrefix(String word, char ch) {
        int idx=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
               idx=i;
               break;
            }
        }
         for (int j = idx; j >= 0; j--) {
            sb.append(word.charAt(j));
        }
        for (int k = idx + 1; k < word.length(); k++) {
            sb.append(word.charAt(k));
        }
        return sb.toString();
    }
}