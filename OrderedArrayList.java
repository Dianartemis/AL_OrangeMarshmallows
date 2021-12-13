import java.util.*;

public class OrderedArrayList {
  public static void addInOrder(ArrayList<Integer> a, int newVal) {
    for (int i=0; i<a.size()-1; i++) {
      if (a.get(i) > newVal) {
        a.add(i, newVal);
        break;
      }
    }
    if (a.get(a.size()-1) < newVal) {
      a.add(newVal);
    }
  }
  
  public static void main(String[] args) {
    ALTester A = new ALTester();
    System.out.println(A.getList());

    OrderedArrayList.addInOrder(A.getList(), 4);
    System.out.println(A.getList());

    (A.getList()).remove(4);
    OrderedArrayList.addInOrder(A.getList(), -10);
    System.out.println(A.getList());

    (A.getList()).remove(0);
    OrderedArrayList.addInOrder(A.getList(), 1010);
    System.out.println(A.getList());

    ArrayList<Integer> intArr = new ArrayList<>();
    for (int i=0; i<41; i++) {
      intArr.add(2*i+1);
    }
    System.out.println(intArr);
    OrderedArrayList.addInOrder(intArr, -1);
    System.out.println(intArr);
  }
}
