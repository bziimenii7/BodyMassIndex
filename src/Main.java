    public class Main {
        public static void main(String[] args) {
            BmiService service = new BmiService();
            double weight = 77.5;
            double height = 1.82;
            double index = service.calculate(weight, height);
            System.out.println("Индекс массы тела = " + index);
        }
    }
