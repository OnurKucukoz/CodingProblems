class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i1=m - 1;
        int i2=nums2.length-1;
        int j=nums1.length -1;
        
        
        while(i1 >=0 && i2 >=0){
            if(nums1[i1]<nums2[i2]){
                nums1[j]=nums2[i2];
                j--;
                i2--;
            }
            
            else{
                nums1[j]=nums1[i1];
                j--;
                i1--;
                
                
            }
                
        }
        while(i2>=0){
          nums1[j] = nums2[i2];
            i2--;
            j--;
        }
        
}}
