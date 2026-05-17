package com.datastructure;

import java.util.*;

public class NewStart {
    public static void main(String[] args) {
//        int a = reverseDigitsMath(123);
//        System.out.println(a);

//        int[] nums = {1, 3, 3, 4, 8, 8};
//        int ans = removeDuplicatesNoSetup(nums);
//        System.out.println(ans);

//        int[] nums = {1,2,3,4,5,6,7};
//        int k = 3;
//        rotate(nums, k);

//        moveZeroes
//        int[] nums = {0,1,0,3,12};
//        moveZeroes(nums);

//        int[] a = {1, 4, 4, 6, 7};
//        int[] b = {1, 2, 3, 6, 7};
//        findUnion(a, b);

//        int[] nums = {1,2,3,5};
//        int ans = missingNumberMATH(nums);
//        System.out.println(ans);

//        int[] nums = {1,1,0,1,1,1};
//        int ans = findMaxConsecutiveOnes(nums);
//        System.out.println(ans);

//        int[] nums = {4,1,2,1,2};
//        singleNumber(nums);
//        System.out.println(ans);

//        int[] nums = {2,0,2,1,1,0};
//        int[] nums = {1, 2 ,1};
//        sortColors(nums);x

//        int[] nums = {2,2,1,1,1,2,2};
//        int[] nums = {5,4,5};
//        int ans = majorityElement(nums);
//        System.out.println(ans);

//        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
//        int ans = maxSubArrayPrintSubarray(nums);
//        System.out.println(ans);

//        int[] digits = {1,2,3};
//        plusOne(digits);

//        int[] nums = {7,6,4,3,1};
//        int[] nums = {1, 2};
//        System.out.println(maxProfit(nums));

//        String s = "the sky    is blue";
//        String ans = reverseWords(s);
//        System.out.println(ans);

//        int[] nums = {1,2,3,4};
//        productExceptSelf(nums);

//        int n = 5;
//        generate(n);

//        int[] nums = {1,2};
//        majorityElement2(nums);

//        int[] nums = {8154,9139,8194,3346,5450,9190,133,8239,4606,8671,8412,6290};
//        int ans = mostFrequentEven(nums);
//        System.out.println(ans);
//
//        int[] nums = {0,2};
//        maxProduct(nums);

//        repeatedCharacter("abccbaacz");

        int[] nums = {-4,-1,0,3,10};
        sortedSquares(nums);

    }

    public static int reverseDigits(int n) {
        StringBuffer sb = new StringBuffer(String.valueOf(n));
        return Integer.parseInt(sb.reverse().toString());
    }

    public static int reverseDigitsMath(int n) {
        int revNo = 0;
        while(n > 0){
            int temp = n % 10;
            revNo = revNo * 10 + temp;
            n = n / 10;
        }
        return revNo;
    }

