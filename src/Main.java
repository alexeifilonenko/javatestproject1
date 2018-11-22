public class Main {


    public static void main(String[] args) {
        Car mersedes = new Car("SLS AMG", 330); //создание экземпляра класса mersedes
        System.out.println(mersedes.model);
        System.out.println(mersedes.maxSpeed);
        System.out.println(Math.round(mersedes.countSth()));

        mersedes.setModel("Mers600");
        System.out.println(mersedes.model);

        Car BMW = new Car("M5", 280);       //создание оэкземпляра класса BMW
        System.out.println(BMW.model);
        System.out.println(BMW.maxSpeed);

        Car Porche = new Car("Caenne", 275); //создание оэкземпляра класса Porche
        System.out.println(Porche.model + " " + Porche.maxSpeed);
        System.out.println(Porche.maxSpeed);
    }


    }

