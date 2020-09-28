
package parser;

public class Parser {

    public static void main(String[] args) {

        double[][] outerArray = {{1.1,4.4,5.5},{1.1,3.3,4.4},{2.2,6.6}};
        Klists k=new Klists();

        double output[]=k.mergeKlist(outerArray);
        for (int i=0;i<output.length;i++)
            System.out.println(output[i]);


    }

}
