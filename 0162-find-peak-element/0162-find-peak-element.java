class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        //int res = 0;
        while(start < end){
            int mid = (int)(start + (end - start)/2);
            if(nums[mid]<nums[mid+1]){
                start = mid + 1;
            }else{
                //res = mid;
                end = mid;
            } 
        }
        return end;
    }
}