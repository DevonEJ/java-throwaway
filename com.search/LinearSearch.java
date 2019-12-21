import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearch {

    /*
    LinearSearch implements linear search algorithm on an array list of integers.
    Returns the location of the target in the array list - or returns -1 if not found.
    */

    public ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(3, 5, 7, 2, 88, 5, 10, 1, 99, 45, 23,1));

    public LinearSearch() {
    } 

    public Integer Search(Integer t) {
        if (this.input.isEmpty()) {
            return -1;
        }
        for (Integer i = 0; i < this.input.size(); i++) {
            if (this.input.get(i) == t) {
                return i;
            }   
        }
        return -1;
    }

    public static void main(String []args) {

        //ArrayList<Integer> in = new ArrayList(ArrayList<Integer>);

       // ArrayList<Integer> in = newArrayList(3, 5, 7, 2, 88, 5, 3, 1, 99, 45, 23,1);

        LinearSearch search = new LinearSearch();

        // search.input.add(3);
        // search.input.add(6);
        // search.input.add(25);
        // search.input.add(2);
        // search.input.add(10);
        // search.input.add(2);
        // search.input.add(78);
        // search.input.add(4);
        // search.input.add(8);
        // search.input.add(99);


        System.out.println(search.Search(10));

    }    
}
