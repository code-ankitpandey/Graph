package com.Graph;
class UnweightedGraph{
    final private int v;
    final private int [][]arr;
    public UnweightedGraph(int v){
        this.v=v;
        arr=new int [v+1][v+1];
    }
    public void fillGraph(int vertex,int edge){
        arr[vertex][edge]=1;
        arr[edge][vertex]=1;
    }
    public void printGraph(){
        for(int i=1;i<arr.length;i++){
            System.out.print(i+"->");
            for (int j=1;j< arr.length;j++){
                if(arr[i][j]==1){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
    public int size(){
        return v;
    }
}
class WeightedGraph{
    final private int v;
    final private int arr[][][];
    public WeightedGraph(int v){
        this.v=v;
        arr=new int [v+1][v+1][2];
    }
    public void fillGraph(int vertex,int edge,int weight){
        arr[vertex][edge][0]=1;
        arr[vertex][edge][1]=weight;
        arr[edge][vertex][0]=1;
        arr[edge][vertex][1]=weight;

    }
    public void printGraph(){
        for(int i=1;i<arr.length;i++){

            for (int j=1;j<arr.length;j++){
                if(arr[i][j][0]==1){
                    System.out.println(i+"->"+j+" with weight of "+arr[i][j][1]);
                }
            }
            System.out.println();
        }
    }
}
public class Graph01MatrixImplementation {
    public static void main(String[] args) {
        UnweightedGraph graph=new UnweightedGraph(8);
        graph.fillGraph(1,3);
        graph.fillGraph(1,2);
        graph.fillGraph(2,5);
        graph.fillGraph(2,6);
        graph.fillGraph(3,4);
        graph.fillGraph(3,7);
        graph.fillGraph(4,8);
        graph.fillGraph(7,8);
        graph.printGraph();

        WeightedGraph graph1=new WeightedGraph(8);
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
