package kr.hs.data.kiosk;
class Beverage extends Menu{
    boolean ice;

    Beverage(String name, int price, boolean ice, int thumnail){
        super(name, price, thumnail);
        this.name = super.name + (" 음료");
        this.ice = ice;
    }

    @Override
    public String toString(){
        return super.toString() + "|온도: " + (ice ? "아이스|" : "핫|");
    }
}