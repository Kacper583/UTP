// TODO: musimy dodac brakujace klasy!

// OK, ja dodam 'Adder', a s34620 doda 'Substractor'.

public class Main {
    static void main() {

        Adder adder = new Adder();

        System.out.println(adder.add(1,2));

        Substractor substractor = new Substractor();

        System.out.println(substractor.substract(6,3));
    }
}
