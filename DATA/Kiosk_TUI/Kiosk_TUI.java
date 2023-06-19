class Kiosk_TUI {

    String hello_msg = "ㅎㅇ";
    int cash = 1000000;

    public static void main(String[] args){
        Kiosk_TUI myKiosk = new Kiosk_TUI();

        System.out.println( myKiosk.hello_msg );
        System.out.println( myKiosk.cash );
        System.out.println( myKiosk.pay() );
    }

    int pay(){
        return 500;
    }

}