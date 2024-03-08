class Solution {
    public int minAddToMakeValid(String s) {
        char[] ch = s.toCharArray();
        int moves = 0;
        Stack<Character> stack = new Stack<>();
        for(char c : ch){
            if(c == '('){
                stack.push(c);
            }else{
                if (stack.isEmpty()){
                    moves++;
                }else{
                    stack.pop();
                }
            }
        }
        while(!stack.isEmpty()){
            stack.pop();
            moves++;
        }
        
        return moves;
    }
}