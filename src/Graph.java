import java.util.ArrayList;

    public class Graph {
        /*Attributes*/
        private ArrayList<Vertex> VertexColl;

        /*Constructor*/
        public Graph(){
            VertexColl = new ArrayList<>();
        }

        /*Methods*/

        //region Gs and Ss

        public ArrayList<Vertex> getVertexColl() {
            return VertexColl;
        }

        public void setVertexColl(ArrayList<Vertex> vertexColl) {
            VertexColl = vertexColl;
        }
        //endregion

        public void addVertex(Vertex v){
            VertexColl.add(v);
        }

        public void printGrafph(){
            for(Vertex v : this.getVertexColl()){
                System.out.print("[" + v.getCode() + "] ");
                for (Vertex w: v.getAdjacencyList()){
                    System.out.print(" " + w.getCode() +" ");
                }
                System.out.print("\n");
            }
        }






    }
