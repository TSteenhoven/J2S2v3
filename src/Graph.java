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



    }
