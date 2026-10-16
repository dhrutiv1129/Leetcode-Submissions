class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> l = new ArrayList<>();
        int right = 0;
        int left = 0;
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            System.out.println("iteration" + i);
            int curr = nums[i];
            System.out.println(curr);
            int rem = 0 - curr;
            System.out.println(rem);
            left = i + 1;
            System.out.println(left);
            right = nums.length - 1;
            System.out.println(right);
            while(left < right){
                // sum of left and right are greater than rem
                if(nums[left] + nums[right] > rem){
                    right -= 1;
                // sum of left and right are less than rem
                } else if(nums[left] + nums[right] < rem){
                    left += 1;
                // sum of left and right are equal to rem
                } else if(nums[left] + nums[right] == rem){
                    System.out.println("entered");
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        l.add(list); 
                    // create a new array / array list to store the triplet 
                    // add to the array
                    // add the array of triplets to the other array
                    // increment
                    left++;
                    right--;
                     while (left < right && nums[left] == nums[left - 1]) {
        left++;
    }

    while (left < right && nums[right] == nums[right + 1]) {
        right--;
    }
                }
            }

        }
        return l;  
    }
}