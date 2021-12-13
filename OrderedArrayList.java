// Team Orange Marshmallows: Julia Kozak, Diana Akhmedova, Nina Jiang // Duckies: Flopsy, Ajax, Miss Alpaca
// APCS pd08
// Lab02
// 2021-12-13

/**********************************************
 * class OrderedArrayList
 * wrapper class for ArrayList
 * maintains invariant that elements are ordered (ascending)
 * (SKELETON)
 **********************************************/


import java.util.ArrayList;

public class OrderedArrayList
{

  // instance of class ArrayList, holding objects of type Integer
  // (i.e., objects of a class that implements interface Integer)
  private ArrayList<Integer> _data;

  // default constructor
  // initializes instance variables
  public OrderedArrayList()
  {
  _data = new ArrayList<>();
  for (int i=0; i<23; i++) {
  	_data.add(i);
  }
  }

  public String toString()
  {
  String ans = "{ ";
  for (int i=0; i<_data.size(); i++) {
  	ans += _data.get(i) + ", ";
  }
  ans = ans.substring(0, ans.length()-2);
  ans += " }";
  return ans;

  }

  public Integer remove( int i )
  {
  int temp = _data.get(i);
  _data.remove(i);
  return temp;
  }

  public int size()
  {
  return _data.size();
  }

  public Integer get( int i )
  {
  return _data.get(i);
  }

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a linear search to find appropriate index
  public void addLinear(Integer newVal)
  {
  if (_data.size() < 1) {
	_data.add(newVal);
} else {
  for (int i=0; i<_data.size()-1; i++) {
  	if(_data.get(i) > newVal) {
  		_data.add(i, newVal);
  		break;
  	}
  }
  if (_data.get(_data.size()-1) < newVal) {
  	_data.add(newVal);
  }
}
  }

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a binary search to find appropriate index
  public void addBinary(Integer newVal)
  {
  int min = 0;
  int max = _data.size() - 1;
        while (min <= max) {
            int middle = min + (max - min) / 2;
            if (_data.get(middle) == newVal) {
                _data.add(middle, newVal);
            }
            if (_data.get(middle) < newVal)  {
                min = middle + 1;
            }
            else {
                max = middle - 1;
            }
    }
  }

  // main method solely for testing purposes
  public static void main( String[] args )
  {


    OrderedArrayList Franz = new OrderedArrayList();

    // testing linear search
    for( int i = 0; i < 15; i++ )
      Franz.addLinear( (int)( 50 * Math.random() ) );
    System.out.println( Franz );

    // testing binary search
    Franz = new OrderedArrayList();
    for( int i = 0; i < 15; i++ )
      Franz.addBinary( (int)( 50 * Math.random() ) );
    System.out.println( Franz );

  }//end main()

}//end class OrderedArrayList
