// class Solution {
//     public String interpret(String command) {
//         StringBuilder ans = new StringBuilder("");
//         for(int i = 0; i<command.length(); i++){
//             if(command.charAt(i) == '(' && i+1<command.length() && command.charAt(i+1) == ')'){
//                 ans.append("o");
//             } else if(command.charAt(i) == '(' || command.charAt(i) == ')'){
//                 continue;
//             } else{
//                 ans.append(command.charAt(i));
//             }
//         }
//         return ans.toString();
//     }
// }


class Solution {
    public String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }
}