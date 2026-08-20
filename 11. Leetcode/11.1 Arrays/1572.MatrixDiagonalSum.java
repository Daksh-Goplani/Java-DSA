class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int i = 0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                if(j==i || j+i == mat.length-1){
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }
}