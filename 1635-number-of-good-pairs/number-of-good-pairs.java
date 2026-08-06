class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n=nums.length;
        int ans=0,count[]= new int[101];
        for(int arr: nums){
            ans+=count[arr]++;
        }
        return ans;

    }
}