package designpatterns.factory;

public class Factory {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new ThreeWheelerFactory();
        Client client = new Client(vehicleFactory);
        Vehicle twoWheeler = client.getVehicle();
        twoWheeler.vehicle();

    }


}

interface Vehicle{
    public void vehicle();
}

class TwoWheeler implements Vehicle {
    public void vehicle(){
        System.out.println("two wheeler");
    }
}

class ThreeWheeler implements Vehicle{
    public void vehicle(){
        System.out.println("Three wheeler");
    }
}


interface VehicleFactory {
    Vehicle createVehicle();
}

class TwoWheelerFactory implements VehicleFactory {
    public Vehicle createVehicle(){
        return new TwoWheeler();
    }
}

class ThreeWheelerFactory implements VehicleFactory{
    public Vehicle createVehicle(){
        return new ThreeWheeler();
    }
}

class Client{
    private Vehicle vehicle;

    public Client(VehicleFactory vehicleFactory){
        this.vehicle = vehicleFactory.createVehicle();
    }

    public Vehicle getVehicle(){
        return this.vehicle;
    }
}

