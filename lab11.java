//woodx552
//Jeremy Wood


class Deque<Base> {
    private class Node {
        private Base object;
        private Node left;
        private Node right;

        private Node(Node left, Base object, Node right) {
            this.left = left;
            this.object = object;
            this.right = right;
        }
    }

    private Node head;
    public Deque() {
        this.head = new Node(null, null, null);
        head.right = head;
        head.left = head;
    }

    public void enqueueFront(Base object) {
        Node front = new Node(head, object, head.right);
        head.right.left = front;
        head.right = front;
    }

    public void enqueueRear(Base object) {
        Node rear = new Node(head.left, object, head);
        head.left.right = rear;
        head.left = rear;
    }

    public Base dequeueRear() {
        if (isEmpty()) {
            throw new IllegalStateException("p");
        }
        Base obj = head.left.object;
        head.left.left.right = head;
        head.left = head.left.left;
        return obj;
    }

    public Base dequeueFront() {
        if (isEmpty()) {
            throw new IllegalStateException("h");
        }
        Base obj = head.right.object;
        head.right.right.left = head;
        head.right = head.right.right;
        return obj;
    }

    public boolean isEmpty() {
        if (head.right==head && head.left==head) {
            return true;
        }
        return false;
    }
}


//  OBSERVATION DEQUE. Test the class DEQUE. 40 points total.

class ObservationDeque
{

//  MAIN. Test the DEQUE on various example arguments.

  public static void main(String [] args)
  {
    Deque<String> deque = new Deque<String>();

    System.out.println(deque.isEmpty());       // true                2 points.

    try
    {
      System.out.println(deque.dequeueFront());
    }
    catch (IllegalStateException ignore)
    {
      System.out.println("No dequeueFront.");  //  No dequeueFront.   2 points.
    }

    try
    {
      System.out.println(deque.dequeueRear());
    }
    catch (IllegalStateException ignore)
    {
      System.out.println("No dequeueRear.");   //  No dequeueRear.    2 points.
    }

//  Enqueueing to the rear and dequeueing from the rear makes the DEQUE act
//  like a stack.

    deque.enqueueRear("A");
    deque.enqueueRear("B");
    deque.enqueueRear("C");

    System.out.println(deque.isEmpty());       //  false              2 points.

    System.out.println(deque.dequeueRear());   //  C                  2 points.
    System.out.println(deque.dequeueRear());   //  B                  2 points.
    System.out.println(deque.dequeueRear());   //  A                  2 points.

    System.out.println(deque.isEmpty());       //  true               2 points.

//  Enqueueing to the rear and dequeueing from the front makes the DEQUE act
//  like a queue.

    deque.enqueueRear("A");
    deque.enqueueRear("B");
    deque.enqueueRear("C");

    System.out.println(deque.dequeueFront());  //  A                  2 points.
    System.out.println(deque.dequeueFront());  //  B                  2 points.
    System.out.println(deque.dequeueFront());  //  C                  2 points.

    System.out.println(deque.isEmpty());       //  true               2 points.

//  Enqueueing to the front and dequeueing from the front makes the DEQUE act
//  like a stack.

    deque.enqueueFront("A");
    deque.enqueueFront("B");
    deque.enqueueFront("C");

    System.out.println(deque.dequeueFront());  //  C                  2 points.
    System.out.println(deque.dequeueFront());  //  B                  2 points.
    System.out.println(deque.dequeueFront());  //  A                  2 points.

    System.out.println(deque.isEmpty());       //  true               2 points.

//  Enqueueing to the front and dequeueing from the rear makes the DEQUE act
//  like a queue.

    deque.enqueueFront("A");
    deque.enqueueFront("B");
    deque.enqueueFront("C");

    System.out.println(deque.dequeueRear());   //  A                  2 points.
    System.out.println(deque.dequeueRear());   //  B                  2 points.
    System.out.println(deque.dequeueRear());   //  C                  2 points.

    System.out.println(deque.isEmpty());       //  true               2 points.
  }
}