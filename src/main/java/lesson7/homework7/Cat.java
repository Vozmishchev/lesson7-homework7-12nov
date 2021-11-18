package lesson7.homework7;

public class Cat {
    private String name;
    private int appetite;
    private boolean hungry;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
        //this.hungry=true;
    }

    public void eat(Plate plate) {
        if (hungry == true && plate.decreaseFood(appetite) == true) {
            hungry = false;
        }
    }


    public void info() {
        System.out.println(name + " ест " + appetite + ".\n" + name + " приступает к еде.");
        String isHungry = !hungry ? " сыт" : " голодный,т.к. в тарелке мало еды.";
        System.out.println(name + isHungry);

    }
}



