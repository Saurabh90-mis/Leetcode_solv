/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak= findPeak(mountainArr);
        int res =findtarget(mountainArr,0,peak,target, true);
        if(res!=-1){
            return res;
        }
        return findtarget(mountainArr,peak+1,mountainArr.length()-1,target,false);
    }

        private int findtarget(MountainArray mountainArr, int l, int r,int target, boolean isUp){
            while(l<=r){
            int mid=l+(r-l)/2;
            int midV=mountainArr.get(mid);
            if(midV==target){
                return mid;
            }
            if(isUp){
            if(target>midV){
                l=mid+1;

            }else{
                r=mid-1;
            }
            }else{
                if(target>midV){
                    r=mid-1;
                }else{
                    l=mid+1;
                }
            }
        }
        return -1;
    }
        private int findPeak(MountainArray mountainArr){
       int l=0, r=mountainArr.length()-1;
       while(l<r){
        int mid=l+(r-l)/2;
        if(mountainArr.get(mid)<mountainArr.get(mid+1)){
            l=mid+1;
        }else{
            r=mid;
        }
       }
       return l; 
    }
}