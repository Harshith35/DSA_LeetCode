class Solution {
    public int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();
        int ans= 0, cnt = 0;
        for(char c : s.toCharArray()){
            if(c=='('){
                cnt += 2;
                if(cnt % 2 != 0){
                    ans++;
                    cnt--;
                }
            }else{
                cnt--;
                if(cnt < 0){
                    ans++;
                    cnt += 2;
                }
            }
        }
        return ans + cnt;
    }
}