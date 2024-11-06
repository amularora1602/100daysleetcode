// remove element from the array
class Solution {
    public int removeElement(int[] nums, int val) {
        int n =nums.length;
        int k =0;
        for(int i =0;i<n;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }

        }   
        return k;   
    }
}

//Search Insert Position

class Solution {
    public int searchInsert(int[] nums, int target) {
        int k =0;
        int n=nums.length;
        int e=n-1;
        while(k<=e){
            int mid=k+(e-k)/2;
            if(nums[mid]==target)return mid;
            else if(nums[mid]<target){
                k=mid+1;
            }
            else if(nums[mid]>target){
                e=mid-1;
            }
        }
        return k;
    }
}

