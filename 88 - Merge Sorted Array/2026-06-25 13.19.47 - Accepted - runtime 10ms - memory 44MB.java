class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        System.out.println(i);
        int j = n - 1;
        System.out.println(j);
        int k = m + n - 1;
        System.out.println(k);

      while(i >= 0 && j >= 0){
        if(nums1[i] > nums2[j]){
            System.out.println ("enter");
            nums1[k] = nums1[i];
            i -= 1;
            System.out.println(nums1[k]);
        } else {
            nums1[k] = nums2[j];
            j -= 1;
        }
        k -= 1;
       }

       while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
}

      
    }
}