class Kiosk_TUI {

    String hello_msg = "ㅎㅇ";
    int cash = 1000000;

    public static void main(String[] args){
        Kiosk_TUI myKiosk = new Kiosk_TUI();
        Kiosk_TUI fuckKiosk = myKiosk;
        fuckKiosk.hello_msg = "Fuck You";
        fuckKiosk.cash = 100;

        System.out.println( myKiosk.cash );
        System.out.println( myKiosk.hello_msg );
        System.out.println( myKiosk.pay() );
        System.out.println( myKiosk );
    }

    int pay(){
        return 500;
    }

}