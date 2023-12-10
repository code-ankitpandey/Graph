package com.Graph;

import com.sun.jdi.request.ClassPrepareRequest;

import javax.sound.sampled.Line;
import java.lang.reflect.Array;
import java.util.*;

public class Graph03BFS {
    public static void main(String[] args) {
        UnweightedListGraph graph=new UnweightedListGraph();
        fill(graph);
        List<Integer>list=new ArrayList<>();
        boolean visited[]=new boolean[graph.size()+1];
        HashMap map=graph.getGraph();
        Queue<Integer>q=new LinkedList<>();
        q.add((int)map.keySet().toArray()[0]);
        while(!q.isEmpty()){
            int node=q.poll();
            if(!visited[node]){
                visited[node]=true;
                list.add(node);
                ArrayList<Integer>list1=(ArrayList<Integer>) map.get(node);
                for (int i:list1){
                    q.offer(i);
                }
            }
        }
        System.out.println(list);

    }

    public static void fill(UnweightedListGraph graph){
        graph.fillGraph(1,2);
        graph.fillGraph(1,3);

        graph.fillGraph(2,1);
        graph.fillGraph(2,5);
        graph.fillGraph(2,6);

        graph.fillGraph(3,1);
        graph.fillGraph(3,4);
        graph.fillGraph(3,7);

        graph.fillGraph(4,8);
        graph.fillGraph(4,3);


        graph.fillGraph(5,2);
        graph.fillGraph(6,2);


        graph.fillGraph(7,8);
        graph.fillGraph(7,3);

        graph.fillGraph(8,4);
        graph.fillGraph(8,7);


    }
}
