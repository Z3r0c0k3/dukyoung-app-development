package kr.hs.data.kiosk;
class Coffee extends Beverage{
    boolean decaffenine;
    String origin;

    Coffee(String name, int price, boolean ice, boolean decaffenine, String origin, int thumnail){
        super(name, price, ice, thumnail);
        this.decaffenine = decaffenine;
        this.origin = origin;
    }

    @Override
    public String toString(){
        return super.toString() + "카페인 유무: " + (decaffenine ? "무|" : "유|") + "원산지: " + origin;
    }
}
