package class4;

public class NestIfDemo7 {
    public static void main(String[] args) {
        boolean studyHard=true;
        int salary=90000;
        if (studyHard){
            System.out.println("we get the job");
            if (salary>100000) {
                System.out.println("lets buy Tesla");
            }else{
                System.out.println("lets buy toyota");

            }
        }else{
            System.out.println("it might take a little longer for us to get the job");
        }

    }
}
