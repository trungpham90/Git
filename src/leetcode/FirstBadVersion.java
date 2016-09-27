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
public class FirstBadVersion {

    class VersionControl {

        boolean isBadVersion(int version) {
            return true;
        }
    }

    public class Solution extends VersionControl {

        public int firstBadVersion(int n) {
            int st = 1;
            int ed = n;
            int result = n;
            while (st <= ed) {
                int mid = st + ((ed - st) >> 1);
                if (isBadVersion(mid)) {
                    result = mid;
                    ed = mid - 1;
                } else {
                    st = mid + 1;
                }
            }
            return (int) result;
        }
    }
}
