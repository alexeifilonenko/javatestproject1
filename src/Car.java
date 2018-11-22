public class Car {                                          //создали класс

    String model;                                           //объявление переменных
    int maxSpeed;

    public Car(String model, int maxSpeed) {                //создание конструктора класса
        this.model = model;
        this.maxSpeed = maxSpeed;
    }


    public double countSth() {                         // метод, который возвращает скорость в м/с
        return maxSpeed / 360.0 * 100.0;
    }


    public void setModel(String model) {            //устанавливаем новую модель экземпляру класса
        this.model = model;
    }



}


