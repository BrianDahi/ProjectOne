# ProjectOne
# proj1F19
The goal of this project is to find the hamming distance between Norman(NRMN) and 
the given String, then compare the given String with each element of the Array to find the same hamming distance
and store how many times it apears.
In HammingDist class -
I made two constructors. An empty and one to take in two String to be compared.  
I made three String variables. Of the three I declared one and made private since this is a constant variable. 
Next I made an String array called hamming with four elements.
Then declared a private int capacity to mirror how many elements are in the array.
Next is public void read(String filename)-
this method is meant to read in the file and store into my array hamming. Int this method I create a 
FileReader object called file and a BufferedReader object called br. I also make another String variable called info. 
I read 6 lines of the Mesonet.txt with the info String variable because it is not needed for the computation.
T I delcare two more variables one being a String parse = "" and the other being int i = 0; 
I construct a while loop with the condition that if info does not equal null then keep looping. 
Inside the loop capacity comes into play, so when the while loop loops it will check if 
i = = to cappacity pass to expandArray() and increment capacity by one to indicate the array has increased.
Next to single out the info I want from Mesonet.txt I used info.subSequence(4,8) becauce the station was four char out and 
ended 8 char. Then parse gets store in hamming[i].
Next method is expandArray()-
I make a new String array called temp set it equal to new String[hamming.length + 1] then I use arraycopy.
Next I use two Identical methods called public int showDistance() and public int showDistanceTwo()-
So I declare a int variable called distance  and for the showDistanceTwo the variable is called dist 
which are both set to zero. then I set a for loop that will navigate the String that comes from the driver class. 
int hsi for loop I have a if statment that will test each char and see if they are not equal if they are then 
increament distance or dist by one plus then these methods return the hamming distance known as distance or dist.
Next  I also used two methods to  navigate the array then navigate the String-
I delcare two variables counter1 and newDist both equal to zero same for the secon method but with changes 
counter2 and newDist2. For both methods I made a for loop that would navigate throught the array hamming.
In the for loop is another for loop that uses the driver class input string again however we are looking for the 
common distance strings so we use an if to find how the distance between each char then we use another if to call 
showdistance() or showdistanceTwo() each method returns the amount.
Next is the toString method-
I went with the concat method of formatting my String.



