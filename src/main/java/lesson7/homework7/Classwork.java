package lesson7.homework7;

public class Classwork {

    public static void main(String[] args) {

        Cat[] cats = {

                new Cat("Barsik", 50),
                new Cat("Myrzik", 30),
                new Cat("Ruzhuk", 40),
        };
        Plate plate = new Plate(100);


        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }
        plate.info();

        plate.putFood(100);


    }
}
