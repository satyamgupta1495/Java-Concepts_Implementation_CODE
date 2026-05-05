package com.datastructure.graph;

import java.util.ArrayList;

public class DFS_V2 {

    public static void main(String[] args) {
        int vertices = 11;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(1);
        adj.get(1).add(0);

        adj.get(1).add(2);
        adj.get(2).add(1);

        adj.get(2).add(3);

        adj.get(3).add(2);
        adj.get(3).add(4);
        adj.get(3).add(5);
        adj.get(3).add(7);

        adj.get(4).add(6);
        adj.get(4).add(3);

        adj.get(5).add(3);
        adj.get(5).add(8);

        adj.get(6).add(4);
        adj.get(6).add(9);

        adj.get(7).add(3);
        adj.get(7).add(9);
        adj.get(7).add(10);

        adj.get(8).add(5);
        adj.get(8).add(10);

        adj.get(9).add(6);
        adj.get(9).add(7);
        adj.get(9).add(10);

        adj.get(10).add(9);
        adj.get(10).add(7);
        adj.get(10).add(8);

        System.out.println(adj);

        // adj : [[1], [0, 2], [1, 3], [2, 4, 5, 7], [6, 3], [3, 8], [4, 9], [3, 9, 10], [5, 10], [6, 7, 10], [9, 7, 8]]

        dfsInit(11, adj);
    }

    public static void dfsInit(int totalNode, ArrayList<ArrayList<Integer>> adj ){
        ArrayList<Integer> ls = new ArrayList<>();
        boolean[] visited = new boolean[totalNode];
        dfs(5, visited, adj, ls);
        System.out.println(ls);

    }

    public static void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ls){
        visited[node] = true;
        ls.add(node);

        for(Integer neighbourNode : adj.get(node)){
            if(!visited[neighbourNode]){
                dfs(neighbourNode, visited, adj, ls);
            }
        }
    }



}
