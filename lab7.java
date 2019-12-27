//Jeremy Wood
//woodx552


class Map<Key, Value> {
    
    public Key keys[];
    private Value values[];
    private int count;

    public Map(int length) {
        if (length < 0) {
            throw new IllegalArgumentException("Length cannot be less than 0");
        }
        else {
            this.keys = (Key[]) new Object[length];
            this.values = (Value[]) new Object[length];
            this.count = 0;
        }
    }

    public Value get(Key key) {
        for (int i=0; i<keys.length; i++) {
            if (isEqual(keys[i], key)) {
                return this.values[i];
            }
        }
        throw new IllegalArgumentException("h");
    }

    private boolean isEqual(Key leftKey, Key rightKey) {
        if (leftKey == null || rightKey == null) {
            if (leftKey == rightKey) {
                return true;
            }
            return false;
        }
        return leftKey.equals(rightKey);
    }

    public boolean isIn(Key key) {
        for (int i=0; i<keys.length; i++) {
            if (isEqual(keys[i], key)) {
                return true;
            }
        }
        return false;
    }

    public void put(Key key, Value value) {
        for (int i=0; i<count; i++) {
            if (isEqual(keys[i], key)) {
                this.values[i] = value;
                return;
            }
        }
        if (this.count == keys.length && this.count == values.length) {
            throw new IllegalStateException("k");
        }
        else {
            this.keys[count] = key;
            this.values[count] = value;
            this.count++;
        }
    }

    private int where(Key key) {
        for (int i=0; i<keys.length; i++) {
            if (isEqual(keys[i], key)) {
                return i;
            }
        }
        return -1;
    }
}


//
//  Tests for CSci 1913 Lab 7
//  James Moen
//  07 Mar 17
//
//  The TRY-CATCH statements catch exceptions thrown by MAP's methods, so that
//  the program can continue to run even if a method fails. We haven't talked
//  about TRY-CATCH'es in lecture yet.
//
//  Each test has a comment that shows what it should print, and how many
//  points it is worth, for a total of 40 points.

//  HOGWARTS. The Hogwarts dating service.

class Hogwarts
{

//  MAIN. Make an instance of MAP and test it.

  public static void main(String [] args)
  {
    Map<String, String> map;

    try
    {
      map = new Map<String, String>(-5);
    }
    catch (IllegalArgumentException ignore)
    {
      System.out.println("No negatives");       //  No negatives  2 points.
    }

    map = new Map<String, String>(5);

    map.put("Harry",     "Ginny");
    map.put("Ron",       "Lavender");
    map.put("Voldemort", null);
    map.put(null,        "Wormtail");

    System.out.println(map.isIn("Harry"));      //  true          2 points.
    System.out.println(map.isIn("Ginny"));      //  false         2 points.
    System.out.println(map.isIn("Ron"));        //  true          2 points.
    System.out.println(map.isIn("Voldemort"));  //  true          2 points.
    System.out.println(map.isIn(null));         //  true          2 points.
    System.out.println(map.isIn("Joanne"));     //  false         2 points.

    System.out.println(map.get("Harry"));       //  Ginny         2 points.
    System.out.println(map.get("Ron"));         //  Lavender      2 points.
    System.out.println(map.get("Voldemort"));   //  null          2 points.
    System.out.println(map.get(null));          //  Wormtail      2 points.

    try
    {
      System.out.println(map.get("Joanne"));
    }
    catch (IllegalArgumentException ignore)
    {
      System.out.println("No Joanne");          //  No Joanne     2 points.
    }

    map.put("Ron",   "Hermione");
    map.put("Albus", "Gellert");
    map.put(null,    null);

    System.out.println(map.isIn(null));         //  true          2 points.
    System.out.println(map.isIn("Albus"));      //  true          2 points.

    System.out.println(map.get("Albus"));       //  Gellert       2 points.
    System.out.println(map.get("Harry"));       //  Ginny         2 points.
    System.out.println(map.get("Ron"));         //  Hermione      2 points.
    System.out.println(map.get("Voldemort"));   //  null          2 points.
    System.out.println(map.get(null));          //  null          2 points.

    try
    {
      map.put("Draco", "Pansy"); 
    }
    catch (IllegalStateException minnesota)
    {
      System.out.println("No Draco");           //  No Draco      2 points.
    }
  }
}






/*
Test case results:


No negatives
true
false
true
true
true
false
Ginny
Lavender
null
Wormtail
No Joanne
true
true
Gellert
Ginny
Hermione
null
null
No Draco



*/