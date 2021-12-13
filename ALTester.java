import java.util.*;

public class ALTester {
	ArrayList<Integer> arrList;
	
	public ALTester () {
		arrList = new ArrayList<>();
		for(int i = 0; i < 23; i++) {
			arrList.add(i);
		}
	}

	public static boolean checkIncreasing (ArrayList<Integer> a) {
		for(int i = 0; i < 22; i++) {
			if(a.get(i) > a.get(i+1)) {
				return false;
			}
		}
		return true;
	}

	public ArrayList<Integer> getList() {
    		return arrList;
  	}

	public static void main(String[]args) {
		ALTester test = new ALTester();
		System.out.println(test.checkIncreasing(test.getList()));
		System.out.println(test.getList());
	}
}
