package com.datastructure.graph;

import java.util.*;


public class G1_AllPathsFromSourcetoTarget {
    public static void main(String[] args) {
        int[][] graph = {{1,2},{3},{3},{}};
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(graph, result, path, 0);

        for (List<Integer> list:result) {
            System.out.println(list);
        }
    }

    private static void dfs(int[][] graph, List<List<Integer>> result, List<Integer> path, int u) {

        //! Base condition
        path.add(u);
        if (u == graph.length-1) result.add(new ArrayList<>(path));
        else  {
            for(int v:graph[u])dfs(graph, result, path, v);
        }
        path.remove(path.size()-1);


    }
}
