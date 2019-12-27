//Jeremy Wood
//woodx552

class PriorityQueue<Base> {

    private class Node {
        private Base object;    
        private int rank;
        private Node left;
        private Node right;

        private Node(Base object, int rank) {
            this.object = object;
            this.rank = rank;
            left = null;
            right = null;
        }
    }

    private Node root;

    public PriorityQueue() {
        this.root = new Node(null, 8);
    }

    public Base dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("p");
        }
        Node temproot = root;
        Node tempparent = root;
        while (true) {
            if (temproot.left == null) {
                tempparent.left = temproot.right;
                return temproot.object;
            }
            if (temproot == root) {
                temproot = temproot.left;
            }
            else {
                temproot = temproot.left;
                tempparent = tempparent.left;
            }
        }

    }

    public void enqueue(Base object, int rank) {
        if (rank < 0) {
            throw new IllegalArgumentException("rank cannot be negative");
        }
        Node temproot = root;
        while (true) {
            if (rank > temproot.rank) {
                if (temproot.right != null) {
                    temproot = temproot.right;
                } else {
                temproot.right = new Node(object, rank);
                return;
                }
            }
            else if (rank <= temproot.rank) {
                if (temproot.left != null) {
                    temproot = temproot.left;
                } else {
                temproot.left = new Node(object, rank);
                return;
                }
            }
        }
    }

    public boolean isEmpty() {
        if (root.left == null) {
            return true;
        }
        return false;
    }
}   





//  SNOBBERY. How the aristocracy behaves in a queue. 20 points.

class Snobbery
{

//  MAIN. Queue them up.

  public static void main(String[] args)
  {
    PriorityQueue<String> queue = new PriorityQueue<String>();

    System.out.println(queue.isEmpty());  //  true        2 points

    try
    {
      System.out.println(queue.dequeue());
    }
    catch (IllegalStateException ignore)
    {
      System.out.println("Blimey!");      //  Blimey!     2 points
    }

    queue.enqueue("Lancelot",  5);
    queue.enqueue("Fawlty",    7);
    queue.enqueue("Elizabeth", 0);
    queue.enqueue("Charles",   1);
    queue.enqueue("Turing",    7);

    try
    {
      queue.enqueue("Zeus", -100);
    }
    catch (IllegalArgumentException ignore)
    {
      System.out.println("No gods!");     //  No gods!    2 points
    }

    System.out.println(queue.isEmpty());  //  false       2 points

    System.out.println(queue.dequeue());  //  Elizabeth   2 points
    System.out.println(queue.dequeue());  //  Charles     2 points
    System.out.println(queue.dequeue());  //  Lancelot    2 points
    System.out.println(queue.dequeue());  //  Turing      2 points
    System.out.println(queue.dequeue());  //  Fawlty      2 points

//  It's OK if Fawlty comes out before Turing, but both must come out last.

    System.out.println(queue.isEmpty());  //  true        2 points.
  }

}