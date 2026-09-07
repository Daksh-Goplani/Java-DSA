/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

class VersionControl {
    int firstBad = 4;

    boolean isBadVersion(int version) {
        return version >= firstBad;
    }
}

class Solution extends VersionControl {
    int firstBadVersion(int n) {
        int start = 1, end = n;
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(isBadVersion(mid)){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return start;
    }
}