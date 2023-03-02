package creational.facthorymethod;public class Main {
    public static void main(String[] args){
        SmartPhone IPhone = SmartPhoneFactory.getInstance("IPhone", "Iphone 14 Pro Max");
        System.out.println(IPhone);

        SmartPhone Samsung = SmartPhoneFactory.getInstance("Samsung", "Samsung S23 Ultra");
        System.out.println(Samsung);

        SmartPhone Xiaomi = SmartPhoneFactory.getInstance("Xiaomi", "Xiaomi Mi 11 Ultra");
        System.out.println(Xiaomi);

        System.out.println(IPhone.getClass());
    }
}
