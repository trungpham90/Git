/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Trung Pham
 */
public class RangeSumQueryMutable {

    public class NumArray {

        int[] nums;
        FT tree;

        public NumArray(int[] nums) {
            this.nums = nums;
            tree = new FT(nums.length + 2);
            for (int i = 0; i < nums.length; i++) {
                tree.update(i + 1, nums[i]);
            }
        }

        void update(int i, int val) {
            tree.update(i + 1, -nums[i]);
            nums[i] = val;
            tree.update(i + 1, nums[i]);
        }

        public int sumRange(int i, int j) {
            long a = tree.get(j + 1);
            long b = i > 0 ? tree.get(i) : 0;
            return (int) (a - b);
        }

        public class FT {

            long[] data;

            FT(int n) {
                data = new long[n];
            }

            public void update(int index, long value) {
                while (index < data.length) {
                    data[index] += value;
                    index += (index & (-index));
                }
            }

            public long get(int index) {
                long result = 0;
                while (index > 0) {
                    result += data[index];
                    index -= (index & (-index));
                }
                return result;

            }
        }

    }

// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.update(1, 10);
// numArray.sumRange(1, 2);
}
