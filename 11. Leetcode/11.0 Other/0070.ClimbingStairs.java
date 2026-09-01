class Solution {
    public int climbStairs(int n) {
        if(n<=2) return n;

        int way1 = 1, way2 = 2;
        int current = 0;

        for(int i = 3; i<=n; i++){
            current = way1 + way2;
            way1 = way2;
            way2 = current;
        }
        return current;
    }
}