package com.hackerRank.problemSolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestNumberinMultiplicationTable {
    public static void main(String[] args) {
        int ans = getSmallest(2,3,6);
        System.out.println(ans);
    }

    static int getSmallest(int n, int m, int k){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m ; j++) {
                list.add(i*j);
            }
        }
        Collections.sort(list);
        System.out.println(list);
        return list.get(k-1);
    }

    //! Another Approach Better

    class Solution {
        public boolean enough(int x, int m, int n, int k) {
            int count = 0;
            for (int i = 1; i <= m; i++) {
                count += Math.min(x / i, n);
            }
            return count >= k;
        }

        public int findKthNumber(int m, int n, int k) {
            int lo = 1, hi = m * n;
            while (lo < hi) {
                int mi = lo + (hi - lo) / 2;
                if (!enough(mi, m, n, k)) lo = mi + 1;
                else hi = mi;
            }
            return lo;
        }
    }
}
