package lesson7.homework7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }


    public boolean decreaseFood(int amount) {
        int diff = food - amount;
        if (diff < 0) return false;
        food -= amount;
        return true;

    }

    public void putFood(int food) {
        System.out.println("Добавляем еду: " + food);
        this.food += food;

    }


    public void info() {
        System.out.println("plate :" + food);
    }


}
