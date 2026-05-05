package com.datastructure.graph;

import java.util.ArrayList;

public class DFS {
    public static void main(String[] args) {
        int V = 5;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges
        adj.get(0).add(2);
        adj.get(0).add(3);
        adj.get(0).add(1);

        adj.get(1).add(0);

        adj.get(2).add(0);
        adj.get(2).add(4);

        adj.get(3).add(0);

        adj.get(4).add(2);

        System.out.println(adj);
        DFS obj = new DFS();
        ArrayList<Integer> result = obj.dfsOfGraph(V, adj);

        System.out.println(result);
    }

    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        ArrayList<Integer> ls = new ArrayList<>();

        dfs(0, visited, adj, ls);
        return ls;
    }

    private static void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ls) {
        visited[node] = true;
        ls.add(node);

        for (Integer it : adj.get(node)) {
            if (!visited[it]) {
                dfs(it, visited, adj, ls);
            }
        }
    }
}