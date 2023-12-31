package com.Graph;
import java.util.*;

class UnweightedListGraph{
    HashMap<Integer,List<Integer>>map;
    public UnweightedListGraph(){
        map=new HashMap<>();
    }
    public  void fillGraph(int vertex,int edge){
        if(!map.containsKey(vertex)){
            map.put(vertex,new ArrayList<Integer>());
        }
        map.get(vertex).add(edge);
    }
    public void printGraph(){
        for (int i:map.keySet()){
            System.out.println(i+"->"+map.get(i));
        }
    }
    public HashMap getGraph(){
        return map;
    }
    public int size(){
        return map.size();
    }

}
class WeightedListGraph{
    List<int[]>list;
    public WeightedListGraph(){
        list=new LinkedList<>();
    }
    public void fillGraph(int vertex,int edge,int weight){
        list.add(new int[]{vertex,edge,weight});
        list.add(new int[]{edge,vertex,weight});
    }
    public void printGraph(){
        for (int[]arr:list){
            System.out.println(arr[0]+"->"+arr[1]+"with weight of "+arr[2]);
        }
    }

}
public class Graph02ListImplementation {
    public static void main(String[] args) {
        UnweightedListGraph graph=new UnweightedListGraph();
        graph.fillGraph(1,3);
        graph.fillGraph(1,2);
        graph.fillGraph(2,5);
        graph.fillGraph(2,6);
        graph.fillGraph(3,4);
        graph.fillGraph(3,7);
        graph.fillGraph(4,8);
        graph.fillGraph(7,8);
        graph.printGraph();

        WeightedListGraph graph1=new WeightedListGraph();
        graph1.fillGraph(1,3,1);
        graph1.fillGraph(1,2,12);
        graph1.fillGraph(2,5,8);
        graph1.fillGraph(2,6,2);
        graph1.fillGraph(3,4,8);
        graph1.fillGraph(3,7,3);
        graph1.fillGraph(4,8,7);
        graph1.fillGraph(7,8,6);

        graph1.printGraph();
    }
}
