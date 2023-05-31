package review7;

public class Methods {
    //user defined:with return type and without
    //with parameters and without
    void hello(){
        System.out.println("Hello");
    }
    void sayHello(String name){
        System.out.println("Hello "+name);
    }
    int findLargest(int num1,int num2){
        if(num1>num2) {
            return num1;
        }else{
            return num2;
        }
    }
    double findAverage(double num1, double num2){
        return (num1+num2)/2;
    }
    StringBuilder reverse(String given){
        StringBuilder sb=new StringBuilder(given);
        return sb.reverse();
    }

    public static void main(String[] args) {
        String name ="Mohammed";
        int characters=name.length();
        System.out.println(characters);
        Methods obj=new Methods();
        obj.sayHello(name);
        System.out.println("/////////");
        int largest=obj.findLargest(100,200);
        System.out.println("The largest number is "+largest);
        System.out.println("///////////");
        System.out.println(obj.findAverage(10,30));

        StringBuilder reverse=obj.reverse("Hello");
        System.out.println(reverse);

        String myString="Batch15";
        boolean empty=myString.toUpperCase().isEmpty();//false
        char character=myString.trim().charAt(2);//t
        System.out.println(character);


    }
}
