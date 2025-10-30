import java.util.Random;    

public class homeworkFRC1 {
public static void main(String[] args) {
    Random rand = new Random();
    int randGrade = rand.nextInt(101);
    int randGrade1 = rand.nextInt(101);
    int randGrade2 = rand.nextInt(101);
    int randGrade3 = rand.nextInt(101);
    int randGrade4 = rand.nextInt(101);
    int[] grades = {randGrade, randGrade1, randGrade2, randGrade3, randGrade4};
    for(int grade:grades){
        int student = 0;
        student++;
        String studentName = Integer.toString(student);

        if(grade>=90){
            System.out.println("Student "+studentName+" - "+ grade + " A");
        } else if(grade>=80){
            System.out.println("Student "+studentName+" - "+ grade + " B");
        } else if(grade>=70){
            System.out.println("Student "+studentName+" - "+ grade + " C");
        } else if(grade>=60){
            System.out.println("Student "+studentName+" - "+ grade + " D");
        } else if (grade<60){
            System.out.println("Student "+studentName+" - "+ grade + " F");
        } else {
            System.out.println("Error");
        }
    }
    
    }
}
