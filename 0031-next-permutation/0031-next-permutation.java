class Solution {
    public void nextPermutation(int[] nums) {
        
        int ind = -1;
        int n= nums.length;

        //find the first drecesing element form the end
        for(int i = n-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                ind = i;
                break;
            }
        }
        /// if there is no element exists reverse the entire array
        if(ind == -1){
            int left = 0;
            int right = n-1;

            while(left < right ){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left ++;
                right --;

            }
            return;
        }
        /// find the greater element from the end
        for(int i = n-1; i>ind ; i--){
            if(nums[i] > nums[ind]){
                int temp = nums[i];
                nums[i] = nums[ind];
                nums[ind] = temp;

                break;
            }
        }
        /// sort the remaining array
        int left = ind = ind +1;
        int right = n-1;

        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left ++;
            right --;
        }
    }
}