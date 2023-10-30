package kr.hs.data.kiosk;
class Menu {
    String name = "hello world!";
    int price = 3000;

    Menu(String name){
        this.name = name;
    }

    Menu (String name, int price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString(){
        return name + " " + price + "원";
    }
}