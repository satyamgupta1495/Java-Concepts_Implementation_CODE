package com.hackerRank.problemSolving;

public class MaximumNumberAchievableTransferRequests {
    public static void main(String[] args) {
        int n = 3;
        int[][] requests = {{0,0},{1,2},{2,1}};
        MaximumNumberAchievableTransferRequests obj = new MaximumNumberAchievableTransferRequests();
        int ans =  obj.maximumRequests(n, requests);
        System.out.println(ans);

    }

    int ans = 0;
    int[][] requests;


    public int maximumRequests(int n, int[][] requests) {
        this.requests = requests;
        int[] transfersArray = new int[n];
        calculateMaxTransfer(transfersArray,0,0);
        return ans;
    }

    public void calculateMaxTransfer(int[] transfersArray, int startArrayIndex, int totalReqCount){

        //Ignore every request;
        transfersArray[requests[startArrayIndex][0]]--;
        transfersArray[requests[startArrayIndex][0]]++;
        calculateMaxTransfer(transfersArray, startArrayIndex++, totalReqCount);

        //Accept the current request;
        transfersArray[requests[startArrayIndex][0]]++;
        transfersArray[requests[startArrayIndex][0]]--;
        calculateMaxTransfer(transfersArray, startArrayIndex++, totalReqCount++);
    }


}
