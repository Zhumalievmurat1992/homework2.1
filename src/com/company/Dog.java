package com.company;

public class Dog extends Animal {
    private String name;
    private EnumColor enumColor;
    private Food food;

    public String getName() {
        return name;
    }

    public Dog(int vozrast, String name) {
        super(vozrast);
        this.name = name;
    }

    public void eating(String foodEating) {
        System.out.println(foodEating);
    }

    public final void eating(int col) {
        System.out.println(col);
    }


}
