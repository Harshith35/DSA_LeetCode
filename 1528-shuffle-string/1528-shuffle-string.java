class Solution {
    public String restoreString(String s, int[] indices) {
        char[] input = s.toCharArray();
        char[] result = input.clone();
        int i = 0;
        for(int index : indices){
            result[index] = input[i++];
            //System.out.println(result[index]);
        }
        
        return new String(result);
    }
}