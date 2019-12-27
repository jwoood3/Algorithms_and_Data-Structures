//Jeremy Wood
//woodx552

class Poly {
    private class Term {
        private int coef;
        private int expo;
        private Term next;

        private Term(int coef, int expo, Term next) {
            this.coef = coef;
            this.expo = expo;
            this.next = next;
        }
    }

    private Term first;
    private Term last;

    public Poly() {
        this.last = this.first = new Term(0, Integer.MAX_VALUE, null);
        //first never changes, always points to head node. last only points to head in zero poly. update last when terms are added
    }

    public boolean isZero() {
        return (first.next == null); //If what the head node points to is null, then the polynomial is a zero polynomial because there are no terms
    }

    public Poly minus() {
        Poly result = new Poly(); //New instance of Poly
        Term temp = first.next; //A new Term is created that points to the Term that the head node points to
        while (temp != null) {
            result.plus(-1 * temp.coef, temp.expo); //Append the Term to the new instance of Poly with the opposite sign
            temp = temp.next; //Advance temp to the next Term in this
        }
        return result;
    }

    public Poly plus(Poly that) {
        Poly result = new Poly();java
        Term left = this.first.next; //points to the Term that the head node points to in the this polynomial
        Term right = that.first.next; //points to the Term that the head node points to in the that polynomial

        while (left != null && right != null) { //As long as both polynomials still have more Terms, execute the following code
            if (left.expo > right.expo) {
                result.plus(left.coef, left.expo); //append the Term from this as the next Term in result
                left = left.next; //Advance left to the next Term in this
            }
            else if (right.expo > left.expo) {
                result.plus(right.coef, right.expo); //append the Term from that as the next Term in result
                right  = right.next; //Advance right to the next Term in that
            }
            else {
                int coeftemp = left.coef + right.coef; //Add the coefficients together
                if (coeftemp == 0) { //If the sum of the coefficients is 0, nothing needs to be appended
                    left = left.next;
                    right = right.next;
                }
                else {
                    result.plus(coeftemp, left.expo); //append new Term to result with the result of the added coefficients
                    left = left.next;
                    right = right.next;
                }
            }
        }
        if (left != null) { 
            result.last.next = left; //If there are still more Terms in the this polynomial, append the rest of the Terms by pointing to left
        }
        else {
            result.last.next = right; //If there are still more Terms in the that polynomial, append the rest of the Terms by pointing to right
        }
        return result;
    }

    public Poly plus(int coef, int expo) {
        if (coef == 0 || expo < 0 || expo >= last.expo) {
            throw new IllegalArgumentException("Coefficient is 0, or exponent is negative, or exponent is greater than or equal to previous exponent");
        }
        Term thing = new Term(coef, expo, null); //new Term is created called thing
        last.next = thing; //thing is appended to this
        last = last.next; //last now points to the newly appended Term, thing
        return this;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        Term temp = first.next;
        if (isZero()) {
            builder.append(0); //If the polynomial is a zero polynomial, append a 0
        }
        while (temp != null) {
            if (temp.coef>0 && temp != first.next) {
                builder.append('+'); //append a + if the coefficient is > 0 and the Term isn't the first printed term. This doesn't need to be done with negatives because they already have a sign attached
            }
            builder.append(temp.coef); //append the coefficient
            builder.append('x'); //append an x
            builder.append(temp.expo); //append the exponent
            temp = temp.next; //advance temp to the next Term
        }
        return builder.toString();
    }
}





class PollyEsther  
{  
  public static void main(String[] args)  
  {  

    Poly p = new Poly().plus(3,5).plus(2,4).plus(2,3).plus(-1,2).plus(5,0);  
    Poly q = new Poly().plus(7,4).plus(1,2).plus(-4,1).plus(-3,0);  
    Poly z = new Poly();
    Poly r = new Poly().plus(-3,5);
  
    System.out.println(p);                 // 3x⁵ + 2x⁴ + 2x³ - 1x² + 5x⁰  
    System.out.println(q);                 // 7x⁴ + 1x² - 4x¹ - 3x⁰  
    System.out.println(z);                 // 0  
    System.out.println(r);                 // -3x⁵
  
    System.out.println(p.minus());         // -3x⁵ - 2x⁴ - 2x³ + 1x² - 5x⁰  
    System.out.println(q.minus());         // -7x⁴ - 1x² + 4x¹ + 3x⁰  
    System.out.println(z.minus());         // 0  
    System.out.println(r.minus());         // 3x⁵
  
    System.out.println(p.plus(q));         // 3x⁵ + 9x⁴ + 2x³ - 4x¹ + 2x⁰  
    System.out.println(p.plus(z));         // 3x⁵ + 2x⁴ + 2x³ - 1x² + 5x⁰  
    System.out.println(p.plus(q.minus())); // 3x⁵ - 5x⁴ + 2x³ - 2x² + 4x¹ + 8x⁰  
    System.out.println(p.plus(r));         // 2x⁴ + 2x³ - 1x² + 5x⁰
    System.out.println(r.plus(p));         // 2x⁴ + 2x³ - 1x² + 5x⁰
  }  
}

