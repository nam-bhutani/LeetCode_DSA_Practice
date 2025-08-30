class Solution {
    public int maxSubArray(int[] nums) {
        int c=0;
        int m=Integer.MIN_VALUE;
        for(int i:nums){
            c+=i;
            m=Math.max(m,c);
            if(c<0) c=0;
        }
        return m;
    }
}