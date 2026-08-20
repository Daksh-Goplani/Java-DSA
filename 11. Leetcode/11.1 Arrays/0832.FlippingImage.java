class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int size = image.length;
        for(int i = 0; i<size; i++){
            for(int j = 0; j<size; j++){
                if(image[i][j] == 1){
                    image[i][j] = 0;
                } else{
                    image[i][j] = 1;
                }
            }
        }
        
        for(int i= 0; i<size; i++){
            for(int j=0; j<size/2; j++){
                int temp = image[i][j];
                image[i][j] = image[i][size-j-1];
                image[i][size-j-1] = temp;
            }
        }

        return image;
    }
}