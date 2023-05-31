package Project02;

 abstract public class Marks {
     int english;
     int math;
     int science;
     int history;
     abstract double getPercentage();
 }
 class A extends Marks {
     A(int english, int math, int science) {
         this.english = english;
         this.math = math;
         this.science = science;

     }

     double getPercentage() {
         double average = (english + math + science) / 3;
         System.out.println("The average percent of student A is " + average);
         return average;
     }
 }
 class B extends Marks{
     B(int english,int math,int science,int history){
         this.english=english;
         this.math=math;
         this.science=science;
         this.history=history;
     }

     @Override
     double getPercentage() {
         double average=(english+math+science+history)/4;
         System.out.println("The average percentage of student B is "+average);
         return average;
     }
 }
