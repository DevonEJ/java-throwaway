import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.lang.Integer;   


public class BinarySearchRecursive {

    /*
    BinarySearch implements binary search algorithm on an array list of strings.
    Returns the location of the target in the array list - or returns -1 if not found.
    */

    ArrayList<Integer> input;

    public BinarySearchRecursive(ArrayList<Integer> input) {
        Collections.sort(input);
        this.input = input;
    }

    public ArrayList<Integer> returnInput() {
        return input;
    }

    public static int Search(ArrayList<Integer> input, int target, int l, int r) {

        if (r >= l) {
                
            Integer mid = l + ((r - l) / 2);

            if (target == input.get(mid)) {
                return input.indexOf(target);
            }
            if (target < input.get(mid)) {
                return Search(input, target, l, mid - l);
            } else {
                return Search(input, target, mid + l, r);
            }
        }
        return -1;
        }

    public static void main(String []args) {

        ArrayList<Integer> in = new ArrayList<Integer>(Arrays.asList(56, 7, 2, 33, 900, 8, 23, 67, 8, 1));

        BinarySearchRecursive search = new BinarySearchRecursive(in);

        ArrayList<Integer> input = search.returnInput();

        int len = input.size();

        System.out.println(Search(input, 7, 0, len));
        System.out.println(Search(input, 900, 0, len));
        System.out.println(Search(input, 8, 0, len));
        System.out.println(Search(input, 1, 0, len));
        System.out.println(Search(input, 77, 0, len));
        System.out.println(Search(input, 100, 0, len));

    }
}