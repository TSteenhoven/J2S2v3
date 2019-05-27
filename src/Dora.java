import java.util.ArrayList;

public class Dora {

    /*Attributes*/
    private Graph g;
    private ArrayList<Vertex> OpenEdges;
    /*Constructor*/
    public Dora(){
        this.g = new Graph();
        this.OpenEdges = new ArrayList<Vertex>();
        g.getVertexColl().add(new Vertex(1,0,0));
        g.getVertexColl().get(0).addAdjacency(new Vertex(0,0,0));
    }
    /*Methods*/

    //region gs ss


    public ArrayList<Vertex> getOpenEdges() {
        return OpenEdges;
    }

    public void setOpenEdges(ArrayList<Vertex> openEdges) {
        OpenEdges = openEdges;
    }

    public Graph getG() {
        return g;
    }

    public void setG(Graph g) {
        this.g = g;
    }
    //endregion



}
