import java.util.Scanner;

public class Array {
    static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        /*
        String [] student={"eric", "Germain", "Zabayo"};

            for (int i=0; i<=student.length; i++) {
                System.out.println("the third name is " + student[i]);
            }


        String [] name =new String[5];

        for (int i=0; i< name.length;i++){
            System.out.println("please enter number "+(i+1)+" :");
            name[i]=scan.nextLine();
        }
        System.out.println(" Names entered successful");

        for (int i=0; i<name.length; i++){
            System.out.println("The name number"+(i+1)+ "is ; "+ name[i]);
        }

         */
        String [] names= new String[10];
        double [] marks = new double[10];

        for (int i=0; i<names.length; i++){
            System.out.println(" Enter the name of the student number "+(i+1)+ "  :");
            names[i]=scan.nextLine();
        }

        for (int i=0; i<names.length; i++){
            System.out.println(" Enter the marks of the student number " +(i+1) + " ;");
            marks[i]=scan.nextDouble();
            scan.nextLine();
        }
        for (int i=0; i<names.length;i++){
            System.out.println(
                    " Student "+(i+1)+ " :" + names[i]+ "  : " +marks[i]
            );
        }

        // Calculating the highest marks with its student
        String highestStudent= names[0];
        double highMarks= marks[0];
        for (int i=0; i<marks.length; i++){
            if (marks[i]>highMarks){
                highMarks=marks[i];
                highestStudent= names[i];
            }
        }

        // Calculating the lowest  marks with the student who have them
        String lowestStudent= names[0];
        double lowestMarks= marks[0];
        for (int i=0;i<marks.length; i++){
            if (marks[i]<lowestMarks){
                lowestStudent=names[i];
                lowestMarks=marks[i];
            }
        }
        // Calculate total
        double total=0;
        for (int i =0; i<marks.length;i++){
            total=total+marks[i];
        }
        // Calculating the Avarege
        double average= total/marks.length;
        // Cont passed and FAILED students
        int passed=0;
        int failed=0;
        for (int i =0; i<marks.length; i++){
            if (marks[i]>=50){
                passed++;
            }
            else {
                failed++;
            }
        }
        // now display the students and their marks analysis
        System.out.println("\n===== ANALYSIS =====");


        System.out.println("Student with highest mark: " + highestStudent);
        System.out.println("Highest mark: " + highMarks);


        System.out.println("Student with lowest mark: " + lowestStudent);
        System.out.println("Lowest mark: " + lowestMarks);

        System.out.println("Total marks: " + total);
        System.out.println("Average mark: " + average);

        System.out.println("Students passed: " + passed);
        System.out.println("Students failed: " + failed);

        scan.close();

    }
}
