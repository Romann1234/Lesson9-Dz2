package p1;

public class Main {
    public static void main(String[] args) {


        informable inf = new ApplePhone("89095673554","iphone15",171);
        Callable call = new ApplePhone("Ivan");
        call.receiveCall();
        inf.Info();
        inf = new XiaomiPhone("89125463654","Xiaomi 12",160 );
        call = new XiaomiPhone("Masha");
        call.receiveCall();
        inf.Info();
        inf = new SamsungPhone("89505674348","Galaxy S22",167);
        call = new SamsungPhone("Dasha");
        call.receiveCall();
        inf.Info();







    }

}