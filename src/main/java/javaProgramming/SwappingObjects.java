package javaProgramming;

class Car{

    int model, no;

    Car(int model, int no){
        this.model = model;
        this.no = no;
    }

    void print(){
        System.out.println("Car Number = "+no+", Model Number = "+model);
    }
}

class CarWrapper{

    Car c;
    CarWrapper(Car c){

        this.c = c;
    }
}
public class SwappingObjects {

    public static void swap(CarWrapper cw1, CarWrapper cw2){

        Car temp = cw1.c;
        cw1.c = cw2.c;
        cw2.c = temp;

    }

    public static void main(String[] args){

        Car c1 = new Car(12345,1);
        Car c2 = new Car(123456, 2);

        CarWrapper cw1 = new CarWrapper(c1);
        CarWrapper cw2 = new CarWrapper(c2);

        swap(cw1,cw2);
        cw1.c.print();
        cw2.c.print();


    }
}
