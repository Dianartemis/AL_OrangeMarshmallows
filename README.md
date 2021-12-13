# AL_OrangeMarshmallows

## Team Orange Marshmellows
* Julia Kozak, Nina Jiang, Diana Akhmedova 
* *Duckies: Flopsy, Miss Alpaca, Ajax*

### ALTester
* ALTester first has a constructor that creates an ArrayList to test (our example ArrayList is in increasing order).
* It then uses the method checkIncreasing on the ArrayList, which has a for loop that checks if each element is less than the next element.
* If it runs through all values in the ArrayList with this always being true, then it returns true. Otherwise, it returns false.

### OrderedArrayList
* OrderedArrayList has one method, addInOrder, that takes an integer ArrayList as a parameter, and a newVal integer.
* It uses the ALTester method checkIncreasing to make sure the ArrayList it takes is already increasing (otherwise it does not alter it).
* It then checks for each term in the ArrayList whether it is larger than the newVal.
* Once it finds a value larger than newVal, it adds the newVal at that index and exits the for loop. If it does not reach a larger value, it adds to the end.
