package HomeWork28;

public abstract class Insurance {
    public String insuranceName;

    Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public abstract void getQuote();

    public abstract void cancelInsurance();

}
class Car extends Insurance {
    String carModel;

    Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel = carModel;
    }

    @Override
    public void getQuote() {
        System.out.println("What is your Car model to get quote?");
    }

    @Override
    public void cancelInsurance() {
        System.out.println("You can cancel your insurance");
    }
}
    class Pet extends Insurance {
        String petType;

        Pet(String insuranceName, String petType) {
            super(insuranceName);
            this.petType = petType;
        }

        @Override
        public void getQuote() {
            System.out.println("What is your breed of your dog?");
        }

        @Override
        public void cancelInsurance() {
            System.out.println("You can cancel insurance");
        }
    }
        class Health extends Insurance{
            Health(String insuranceName){
                super(insuranceName);
            }

            @Override
            public void getQuote() {
                System.out.println("Which coverage your looking for ?");
            }

            @Override
            public void cancelInsurance() {
                System.out.println("Yes you can cancel your insurance");
            }
        }


