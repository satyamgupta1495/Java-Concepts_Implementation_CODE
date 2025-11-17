package com.newbeginning;

import java.util.*;

public class SlidingWindowAnd2Pointer {
    public static void main(String[] args) {

        int[] arr = {-8, 2, 3, -6, 10};
        int k = 2;
//        List<Integer> result = firstNegInt(arr, k);
//        System.out.println(result);

        String txt = "aabaabaa", pat = "aaba";
//
        int res = CountOccurrencesOfAnagramsBruteForce(pat, txt);
        System.out.println("res-->" + res);

        int res2 = CountOccurrencesOfAnagrams(pat, txt);
        System.out.println("res2-->" + res2);

//        int[] a = {1, 3, -1, -3, 5, 3, 6, 7};
//        int w = 3;

//        int[] res = maxSlidingWindow(a, w);
//        System.out.println(Arrays.toString(res));

        String s = "abcabcbb";
        int ans = lengthOfLongestSubstring(s);
        System.out.println(ans);
    }


//! =================================== FIXED WINDOW SIZE ===================================

    static List<Integer> firstNegInt(int arr[], int k) {
        List<Integer> res = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        int i =0;
        int j = 0;

        while(j < arr.length){

            //! calculation
            if(arr[j] < 0){
                queue.offer(arr[j]);
                System.out.println(queue);
            }

            //! increase window size until window size is reached;
            if(j-i+1 < k){
                j++;
            }else if (j-i+1 == k){
                if(!queue.isEmpty()){
                    res.add(queue.peek());
                }else{
                    res.add(0);
                }

                if (!queue.isEmpty() && queue.peek() == arr[i]) {
                    queue.poll();
                }

                j++;
                i++;

            }
        }

        return res;
    }

    static int CountOccurrencesOfAnagrams(String pat, String txt){
        int res = 0, k = pat.length();

//?        Input: txt = "aabaabaa", pat = "aaba"
//?        Output: 4

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : pat.toCharArray()){
            if(map.containsKey(c)){
                map.put( c, map.get(c) + 1);
            }else{
                map.put(c, 1);
            }
        }

        int i = 0, j = 0, count = map.size();
        System.out.println(map.size());

        while(j<txt.length()){
            char ch = txt.charAt(j);
            if (map.containsKey(ch)){
                map.put(ch, map.get(ch)-1);
                if (map.get(ch) == 0){
                    count--;
                }
            }

            if(j-i+1 < k){
                j++;
                continue;
            }

            if (j-i+1 == k){
                if (count == 0){
                    res++;
                }
                char currCh = txt.charAt(i);
                if (map.containsKey(currCh)){
                    if(map.get(currCh) == 0){
                        count++;
                    }
                    map.put(currCh, map.get(currCh) + 1);
                }
            }
            i++;
            j++;

        }

        return res;
    }

    static int CountOccurrencesOfAnagramsBruteForce(String pat, String txt){
        int res = 0, k = pat.length();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < txt.length(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < k; j++) {
                sb.append(txt.charAt(j));
            }
            list.add(sb.toString());
        }

        System.out.println(list);
        return res;
    }

    static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (k > n) {
            int max = Integer.MIN_VALUE;
            for (int num : nums) max = Math.max(max, num);
            return new int[]{max};
        }

        int[] res = new int[n - k + 1];
        int index = 0;
        Deque<Integer> dq = new ArrayDeque<>(); // stores VALUES only

        int i = 0, j = 0;

        while (j < n) {
            // 1️⃣ Maintain decreasing order (remove smaller values from BACK)
            while (!dq.isEmpty() && dq.peekLast() < nums[j]) {
                dq.pollLast();
            }

            // 2️⃣ Add current element to back
            dq.offerLast(nums[j]);

            // 3️⃣ If window not reached size k, expand
            if (j - i + 1 < k) {
                j++;

            }

            // 4️⃣ Record max (front of deque)
            else if (j - i + 1 == k) {
                res[index++] = dq.peekFirst();

                // 5️⃣ Remove outgoing element if it's same as the current front
                if (dq.peekFirst() == nums[i]) {
                    dq.pollFirst();
                }

                // Slide the window
                i++;
                j++;
            }
        }

        return res;
    }

//! =================================== VARIABLE WINDOW SIZE ===================================

    static int lengthOfLongestSubstring(String s) {
        int count=0;
        int i=0,j=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(j<s.length()){
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            if(j-i+1==map.size()){
                count=Math.max(count,j-i+1);
                j++;
            }
            else {
                while(map.size()<j-i+1){
                    map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                    if (map.get(s.charAt(i)) == 0) {
                        map.remove(s.charAt(i));
                    }
                    i++;
                }
                j++;
            }
        }
        return count;
    }

}


