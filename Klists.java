
package parser;

public class Klists {

    public Klists() {
    }

    public double[] mergeKlist (double[][] outerArray)
    {
        int size =0;
        for (int i=0;i<outerArray.length;i++)
            size = size + outerArray[i].length;
        double output[] = new double[size];
        int count =0;
        for (int i=0;i<outerArray.length; i++)
            for (int j=0;j<outerArray[i].length;j++){
                output[count] = outerArray[i][j];
                count++;
            }

        SortingArray(output, size);


        return output;
    }
    void SortingArray(double array[],int size)
    {
        for (int i=0;i<size-1; i++)
            for (int j=0;j<(size -1)-i;j++)
                if(array[j]>array[j+1]){
                    double temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }

    }

}
