public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;
    private boolean GetName;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate plate) {
        if (plate.getFood() >= appetite) {
            plate.decreaseFood(appetite);
            satiety = true;
        }
    }

    public boolean isSatiety() {
        return satiety;
    }

    public boolean getName() {
        return GetName;
    }
}

