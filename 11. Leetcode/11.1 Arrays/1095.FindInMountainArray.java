/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index);
 *     public int length();
 * }
 */

interface MountainArray {
    int get(int index);
    int length();
}

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakIndex(mountainArr);
        
        int firstTry = binarySearch(mountainArr, target, 0, peak, true);
        if (firstTry != -1) {
            return firstTry;
        }
        
        return binarySearch(mountainArr, target, peak + 1, mountainArr.length() - 1, false);
    }

    private int peakIndex(MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() - 1;
        
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    private int binarySearch(MountainArray mountainArr, int target, int start, int end, boolean isAscending) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midVal = mountainArr.get(mid);
            
            if (midVal == target) {
                return mid;
            }
            
            if (isAscending) {
                if (target < midVal) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > midVal) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}