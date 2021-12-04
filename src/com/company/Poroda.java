package com.company;

public final class Poroda extends Dog {
    private String buldog;
    private String  barsik;

    public String getBuldog() {
        return buldog;
    }

    public String getBarsik() {
        return barsik;
    }

    public Poroda(int vozrast, String name, String buldog, String barsik) {
        super(vozrast, name);
        this.buldog = buldog;
        this.barsik = barsik;
    }

    @Override
    public void eating(String foodEating) {
        super.eating(foodEating);
    }


    void voice() {
        System.out.println("gav gav");
    }
}
