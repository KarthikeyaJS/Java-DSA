// -> all positives elements->return the product of the entire array
// -> all negative elements and the  count of the negative eleemts are even->return the product of the entire array
// ->negative elements and the count of negative elements is odd

// 2   3   0 -5  6   -1  4

// -1  * -720=>720

class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int left=1;
        int right=1;
        int res=nums[0];
        for(int i=0;i<n;i++){
            left=left*nums[i];
            right=right*nums[n-1-i];
            res=Math.max(res,Math.max(left,right));

            left=left==0?1:left;
            right=right==0?1:right;

        }
        return res;
    }
}