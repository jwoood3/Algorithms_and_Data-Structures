//Jeremy Wood
//woodx552

class FamilyTree {
    private class Node {
        private String name;
        private Node father;
        private Node mother;

        private Node(Node father, String name, Node mother) { //constructor
            this.father = father;
            this.name = name;
            this.mother = mother;
        }
    }

    private Node root;
    public FamilyTree(String ego) { //constructor
        this.root = new Node(null, ego, null);
    }

    private Node find(String name) {
        return find(name, this.root);
    }

    private Node find(String name, Node root) {
        if (root != null) {
            if (root.name == name) {
                return root;
            }
            else {
                Node temp = find(name, root.father);
                if (temp != null) {
                    return temp;
                }
                return find(name, root.mother);
            }
        }
        else {
            return null;
        }
    }

    public void addParents(String ego, String father, String mother) {
        Node temp = find(ego);
        if (temp == null) {
            throw new IllegalArgumentException("p");
        }
        temp.father = new Node(null, father, null);
        temp.mother = new Node(null, mother, null);
    }

    public boolean isDescendant(String ego, String ancestor) {
        Node tempego = find(ego);
        Node tempanc = find(ancestor);
        return tempego != null && tempanc != null && isDescendant(tempego, tempanc);

    }

    private boolean isDescendant(Node root, Node ancestor) {
        if (root != null) {
            if (root == ancestor) {
                return true;
            }
            return isDescendant(root.mother, ancestor) || isDescendant(root.father, ancestor);
        }
        else {
            return false;
        }

    }
}



















//  POTTERY. Driver class.

class Pottery
{

//  MAIN. For testing. Each comment shows a point value (there's a total of 40
//  points) and what it should print.

  public static void main(String [] args) 
  {
    FamilyTree family = new FamilyTree("Al");

    family.addParents("Al",    "Harry",  "Ginny");
    family.addParents("Harry", "James",  "Lily" );
    family.addParents("Ginny", "Arthur", "Molly");

    try
    {
      family.addParents("Joanne", "Peter", "Anne");
    }
    catch (IllegalArgumentException ignore)
    {
      System.out.println("No Joanne.");  //  2 No Joanne.
    }

    System.out.println(family.isDescendant("Joanne", "Joanne"));  //  2 false

    System.out.println(family.isDescendant("Al", "Al"));          //  2 true
    System.out.println(family.isDescendant("Al", "Harry"));       //  2 true
    System.out.println(family.isDescendant("Al", "Ginny"));       //  2 true
    System.out.println(family.isDescendant("Al", "James"));       //  2 true
    System.out.println(family.isDescendant("Al", "Lily"));        //  2 true
    System.out.println(family.isDescendant("Al", "Arthur"));      //  2 true
    System.out.println(family.isDescendant("Al", "Molly"));       //  2 true
    System.out.println(family.isDescendant("Al", "Joanne"));      //  2 false

    System.out.println(family.isDescendant("Harry", "Harry"));    //  2 true
    System.out.println(family.isDescendant("Harry", "Al"));       //  2 false
    System.out.println(family.isDescendant("Harry", "James"));    //  2 true
    System.out.println(family.isDescendant("Harry", "Lily"));     //  2 true
    System.out.println(family.isDescendant("Harry", "Ginny"));    //  2 false
    System.out.println(family.isDescendant("Harry", "Arthur"));   //  2 false
    System.out.println(family.isDescendant("Harry", "Molly"));    //  2 false
    System.out.println(family.isDescendant("Harry", "Joanne"));   //  2 false

    System.out.println(family.isDescendant("Ginny", "Arthur"));   //  2 true
    System.out.println(family.isDescendant("Arthur", "Ginny"));   //  2 false
  }  
}