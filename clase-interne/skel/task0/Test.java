package task0;

interface Engine {
    public int getFuelCapacity();
}

class Car {
    class OttoEngine implements Engine {
        private int fuelCapacity;

        public OttoEngine(int fuelCapacity) {
            this.fuelCapacity = fuelCapacity;
        }

        public int getFuelCapacity() {
            return fuelCapacity;
        }
    }

    //pt clasa anonima
    public Engine getEngine(int fuelCapacity) {
        return new Engine() {
            private int fuelCapacity = 11;

            public int getFuelCapacity() {
                return fuelCapacity;
            }
        };

    }
}

        // pt clasa normala
//    public OttoEngine getEngine() {
//        OttoEngine engine = new OttoEngine(11);
//        return engine;
//    }
//}

public class Test {
    public static void main(String[] args) {
        Car car = new Car();

        //pt clasa anonima
        Engine firstEngine = car.getEngine(12);
        Car.OttoEngine secondEngine = car.new OttoEngine(10);
        System.out.println(firstEngine.getFuelCapacity());
        System.out.println(secondEngine.getFuelCapacity());

        // pt clasa normala
//        Car.OttoEngine firstEngine = car.getEngine();
//        Car.OttoEngine secondEngine = car.new OttoEngine(10);
//
//        System.out.println(firstEngine.getFuelCapacity());
//        System.out.println(secondEngine.getFuelCapacity());
    }
}


