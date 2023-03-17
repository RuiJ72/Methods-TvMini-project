package dio.com.smart.tv.projct;

public class App {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("Current channel: " + smartTv.channel);
        smartTv.changeChannel(13);
        System.out.println("Current Channel: " + smartTv.channel);


        smartTv.decreseVolume();
        smartTv.decreseVolume();
        smartTv.decreseVolume();
        smartTv.increaseVolume();

        System.out.println("Current Volume -> " + smartTv.volume);



        System.out.println("The Tv is on ?: " + smartTv.on);
        System.out.println("Current Channel: " + smartTv.channel);
        System.out.println("Current volume: " + smartTv.volume);



        smartTv.connect();
        System.out.println("New status: Tv connected? -> " + smartTv.on);

        smartTv.disconnect();
        System.out.println("New status: Tv Connected? -> " + smartTv.off);




    }
}
