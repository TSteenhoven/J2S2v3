public class Main {

    public static void main(String[] args) {

        Dora deExplorer = new Dora();



        Vertex v1 = deExplorer.getG().getVertexColl().get(0);
        Vertex v2 = new Vertex(2,0,1);
        Vertex v3 = new Vertex(3,0,2);
        Vertex v4 = new Vertex(4,0,3);
        Vertex v5 = new Vertex(5,1,3);
        Vertex v6 = new Vertex(6,2,3);


        deExplorer.getG().addVertex(v2);
        deExplorer.getG().addVertex(v3);
        deExplorer.getG().addVertex(v4);
        deExplorer.getG().addVertex(v5);
        deExplorer.getG().addVertex(v6);

        v2.addEdge(v1);
        v3.addEdge(v2);


        for(Vertex v : deExplorer.getG().getVertexColl()){
            System.out.print("[" + v.getCode() + "] ");
            for (Vertex w: v.getAdjacencyList()){
                System.out.print(" " + w.getCode() +" ");
            }


                System.out.print("\n");
        }



    }
}
