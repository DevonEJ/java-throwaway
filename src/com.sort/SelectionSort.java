import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;


public class SelectionSort {

    ArrayList<Integer> input;

    public SelectionSort(ArrayList<Integer> input) {
        this.input = input;
    }

    private Integer getMin(List<Integer> input) {
        if (input.size() == 1) {
            return input.get(0);
        }
        int min = input.get((input.size() - 1)); 
        for (int i=0; i < input.size(); i++) {
            if (input.get(i) < min) {
                min = input.get(i);
            }
        }
        return min;
    }

    public ArrayList<Integer> SortArray() {
        Integer smallest;
        ArrayList<Integer> sorted = new ArrayList<Integer>(Arrays.asList());
        int end = (this.input.size() - 1);

        for (int i=0; i <= end; i++) {
            smallest = getMin(this.input);
            sorted.add(smallest);
            this.input.remove(smallest);
        }
        return sorted;
    }


    public static void main(String []args) {

        ArrayList<Integer> in = 
        new ArrayList<Integer>(Arrays.asList(30, 4, 7, 11, 8 ,3 ,5 ,1, 300, 78, 3, 5, 9, 450, 6, 79, 22, 333344, 56, 232, 23, 87));

        SelectionSort sort = new SelectionSort(in);
        System.out.println(sort.SortArray());
    }
}
