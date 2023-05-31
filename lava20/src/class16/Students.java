package class16;

public class Students {
    String name;
    String id;
    static int noOfStudents;

    public static void main(String[] args){

        Students nezir=new Students();
        nezir.name="Nezir";
        nezir.id="1";

        Students ardasher=new Students();
        ardasher.name="Adasher";
        ardasher.id="3";
        ardasher.noOfStudents++;
        System.out.println(Students.noOfStudents);
    }

}
