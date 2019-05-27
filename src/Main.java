import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Dora deExplorer = new Dora();
        Koos rekenKern = new Koos();
        String Input = "";
        Scanner sc = new Scanner(System.in);
        int naamGeving = 2;
        int index = 1;


        System.out.println("Voer nu een commando in: \n");

//        Vertex v1 = deExplorer.getG().getVertexColl().get(0);
        while (true){
            Input = sc.nextLine();



            if (Input.equals("vertex"))
            {
                System.out.println("Voer het x- , y-coordinaat, aantal verbindingen in:");
                int x  = Integer.parseInt(sc.next());
                int y = Integer.parseInt(sc.next());
                int openEdges = Integer.parseInt(sc.next());

                System.out.println("Vertex toegevoegd!");
                deExplorer.getG().addVertex(new Vertex(naamGeving,x,y));
                deExplorer.getG().getVertexColl().get(index).addAdjacency(deExplorer.getG().getVertexColl().get(index-1));


                if(openEdges-1 > 0){
                    deExplorer.getOpenEdges().add(new Vertex(naamGeving,x,y));}


                naamGeving++;
                index++;
            }
            else if(Input.equals("print"))
            {
                deExplorer.getG().printGrafph();
            }
            else if(Input.equals("q")){
                break;
            }
            else if(Input.equals("adj")){
                Integer i1;
                Integer i2;

                System.out.println("Index v1 , v2:");
                i1 = Integer.parseInt(sc.next());
                i2 = Integer.parseInt(sc.next());

                Vertex v2 = deExplorer.getG().getVertexColl().get(i2);

                deExplorer.getG().getVertexColl().get(i1).addEdge(v2);
                System.out.println("Edge toegevoegd!");


            }
        }
    }


}
