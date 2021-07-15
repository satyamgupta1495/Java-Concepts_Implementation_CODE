package com.hackerRank;

public class ApppendAndDelete {


    String appendAndDelete(String s, String t, int k)
    {
        int sIndex = 0, tIndex = 0;
        while(sIndex < s.length() && tIndex < t.length()){
            if(s.charAt(sIndex) == t.charAt(tIndex)){
                sIndex++;
                tIndex++;
            }
            else{
                break;
            }
        }

        int count = 0;
        count = s.length() - sIndex + t.length() - tIndex;

        if(k < count) return "No";

        if( k >= s.length() + t.length()) return "Yes"; //! Empty String

        if ((k - count) % 2 == 0) return "Yes";

        return "No";

    }

    public static void main(String[] args) {

        ApppendAndDelete a = new ApppendAndDelete();
        System.out.println(a.appendAndDelete("hackerhappy", "hackerrank",9));
    }
}
