# AL_OrangeMarshmallows

## Team Orange Marshmellows
* Julia Kozak, Nina Jiang, Diana Akhmedova 
* *Duckies: Flopsy, Miss Alpaca, Ajax*

### ALTester
* ALTester first has a constructor that creates an ArrayList to test (our example ArrayList is in increasing order).
* It then uses the method checkIncreasing on the ArrayList, which has a for loop that checks if each element is less than the next element.
* If it runs through all values in the ArrayList with this always being true, then it returns true. Otherwise, it returns false.

### OrderedArrayList
* OrderedArrayList()
  * Sets _ data as a new ArrayList.
  * Populates _ data using a for loop to add 23 Integers.
* toString()
  * Formats _ data using a for loop.
* remove(int i)
  * Removes i from _ data.
* size()
  * Returns the size of _ data.
* get(int i)
  * Gets the Integer at index i.
* addLinear(Integer newVal)
  * Uses a for loop to search for the appropriate index.
  * Inserts newVal when the Integer at index i is greater than newVal.
  * Otherwise, adds newVal to the end of _ data.
* addBinary(Integer newVal)
  * Initializes min as 0, max as the last index of _ data, and middle as the middle index of _ data.
  * Uses a while loop to check at which index to insert newVal.
  * If the Integer at index middle is equal to newVal, newVal would be inserted after the Integer at index middle.
  * If the Integer at index middle is less than newVal, the min would be set to the middle + 1.
  * If the Integer at index middle is less than newVal, the min would be set to the middle - 1.
* main()
  * Tests addLinear() and addBinart() with two ArrayLists that are filled with random Integers.
