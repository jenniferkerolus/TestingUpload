package HomeWork28;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTester {
    public static void main(String[] args) {
        ArrayList<Insurance> insurance=new ArrayList<>();
        Car car=new Car("Gieco","Nissan");
        insurance.add(car);

        Pet pet=new Pet("Gieco","Husky");
        insurance.add(pet);

        Health health=new Health("Gieco");
        insurance.add(health);

        for (int i = 0; i < insurance.size(); i++) {
            Insurance in=insurance.get(i);
            in.getQuote();
            in.cancelInsurance();
        }

        for(Insurance ins:insurance){
            ins.getQuote();
            ins.cancelInsurance();
        }

        Iterator<Insurance> iterator=insurance.iterator();
        while (iterator.hasNext()){
            Insurance in=iterator.next();
            in.getQuote();
            in.cancelInsurance();

        }
    }
}
