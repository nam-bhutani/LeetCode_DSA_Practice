class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean res=true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<=nums[i+1]){
                continue;
            }
            else{
                res=false;
            }
        }
        boolean res2=true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>=nums[i+1]){
                continue;
            }
            else{
                res2=false;
            }
        }
        return res||res2;
    }
}