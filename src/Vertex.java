import java.util.ArrayList;

public class Vertex {

    /*Attributes*/
    private Integer code;
    private ArrayList<Vertex> AdjacencyList;
    private Coordinaat c;

    /*Constructor*/
    public Vertex(Integer code, int x, int y){
        this.code = code;
        this.AdjacencyList = new ArrayList<Vertex>();
        this.c = new Coordinaat(x,y);
    }
    public Vertex(Integer code, Coordinaat c){
        this.code = code;
        this.AdjacencyList = new ArrayList<Vertex>();
        this.c = c;
    }
    /*Methods*/

    //region G en Ss */

    public ArrayList<Vertex> getAdjacencyList() {
        return AdjacencyList;
    }

    public Integer getCode() {
        return code;
    }

    public void setAdjacencyList(ArrayList<Vertex> adjacencyList) {
        AdjacencyList = adjacencyList;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
    //endregion

    public void addEdge(Vertex v){
        this.addAdjacency(v);
        v.addAdjacency(this);
    }

    public void addAdjacency(Vertex v){
        this.AdjacencyList.add(v);
    }






}

