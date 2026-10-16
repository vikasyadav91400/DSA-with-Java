import java.util.ArrayList;

public class Graph {
    static class Edge {
        int src;
        int dest;
        int wt;

        Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }

    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        // 0
        graph[0].add(new Edge(0, 1, 4));
        graph[0].add(new Edge(0, 2, 8));

        // 1
         graph[1].add(new Edge(1, 0, 4));
         graph[1].add(new Edge(1, 2, 3));
         graph[1].add(new Edge(1, 4, 6));

        //  2
         graph[2].add(new Edge(2, 0, 8));
         graph[2].add(new Edge(2, 1, 3));
         graph[2].add(new Edge(2, 3, 2));

        // 3 
         graph[3].add(new Edge(3, 2, 2));
         graph[3].add(new Edge(3, 4, 10));

        //  4
         graph[4].add(new Edge(4, 1, 6));
         graph[4].add(new Edge(4, 3, 10));

         for (Edge e : graph[2]) {
            System.out.print(e.dest + " ");
         }
         

    }
    
}
