package com.hackerRank.problemSolving;

import java.util.*;

/*
Given n email addresses of different domains, please send an email to the first
address(in alphabetical order) of each domain. Please assume a function sendmail()
to send the emails. A sample email array is following :

{ghi@hotmail.com, def@yahoo.com, ghi@gmail.com, abc@channelier.com,
abc@hotmail.com, def@hotmail.com, abc@gmail.com, abc@yahoo.com,
def@channelier.com,jkl@hotmail.com, ghi@yahoo.com, def@gmail.com }
 */
public class SortMail {
    public static void main(String[] args) {
        String[] arr = {"ghi@hotmail.com", "def@yahoo.com", "ghi@gmail.com", "abc@channelier.com",
        "abc@hotmail.com", "def@hotmail.com", "abc@gmail.com", "abc@yahoo.com",
        "def@channelier.com","jkl@hotmail.com", "ghi@yahoo.com","def@gmail.com" };
        createMap(arr);
    }
    private static void createMap(String[] arr){
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        NavigableSet<String> set = new TreeSet<>();

        for (String s : arr) {
            String[] str = s.split("@");
            set.add(str[1]);
        }
        Stack<String> stk = new Stack<>();
        int n = set.size();
        for (int i = 0; i < n; i++) {
            stk.add(set.pollLast());
        }
//        System.out.println(stk);
        int x = 0;
        List<ArrayList<String>> list = new ArrayList<>();
        while(!stk.isEmpty()){
            String s1 = stk.pop();
            ArrayList<String> temp = new ArrayList<>();
            temp.add(s1);
            for (String s : arr) {
                String[] s2 = s.split("@");
                if (s1.equals(s2[1])) {
                    temp.add(s2[0]);
                }
            }
            list.add(temp);
        }
//        System.out.println(list);
        sendMail(list);
    }
    private static void sendMail(List<ArrayList<String>> list){
        for (ArrayList<String> strings : list) {
            String domain = strings.get(0);
            for (int j = 1; j < strings.size(); j++) {
                System.out.println(strings.get(j) + "@" + domain);
            }
        }
    }
}
