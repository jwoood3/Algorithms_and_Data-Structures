import java.util.Random;

class ShuffleTree<Value> {

    private class Node {
        private String key;
        private Value value;
        private Node left;
        private Node right;
        private Node(Node left, String key, Value value, Node right) {
            this.left = left;
            this.key = key;
            this.value = value;
            this.right = right;
        }
    }
    private String[] keys;
    private Value[] values;
    private int count; //Records how many keys and values are stored in the arrays
    private Node root;
    private Random generator;

    public ShuffleTree(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("size is negative");
        }
        keys = new String[size]; //Initialize keys to be an array that can hold at most size keys
        values = (Value[]) new Object[size]; //Initialize values to be an array that can hold at most size values
        count = 0;
        root = null;
        generator = new Random();
    }


    private void flush() {
        for (int i = 0; i<count-2; i++) { //This shuffles the arrays
            int j = generator.nextInt()%(count-i); //generates a random number between 0 (because of the following if statement) and (count-i)-1
            if (j < 0) { //ensures that the value of j will be greater than 0
                j = j*-1;
            }
            String tempkey = keys[i]; //next 3 lines swap the entries in the array keys at keys[i] and keys[i+j]
            keys[i] = keys[i+j];
            keys[i+j] = tempkey;
            Value tempval = values[i]; //next 3 lines swap the entries in the array values at values[i] and values[i+j]
            values[i] = values[i+j];
            values[i+j] = tempval;
        }
        for (int p = 0; p < count; p++) { 
            Node temproot = root;
            while (true) {
                if (temproot == null) {
                    temproot = new Node(null, keys[p], values[p], null); //if the root Node still points to null, make a new Node to be the root Node
                    root = temproot; //This is so that when temproot is set to root at the beginning of the for loop, it wont point back to null
                    break;
                }
                else if (keys[p].compareTo(temproot.key) < 0 && temproot.left != null) { //if keys[p] < temproot.key and there is another Node on the left, run the loop again on the next left Node
                    temproot = temproot.left;
                }
                else if (keys[p].compareTo(temproot.key) > 0 && temproot.right != null) { //if keys[p] > temproot.key and there is another Node on the right, run the loop again on the next right Node
                    temproot = temproot.right;
                }
                else if (keys[p].compareTo(temproot.key) < 0 && temproot.left == null) { //if keys[p] < temproot.key and there is no Node on the left, have temproot.left point to a new Node with the arguments key and value
                    temproot.left = new Node(null, keys[p], values[p], null);
                    break;
                }
                else if (keys[p].compareTo(temproot.key) > 0 && temproot.right == null) { //if keys[p] > temproot.key and there is no Node on the right, have temproot.right point to a new Node with the arguments key and value
                    temproot.right = new Node(null, keys[p], values[p], null);
                    break;
                }
                else if (keys[p].compareTo(temproot.key) == 0) {
                    throw new IllegalStateException("Key is already in the BST");
                }
            }
        }
        for (int r = 0; r < count; r++) { //empty the values in both arrays and reset count t0 0
            keys[r] = null;
            values[r] = null;
            count-=1;
        }
    }

    public Value get(String key) {
        if (count >= 1) { //if there are still values in the arrays then flush them
            flush();
            count = 0; //reset count back to 0 since the arrays were flushed
        }
        Node temproot = root;
        while (true) {
            if (key.compareTo(temproot.key) == 0) { //if the key that was passed into get is found, then return the value associated with that key
                return temproot.value;
            }
            else if (key.compareTo(temproot.key) > 0) { //if the key passed into get is greater than the key of the current Node, run through the loop again using the Node that temproot.right points to
                temproot = temproot.right;
            }
            else if (key.compareTo(temproot.key) < 0) { //if the key passed into get is less than than the key of the current Node, run through the loop again using the Node that temproot.left points to
                temproot = temproot.left;
            }
            else {
                throw new IllegalArgumentException("The key was not found in the BST");
            }
        }
    }

    public int height() {
        if (count >= 1) {
            flush();
            count  = 0;
        }
        return heighting(root); //call the helper function that does all the work
    }

    private int heighting(Node root) { //helper function for height
        if (root == null) { //If the root is null, then there are no Nodes in the tree, and the height is 0
            return 0;
        }
        else {
            int templeft = heighting(root.left); // recusrsively calls the function for the left side of the tree
            int tempright = heighting(root.right); // recursively calls the function for the right side of the tree
            if (templeft > tempright) {
                return templeft + 1; // if the left side of the tree has a greater height than the right, return the height of the left, plus one to account for the root Node
            }
            else {
                return tempright + 1; // if the right side of the tree has a greater height than the left, return the height of the right, plus one to account for the root Node
            }
        }
    }

    public void put(String key, Value value) {
        if (key == null) {
            throw new IllegalArgumentException("Key is null");
        }
        if (keys.length == count && values.length == count) { //if count is the same value as the length, then the arrays are full and need to be flushed before more entries can be added
            flush();
            count = 0;
        }
        keys[count] = key; //add the key to the position in the array at count
        values[count] = value; //add the value to the position in the array at count
        count++; //increment count since a new entry has been added to the arrays
    }
}




class ShuffleBored  
{  
  private final static String[] reserved =  
   { "abstract",     "assert",    "boolean",     "break",  
     "byte",         "case",      "catch",       "char",  
     "class",        "const",     "continue",    "default",  
     "do",           "double",    "else",        "extends",  
     "final",        "finally",   "float",       "for",  
     "goto",         "if",        "implements",  "import",  
     "instanceof",   "int",       "interface",   "long",  
     "native",       "new",       "package",     "private",  
     "protected",    "public",    "return",      "short",  
     "static",       "super",     "switch",      "synchronized",  
     "this",         "throw",     "throws",      "transient",  
     "try",          "void",      "volatile",    "while" };  
  
  public static void main(String[] args)  
  {  
    ShuffleTree<Integer> tree = new ShuffleTree<Integer>(30);  
    System.out.println("The height of the tree before flush is called for the first time is: " + tree.height());
  
    for (int index = 0; index < reserved.length; index += 1)  
    {  
      tree.put(reserved[index], index);  
    }  
  
    System.out.println(tree.height());  
  
    for (int index = 0; index < reserved.length; index += 1)  
    {  
      System.out.format("%02d %s", tree.get(reserved[index]), reserved[index]);  
      System.out.println();  
    }  
  }  
}


/*Output:          sidenote: The height isn't always 11

The height of the tree before flush is called for the first time is: 0
11
00 abstract
01 assert
02 boolean
03 break
04 byte
05 case
06 catch
07 char
08 class
09 const
10 continue
11 default
12 do
13 double
14 else
15 extends
16 final
17 finally
18 float
19 for
20 goto
21 if
22 implements
23 import
24 instanceof
25 int
26 interface
27 long
28 native
29 new
30 package
31 private
32 protected
33 public
34 return
35 short
36 static
37 super
38 switch
39 synchronized
40 this
41 throw
42 throws
43 transient
44 try
45 void
46 volatile
47 while


*/