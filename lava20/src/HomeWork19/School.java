package HomeWork19;

public class School {
    public static void main(String[] args) {


    Teacher teacher = new Teacher();
    teacher.name="Asel";
    teacher.ID=2354;
    teacher.tests();
    teacher.homework();
    teacher.teaches();
    teacher.punishes();

        System.out.println("----------------");

    MathTeacher math=new MathTeacher();
    math.name="Asghar";
    math.ID=4568;
    math.subject="Math";
    math.grade="5th";
       math.teaches();
       math .homework();
        math.teaches();
        math.punishes();
        math.math();

        System.out.println("-----------------");

      ChemistryTeacher chemistry=new ChemistryTeacher();
    chemistry.years=3;
        chemistry.teaches();
       chemistry .homework();
        chemistry.teaches();
       chemistry .punishes();

        System.out.println("-------------------");
        PianoTeacher piano=new PianoTeacher();
    piano.name="Asghar";
    piano.ID=4568;
    piano.level="beginners";
        piano.teaches();
        piano.homework();
        piano.teaches();
        piano.punishes();
        piano.play();

}
}
