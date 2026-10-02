class Solution {
    public int minimumRecolors(String blocks, int k) {
         int l=0, white=0,ans=Integer.MAX_VALUE;
       for(int r=0;r<blocks.length();r++){
            if(blocks.charAt(r)=='W'){ white++;
            }
            if(r-l+1==k){
                ans=Math.min(ans,white);
            
                if(blocks.charAt(l)=='W'){ white--;
                }
            
            l++;   
       }
    }
       return ans; 
    }
}