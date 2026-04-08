package DesignPattern.Factory;

interface Car{
    void assemble();
}

interface CarSpecification{
    void specification();
}

class Audi implements Car{
    public void assemble(){
        System.out.println("In audi car assemble..");
    }
}

class AudiSpecification implements CarSpecification{
    public void specification(){
        System.out.println("In audi car specification..");
    }
}

class BMW implements Car{
    public void assemble(){
        System.out.println("In BMW car assemble..");
    }
}

class BMWSpecification implements CarSpecification{
    public void specification(){
        System.out.println("In BMW car specification..");
    }
}

interface CarFactory {
    Car createCar();
    CarSpecification createCarSpecification();
} 

class BMWFactory implements CarFactory{
    public Car createCar(){
        return new BMW();
    } 
    public CarSpecification createCarSpecification(){
        return new BMWSpecification();
    }
}

class AudiFactory implements CarFactory{
    public Car createCar(){
        return new Audi();
    } 
    public CarSpecification createCarSpecification(){
        return new AudiSpecification();
    }
}

public class AbstractFactoryPattern{
    public static void main(String[] args){
        CarFactory audifactory=new AudiFactory();
        Car audi=audifactory.createCar();
        CarSpecification audispecification=audifactory.createCarSpecification();
        audi.assemble();
        audispecification.specification();
        
        
        CarFactory bmwfactory= new  BMWFactory();
        Car bmw=bmwfactory.createCar();
        CarSpecification bmwspecification=bmwfactory.createCarSpecification();
        
        bmw.assemble();
        bmwspecification.specification();
    }
}