public class Dora {

    /*Attributes*/
    private Graph g;
    /*Constructor*/
    public Dora(){
        this.g = new Graph();
        g.getVertexColl().add(new Vertex(1,0,0));
    }
    /*Methods*/

    //region gs ss
    public Graph getG() {
        return g;
    }

    public void setG(Graph g) {
        this.g = g;
    }
    //endregion
}
