// bit manipulation
// xor operation

// 1.number xor with itself results in 0
//     5^5=>0
//     2^2=>0

// 2.number xor with 0 results in the same number
//     5^0=>5
//     2^0=>2

// 3.order in which we xor deosnt matter
//     3^5=5^3
//     3^5^2=2^3^5=5^3^2
// 4.grouping of elemnts doesnt matter
//     (5^3)^2=5^(3^2)

// 4 1 2 1 2

// 4^1^2^1^2
// 4^1^1^2^2(rule 3)
// 4^(1^1)^(2^2) (rule 4)
// 4^0^0(rule 1)
// 4^0=>4(rule 2)



class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            res=res^nums[i];
        }
        return res;
    }
}