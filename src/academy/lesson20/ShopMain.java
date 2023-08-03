package academy.lesson20;

public class ShopMain {

    public static void main(String[] args) {
        Store store = new Store(5);
        SuperRunnable producer1 = new Producer("LG", store, 7, 3);
        SuperRunnable producer2 = new Producer("Sony", store, 9, 2);
        SuperRunnable producer3 = new Producer("Acer", store, 8, 6);
        SuperRunnable producer4 = new Producer("HP", store, 12, 5);
        SuperRunnable producer5 = new Producer("ASUS", store, 4, 7);

        SuperRunnable consumer1 = new Consumer("5element", store, 12, 3);
        SuperRunnable consumer2 = new Consumer("Electrosila", store, 18, 2);
        SuperRunnable consumer3 = new Consumer("korona", store, 10, 1);

//        Runnable[] allProducers = {
//                producer1, producer2, producer3, producer4, producer5
//        };
//
//        Runnable[] allConsumers = {
//                consumer1, consumer2, consumer3
//        };

        SuperRunnable[] all = {
                producer1, producer2, producer3, producer4, producer5,
                consumer1, consumer2, consumer3
        };

        for (SuperRunnable sr : all) {
            new Thread(sr, sr.getName()).start();
        }

//        for (int i = 0; i < allConsumers.length; i++) {
//            new Thread(allConsumers[i], "consumer" + i).start();
//        }
//        for (int i = 0; i < allProducers.length; i++) {
//            new Thread(allProducers[i], "producer-" + i).start();
//        }
    }
}
