class Solution {
    public int search(int[] nums, int target) {
        return helper(nums,target,0,nums.length-1);
    }
    public int helper(int[] n,int t,int s,int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(n[m]==t){
            return m;
        }
        if(n[s]<=n[m]){
            if(n[s]<= t && t < n[m])   return helper(n,t,s,m-1);
            else    return helper(n,t,m+1,e);
        }
        else{
            if(n[m] < t && t <= n[e])
                    return helper(n,t,m+1,e);
            else
                return helper(n,t,s,m-1);
        }
    }
}