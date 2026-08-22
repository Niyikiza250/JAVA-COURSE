package Conditions.Step2;

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


        System.out.println("Student with the highest mark: " + highestStudent);
        System.out.println("Highest mark: " + highMarks);


        System.out.println("Student with the lowest mark: " + lowestStudent);
        System.out.println("Lowest mark: " + lowestMarks);

        System.out.println("Total marks: " + total);
        System.out.println("Average mark: " + average);

        System.out.println("Students passed: " + passed);
        System.out.println("Students failed: " + failed);

        scan.close();


      double [] transactions = new double[3];
        System.out.println("Do you want to know your transactions flow?");
      for (int i=0; i< transactions.length;i++){
          System.out.println("  Enter your Transaction number "+(i+1)+" :");
          transactions[i]=scan.nextDouble();
      }
        System.out.println(" The Total Transactions done");
      for (int i=0; i<transactions.length; i++){
          System.out.println(" Transaction number "+(i+1)+" :"+transactions[i]);
      }
      long total=0;
      long average=0;
      for (int i=0; i<transactions.length; i++){
          total= (long) (total+transactions[i]);
          average= total/transactions.length;

      }
        System.out.println(" The total amount in Transactions = " +total);
      double highest=transactions[0];
      double smallest=transactions[0];
      for (int i=0;i<transactions.length; i++) {
            if (transactions[i] > highest) {
                highest = transactions[i];
            }
      }
        System.out.println(" The highest transaction done is :  " + highest);
            for (int i=0; i<transactions.length; i++){
                 if (transactions[i]<smallest){
                    smallest=transactions[i];
                 }
            }
        System.out.println(" The highest transaction done is :  " + smallest);
            int greaterTrans=0;
           int  lessTrans=0;
            for (int i=0; i<transactions.length; i++){
                if (transactions[i]>=100000){
                    greaterTrans++;
                }
            }
            for (int i=0; i<transactions.length; i++){
                if (transactions[i]< 10000){
                    lessTrans++;
                }
            }
        System.out.println(" The greater Transaction done is : "+greaterTrans);
        System.out.println(" The less Transaction done is : "+ lessTrans);
        System.out.println(" The Average of Transaction done is : "+ average);


        String[] product = new String[3];
        int[] quantity= new int[3];
        double[] prices = new double[1];

        for (int i=0; i<product.length; i++){
            System.out.print("Enter the product "+(i+1)+ " :");
            product[i]= scan.nextLine();
            for (int h=0; h< quantity.length; h++){
                System.out.print("Enter how many pieces in Quality "+(h+1)+ "  : ");
                quantity[i]=scan.nextInt();
                scan.nextLine();
                for (int k=0; k< prices.length; k++){
                    System.out.println("Enter the price of "+(k+1) + " piece : ");
                    prices[i]=scan.nextDouble();
                }
            }
        }


        String password="";
        String username="";
        int age=0;
        while (!username.equalsIgnoreCase("Eric NIYIKIZA") ){

            System.out.println(" Enter Your Username here : ");
            username=scan.nextLine();


        while (!password.equals("12345")){
            System.out.println("Enter Your Password : ");
            password=scan.nextLine();
         while (!(age >=18) ||(!(age <=50)))  {
             System.out.println(" Enter your age here : ");
             age=scan.nextInt();
         }
        }}
        System.out.println(" Your Login Successfully");

         */

    }
}
