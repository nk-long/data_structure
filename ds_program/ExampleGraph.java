import java.util.LinkedList;

public class ExampleGraph {
    
    private LinkedList<Integer> adj[];

    public ExampleGraph(int x){

        adj = new LinkedList[x];
        for(int i=0;i<x;i++)
        {
            adj[i]=new LinkedList<>();
        }
    }


    public void addEdge(int src,int dest){
        adj[src].add(dest);
        adj[dest].add(src);
    }


    public void printGraph(int node){
        for(int i=0;i<node;i++){
            System.out.print("node "+i);
            if(adj[i].size() > 0){
                for(int j=0;j<adj[i].size();j++)
                    System.out.print( " => "+ adj[i].get(j)+" ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        ExampleGraph graph=new ExampleGraph(6);
        graph. addEdge(1,2);
        graph.addEdge(1,3);
        //graph.addEdge(2,1);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(2,5);
        //graph.addEdge(3,2);
        //graph.addEdge(3,1);
        graph.addEdge(3,4);
        //graph.addEdge(4,3);
        //graph.addEdge(4,2);
        graph.addEdge(4,5);
        //graph.addEdge(5,2);
        //graph.addEdge(5,4);
        graph.printGraph(6);




    }
    
}
