class Solution {
    public int maxDistinct(String s) {
         List<Character> ls = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
           if(!ls.contains(ch)) ls.add(ch);
        }
        return ls.size();
    }
}