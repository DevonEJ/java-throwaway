import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;   


public class BinarySearch {

    /*
    BinarySearch implements binary search algorithm on an array list of strings.
    Returns the location of the target in the array list - or returns -1 if not found.
    */

    ArrayList<String> input;

    public BinarySearch(ArrayList<String> input) {
        Collections.sort(input);
        this.input = input;
        System.out.println(this.input);
    }

    public Integer Search(String target) {

        if (this.input.isEmpty()) {
            return -1;
        }

        Integer min = 0;
        Integer max = this.input.size();

        Integer i = 0;

        while (i < max) {
        
            Integer mid = min + ((max - min) / 2);

            if (target == this.input.get(mid)) {
                return this.input.indexOf(target);
            }
            if (target.compareTo(this.input.get(mid)) < 0) {
                max = mid;
            } else {
                min = mid;
            }
            i++;
        }
        return -1;
    }

    public static void main(String []args) {

        ArrayList<String> in = new ArrayList<String>(Arrays.asList("America", "Russia", "Iceland", "Britain", "China", "Finland", "Saudi Arabia"));

        BinarySearch search = new BinarySearch(in);

        System.out.println(search.Search("Britain"));
        System.out.println(search.Search("Egypt"));
        System.out.println(search.Search("Iceland"));
        System.out.println(search.Search("China"));
        System.out.println(search.Search("Russia"));
        System.out.println(search.Search("Brazil"));

    }
}