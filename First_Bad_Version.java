/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        return binarySearch(1,n);
    }
    public int binarySearch(int left,int right){
        int firstTrue = 0;
        while(left<=right){
            int mid = (left) +(right-left)/2;
            if(isBadVersion(mid)){
            //storing the first occurrence in a pointer and updating it.
                firstTrue = mid;
                right = mid-1;
            }else{
                left = mid + 1;
            }
        }
        return firstTrue;
        
        
    }
}
