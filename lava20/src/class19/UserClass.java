package class19;

public class UserClass {
    String name;
    int phoneN;
    UserClass(String name,int phoneN){
        this.name=name;
        this.phoneN=phoneN;

    }
}
class UserInfo extends UserClass{
    String address;
    UserInfo(String name,int phoneN,String address){
        super(name, phoneN);
        this.address=address;
    }
    void printInfo(){
        System.out.println(name+" his phone number is "+phoneN+" and address "+address);
    }

    }