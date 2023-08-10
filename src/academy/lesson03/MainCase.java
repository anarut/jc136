package academy.lesson03;

public class MainCase {

    public static void main(String[] args) {
        int x = -4 ;
        int r = x % 7;  // 0 - 6

        if (r < 0) {
            r = (r +7) % 7;
        }
//        int r = (x % 7 + 7) % 7;

//        if (r == 0) {
//            System.out.println("чт");
//        } else if (r == 1) {
//            System.out.println("пт");
//        } else {
//            System.out.println("to do");
//        }

//        switch (r) {
//            case 0:
//                System.out.println("чт");
//                break;
//            case 1, -6:
//                System.out.println("пт");
//                break;
//            case 2, -5:
//                System.out.println("сб");
//                break;
//            case 3, -4:
//                System.out.println("вск");
//                break;
//            case 4, -3:
//                System.out.println("пн");
//                break;
//            case 5, -2:
//                System.out.println("вт");
//                break;
//            case 6, -1:
//                System.out.println("ср");
//                break;
//            default:
//                System.out.println("ошибка");
//        }


    }
}
