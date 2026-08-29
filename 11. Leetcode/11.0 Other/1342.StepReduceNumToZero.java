// Using recursion
// class Solution {
//     public int numberOfSteps(int num) {
//         int count = 0;
//         count = steps(num, count);
//         return count;
//     }

//     private int steps(int num, int count){
//         if(num == 0){
//             return count;
//         }
//         count++;

//         if(num % 2 == 0){
//             steps(num/2, count);
//             return steps(num/2, count);
//         }
//         return steps(num-1, count);
//     }
// }

// Best approach
class Solution {
    public int numberOfSteps(int num) {
        int count = 0;
        while(num>0){
            count++;
            if(num%2 == 0){
                num /= 2;
            } else{
                num -= 1;
            }
        }
        return count;
    }
}