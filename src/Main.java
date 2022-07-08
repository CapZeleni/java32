public class Main {
    public static void main(String[] args) {
        BodyMassIndex service = new BodyMassIndex();
        int h = 180;
        int w = 95;
        int myCalculate = service.calculate(h, w);
        System.out.println("Индекс массы тела равен");
        System.out.println(myCalculate);
    }
}