    public static int removeDuplicatesUsingSet(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int elem : nums){
            set.add(elem);
        }
        return set.size();
    }

    public static ArrayList<Integer> removeDuplicates(int[] arr) {
        HashSet<Integer> set = new LinkedHashSet<>();
        for(int elem : arr){
            set.add(elem);
        }
        return new ArrayList<>(set);
    }

    public static int removeDuplicatesNoSet(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int elem : nums){
            if(!ans.contains(elem)){
                ans.add(elem);
            }
        }
        return ans.size();
    }

    public static int removeDuplicatesNoSetup(int[] nums) {
       int idx = 1;

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]){
                nums[idx++] = nums[i];
            }
        }
        return idx;
    }

    public static void rotate(int[] nums, int k) {
        // nums = [1,2,3,4,5,6,7];
        int[] ans = new int[nums.length];
        int temp = nums[nums.length-1];

        for (int i = 0; i < nums.length; i++) {
            int newIndex = (i + k) % nums.length;
            ans[newIndex] = nums[i];
        }

        // Note : or rotate around k element
    }

    public static void moveZeroes(int[] nums) {
        int i = 0, j = 0;
        while(j < nums.length){
            if(nums[j] != 0 ){
                swap(nums, i, j);
                i++;
            }
            j++;

            System.out.println(Arrays.toString(nums));
        }
    }

    public static void findUnion(int a[], int b[]) {
//        https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1
//        Input: a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3, 6, 7]
//        Output: [1, 2, 3, 4, 5, 6, 7]
//        Explanation: Distinct elements including both the arrays are: 1 2 3 4 5 6 7.

        ArrayList<Integer> list = new ArrayList<>();

        int i = 0, j = 0;
        int n1 = a.length;
        int n2 = b.length;

        while(i < n1 && j < n2){
            if(a[i] == b[j]){
                if(list.isEmpty() || list.get(list.size() - 1) != a[i]){
                    list.add(a[i]);
                }
                i++;
                j++;
            } else if(a[i] < b[j]){
                if (list.isEmpty() || list.get(list.size() - 1) != a[i]) {
                    list.add(a[i]);
                }
                i++;
            }else{
                if (list.isEmpty() || list.get(list.size() - 1) != b[j]) {
                    list.add(b[j]);
                }
                j++;
            }
        }

        while (i < n1) {
            if (list.isEmpty() || list.get(list.size() - 1) != a[i]) {
                list.add(a[i]);
            }
            i++;
        }

        while (j < n2) {
            if (list.isEmpty() || list.get(list.size() - 1) != b[j]) {
                list.add(b[j]);
            }
            j++;
        }
        System.out.println(list);
    }
    
    public static int missingNumber(int[] nums){
        int i = 0, n = nums.length;
        Arrays.sort(nums);
        while(i < n){
            if(nums[i] != i+1){
                return i+1;
            }
            i++;
        }
        System.out.println(i);
        return i+1;
    }

    public static int missingNumberMATH(int[] nums){
        int sum = 0;
        int n = nums.length+1;
        int actualSum = n * (n+1) / 2;


        for(int elem : nums){
            sum += elem;
        }

        return actualSum-sum;
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                ans++;
            }else{
                ans = 0;
            }
            res = Math.max(ans, res);
        }
        return res;
    }

    public static void singleNumber(int[] nums) {

//        most optimized :
        int ans = 0;
        for (int num : nums) {
            System.out.println(ans);
            ans ^= num;
        }

        System.out.println( "ANS : " + ans);

        for(int i =0 ; i<=(nums.length) % nums.length; ++i){
            System.out.println(nums[i]);
        }
//        return ans;

        //https://leetcode.com/problems/single-number/
//        Example 1:
//        Input: nums = [2,2,1]
//        Output: 1

//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for (int num : nums){
//            map.put(num, map.getOrDefault(num, 0) + 1 );
//        }
//
//        for (int key : map.keySet()) {
//            if(map.getOrDefault(key, 0) == 1){
//                return key;
//            }
//        }
//
//        System.out.println(map);
//        return -1;

    }

    public static void sortColorsIn2Pass(int[] nums) {
        //      https://leetcode.com/problems/sort-colors/description/
        //      Input: nums = [2,0,2,1,1,0]
        //      Output: [0,0,1,1,2,2]

        int n = nums.length;
        int i = 0, j = 0;

        while(j < n){
            if(nums[j] == 0){
                swap(nums, i, j);
                i++;
            }
            j++;
        }

        j = i;

        while(j < n){
            if(nums[j] == 1){
                swap(nums, i, j);
                i++;
            }
            j++;
        }

        System.out.println(Arrays.toString(nums));
    }

    //*  DUTCH NATIONAL FLAG
    public static void sortColors(int[] nums){
        // Input: nums = [2,0,2,1,1,0]
        // psitn: nums = [i,-,-,-,-,j]

        int n = nums.length;
        int i = 0, mid = 0, j = n -1;

        for (int k = 0; k < n; k++) {
            if(nums[mid] == 0){
                swap(nums, mid, i);
                i++;
                mid++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                swap(nums, mid, j);
                j--;
            }
        }

        System.out.println(Arrays.toString(nums));


    }

    //* MOORE'S VOTING ALGORITHM
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        int temp = nums.length/2;
        System.out.println("TEMP : " + temp);
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            } else {
                map.put(num, 1);
            }
        }

        System.out.println("MAP : " + map);

        System.out.println(map.keySet());
        for(int key : map.keySet()){
            if(map.get(key) > temp){
                return key;
            }
        }

        return -1;
    }

    //* KADANE'S ALGORITHM [MAXIMUM SUB-ARRAY SUM]
    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum > max){
                max = sum;
            }

            if(sum < 0){
                sum = 0;
            }
        }

        return max;
    }

    //* KADANE'S ALGORITHM EXTENDED
    public static int maxSubArrayPrintSubarray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int s = -1, e = -1;
        int tmp = -1;

        for (int i = 0; i < nums.length; i++) {
            if(sum == 0) tmp = i;
            sum += nums[i];

            if (sum > max){
                max = sum;
                s = tmp;
                e = i;
            }

            if(sum < 0){
                sum = 0;
            }
        }

        System.out.println("Start : " + s + " End : " +  e);
        return max;
    }

    public static void plusOne(int[] digits) {
        //digits =  [1,2,3]
        StringBuffer bf = new StringBuffer();

        for (int i = 0; i < digits.length; i++) {
            bf.append(digits[i]);
        }
        System.out.println("BF : " + bf);
        int temp = Integer.parseInt(bf.toString());
        temp++;
        System.out.println("TEMP : " + temp);

        String str = String.valueOf(temp);
        int[] res = new int[str.length()];

        System.out.println("STR : " + str);

        for (int i = 0; i < str.length(); i++) {
            res[i] = str.charAt(i) - '0';
        }

        System.out.println(Arrays.toString(res));

    }

    public static int maxProfit(int[] prices) {
        int res = 0;
        int n = prices.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <= n-1; j++) {
                int temp = prices[j] - prices[i];
                System.out.println(temp);
                System.out.println(res);
                if(res < temp){
                    res = temp;
                }
            }
        }
        return res;

    }

    public static String reverseWords(String s) {
        ArrayList<String> ls = new ArrayList<>();

        String[] res =  s.split(" ");

        for (String elem : res){
            if(!elem.isEmpty()){
                ls.add(elem);
            }
        }

        int i = ls.size()-1;

        StringBuffer bf = new StringBuffer();

        while(i >= 0){
            bf.append(ls.get(i));
            bf.append(" ");
            i--;
        }

        System.out.println(bf);
        return bf.toString().trim();
    }

    public static void productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        for(int i = 0; i < n; i++){
            if(i == 0){
                prefix[i] = 1;
            }else{
                prefix[i] = prefix[i-1] * nums[i-1];
            }
        }

        for(int i = n-1; i >= 0; i--){
            if(i == n-1){
                suffix[i] = 1;
            }else{
                suffix[i] = suffix[i+1] * nums[i+1];
            }
        }

        System.out.println(Arrays.toString(prefix));
        System.out.println(Arrays.toString(suffix));

    }

    public static int[] searchRange(int[] nums, int target) {
        int firstIdx = -1, lastIdx = -1;
        int n = nums.length;
        int i = 0, j = n-1;
        while(i < n){
            if(nums[i] == target){
                firstIdx = i;
                break;
            }
            i++;
        }

        while(j >= 0){
            if(nums[j] == target){
                lastIdx = j;
                break;
            }
            j--;
        }

        return new int[] {firstIdx, lastIdx};
    }

    public static void generate(int n) {
        //return  List<List<Integer>>
        int[][] ans = new int[n][];

        for (int i = 0; i < n; i++) {
            int[] temp = new int[i+1];
            for (int j = 0; j <= i; j++) {
                if (0 == j || i == j) {
                    temp[j] = 1;
                }else{
//                    temp[j] = ans[j][j-1] + ans[j][j+1];
                    temp[j] = ans[i - 1][j - 1] + ans[i - 1][j];
                }
            }
            ans[i] = temp;
        }

        for (int[] elem : ans){
            System.out.println(Arrays.toString(elem));
        }

    }

    public static void majorityElement2(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int temp = nums.length/3;

        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num, map.getOrDefault(num, 0) + 1);
            }else{
                map.put(num, 1);
            }
        }

        for(int key : map.keySet()){
            if(map.get(key) > temp){
                ls.add(key);
            }
        }

        System.out.println(ls);
    }

    public static int mostFrequentEven(int[] nums) {
        int ans = -1;
        int occurence = -1;
        Map<Integer, Integer> map = new TreeMap<>();

        for(int num : nums){
            if(0 == num % 2){
                if(map.containsKey(num)){
                    map.put(num, map.getOrDefault(num, 0) + 1);
                }else{
                    map.put(num, 1);
                }
            }
        }

        for(int key : map.keySet()){
            if(map.get(key) > occurence){
                occurence = map.get(key);
                ans = key;
            }
        }

        return ans;
    }

    public static void maxProduct(int[] nums) {
        int res = Integer.MIN_VALUE;
        int n = nums.length;
        int[] arr = new int[n];

        arr[0] = nums[0];
        for (int i = 1; i < n; i++) {
            if(nums[i] > 0){
                arr[i] = nums[i] * nums[i-1];
            }

        }

        System.out.println(Arrays.toString(arr));

        for(int num : arr){
            if(num > res){
                res = num;
            }
        }

        System.out.println(res);
    }

    public static void repeatedCharacter(String s) {

        int num = 1;
        int num2 = 2;

        System.out.println(num ^ num2);

        Set<Character> st = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if(st.contains(s.charAt(i))){
                System.out.println(s.charAt(i));
                break;
            }else{
                st.add(s.charAt(i));
            }
        }

        // return '\0';
    }

    public static void sortedSquares(int[] nums) {

//        int[] nums = {-4,-1,0,3,10};

        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> pos = new ArrayList<>();




        System.out.println(Arrays.toString(ans));
    }



    // ============================ HELPER FUNCTIONS ============================

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}


