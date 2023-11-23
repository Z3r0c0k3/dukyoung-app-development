package kr.hs.data.kiosk;

import java.io.Serializable;

class Menu implements Serializable {
    String name = "hello world!";
    int price = 3000;
    int thumnail = -1;

    Menu(String name){
        this.name = name;
    }

    Menu (String name, int price, int thumnail){
        this.name = name;
        this.price = price;
        this.thumnail = thumnail;
    }

    @Override
    public String toString(){
        return name + " " + price + "원";
    }
}