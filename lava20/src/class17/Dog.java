package class17;

public class Dog {
    String name;
    String breed;
    String color;
    int age;
    double weight;

    Dog(String dogName,String dogBreed,String dogColor,int dogAge,double dogWeight){
        name=dogName;
        breed=dogBreed;
        color=dogColor;
        age=dogAge;
        weight=dogWeight;
    }
    void printInfo(){
        System.out.println("Name "+name+" Breed "+breed+" age "+age+" Weight "+weight);
    }

    public static void main(String[] args) {
Dog husky=new Dog("Husky","Husky the dog","White",2,25.2);
husky.printInfo();
Dog bulldog=new Dog("Bulldog","Bulldog the dog","Black",3,27.1);
bulldog.printInfo();
Dog labrador=new Dog("Labrador","Labrador the dog","Brown",4,28.0);
labrador.printInfo();
    }
}
