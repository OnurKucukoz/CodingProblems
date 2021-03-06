class Solution {
    public int search(int[] nums, int target) {
        
        int lo = 0; 
        int high = nums.length -1;
        
        while(lo<high){
            int mid=((high-lo + 1)/2+lo);
            
             if(target<nums[mid]){
                 high=mid-1;
            }
               
            else
                lo=mid;
        }
       int res=nums[lo]== target ? lo: -1;  
         return res;
       
    }
}

