package com.Graph;

import javax.print.attribute.HashAttributeSet;
import java.util.*;

public class Graph04DFS {
    public static void main(String[] args) {
        UnweightedListGraph graph=new UnweightedListGraph();
        fill(graph);
        List<Integer>list=new ArrayList<>();
        HashMap<Integer,Integer>map=graph.getGraph();
        int node=(int)map.keySet().toArray()[0];
        boolean vis[]=new boolean[map.size()+1];
        dfs(map,vis,list,node);
        System.out.println(list);
    }
    public static void dfs(HashMap map,boolean []vis, List<Integer>list,int node){
        if(!vis[node]){
            list.add(node);
            vis[node]=true;
            List<Integer>nodes=(ArrayList<Integer>) map.get(node);

            for (int a:nodes) {
                dfs(map,vis,list,a);
            }
        }
    }

    public static void fill(UnweightedListGraph graph){
        graph.fillGraph(1,2);
        graph.fillGraph(1,3);

        graph.fillGraph(2,1);
        graph.fillGraph(2,5);
        graph.fillGraph(2,6);

        graph.fillGraph(5,2);
        graph.fillGraph(6,2);

        graph.fillGraph(3,1);
        graph.fillGraph(3,4);
        graph.fillGraph(3,7);

        graph.fillGraph(4,8);
        graph.fillGraph(4,3);

        graph.fillGraph(8,4);
        graph.fillGraph(8,7);

        graph.fillGraph(7,8);
        graph.fillGraph(7,3);

    }
}
