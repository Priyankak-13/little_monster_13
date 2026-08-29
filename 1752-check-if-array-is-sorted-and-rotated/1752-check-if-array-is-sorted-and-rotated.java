class Solution {
    public boolean check(int[] nums) {
        
        int count = 0;
        int n = nums.length - 1;

        for(int i = 0; i<n ; i++){

            if(nums[i] > nums[i+1]){
                count ++;
            }
        }

        if(nums[nums.length - 1] > nums[0]){
            count ++;
        }

        return count <= 1;
    }
}