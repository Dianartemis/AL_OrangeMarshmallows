import java.util.*;

public class OrderedArrayList {
  public static void addInOrder(ArrayList<Integer> a, int newVal) {
    if (!(ALTester.checkIncreasing(a))) {
      System.out.println("the array is not in increasing order.");
    } else {
    for (int i = 0; i < a.size() - 1; i++) {
      if (a.get(i) > newVal) {
        a.add(i, newVal);
        break;
      }
    }
    if (a.get(a.size()-1) < newVal) {
      a.add(newVal);
    }
    }
  }

}
