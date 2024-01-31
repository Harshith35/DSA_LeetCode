class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int i = 0;
        int len = arr.length;
        int index=0;
        while(i<len-1){
            if (arr[i] > arr[i+1]){
                index = i;
                break;
            }
            i++;
        }
        return index;
    }
}