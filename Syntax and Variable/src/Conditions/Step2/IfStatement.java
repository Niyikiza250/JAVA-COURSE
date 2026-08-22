package Conditions.Step2;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        /*
        int age;

        System.out.println("please enter your age");
        age= sc.nextInt();
        int sub= 18-(age);
        if(age>=18){
            System.out.println("Please you're eligible to vote");
        }
        else {
            System.out.println(" please remain " + sub + " years so that you can vote after that years");
        }



        int balance;
        System.out.println("enter your balance here");
        balance= sc.nextInt();
        if(balance>1000){

            System.out.println("Premium customer");

        }
        else{
            System.out.println("enter the real balance");
        }


        int temperature;
        System.out.println(" please enter your temperature you have ");
        temperature= sc.nextInt();
        if(temperature>=30){
            System.out.println(" The weather is so hot you can have water");
        }
        else {
            System.out.println("The weather is Normal");
        }


        String username;
        System.out.println("enter your username here ");
        username= sc.nextLine();
        if(username.equals("Admin")){
            System.out.println("welcome to the dashboard");
        }
        else{
            System.out.println("invalid username entered");
        }


        boolean accountActive=true;
        if (accountActive =true){
            System.out.println("Account is active");
        }
        else {
            System.out.println("Account is unactive");
        }


        int pin;
        System.out.println("please enter your pin here");
        pin= sc.nextInt();
        if(pin!=12345){
            System.out.println("invalid pin");
            System.out.println(" please enter the real pin");
            pin= sc.nextInt();
        }

        else {
            System.out.println("Pin Accepted");
        }


        boolean emergency;
        int age;
        System.out.println("Is it emergence there  true/False");
        emergency= sc.nextBoolean();
        sc.nextLine();
        System.out.println("Enter the age");
        age= sc.nextInt();
        if(emergency==true && (age>=65)){
            System.out.println("send patient immediately\n Senior citizen");
        }
        else {
            System.out.println("Your have to wait");
        }


        long balance;
        System.out.println("=====================================");
        System.out.println("   WELCOME TO OUR ACCOUNTS TYPES     ");
        System.out.println("Enter your balance to see the bank account type");
        balance=sc.nextLong();
        if (balance >=100001){
            System.out.println(" Your accountType is: Platinum Customer " );
        }
        else if (balance>=50001 && (balance < 100000 )) {
            System.out.println("Your accountType is: Gold Customer");
        }
        else if (balance>=10000 && (balance<50000)) {
            System.out.println("Your accountType is: Silver customer");
        } else if (balance<10000 && (balance>0)) {
            System.out.println("Your accountType is: Regular Customer");
        }
        else {
            System.out.println("Entered number must pe positive");
        }


            int age;
            String gender;
            int experience;
            String Diploma;
        System.out.println(" Enter your age : ");
        age= sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your gender");
        gender=sc.nextLine();
        System.out.println("How many years of experience do you have?");
        experience=sc.nextInt();
        sc.nextLine();
        System.out.println(" Do you have a Diploma?");
        Diploma= sc.nextLine();
        if((age>=18 && (age<=26)) && (gender.equalsIgnoreCase("male")) && (experience>=0 && (experience<=10)) && (Diploma.equalsIgnoreCase("yes"))){
            System.out.println(" you're Eligible to apply");
        }
        else {
            System.out.println("You're not Eligible to Apply");
        }



        // Nested if Stage

        String username;
        String password;
        String accountActive;
        System.out.println("Your account is active? ");
        accountActive=sc.nextLine();

        if (accountActive.equalsIgnoreCase("yes")) {
            System.out.println("Your Account is Active");
            System.out.println("Enter your name");
            username=sc.nextLine();
            if(username.equalsIgnoreCase("Eric Niyikiza")){
                System.out.println("your name is valid");

                System.out.println("Enter your Password here please");
                password= sc.nextLine();


                if(password.equalsIgnoreCase("Eric@123")){
                    System.out.println("Your password is correct ");
                }
                else{
                    System.out.println("Your password is invalid");
                }
            }
            else {
                System.out.println("Your name is invalid, please enter the real one");
            }
        }
        else {
            System.out.println("your Account is not active");
        }



        // University Admission
        int age ;
        String Diploma;
        double marks;

        System.out.println("Enter your age here : ");
        age= sc.nextInt();
        sc.nextLine();
        if (age>=18){
            System.out.println(" Welcome University Admission partal");
            System.out.println("Do you have Diploma  Yes/ No");
            Diploma=sc.nextLine();
            if (Diploma.equalsIgnoreCase("Yes")){
                System.out.println("how many marks do you have on it?");
                marks=sc.nextDouble();
                if (marks>=70){
                    System.out.println("Now you can have Admission\n\n Try to take your documents to campus tomorrow");
                }
                else {
                    System.out.println("According to your marks "+marks+ ", You're not eligible to Apply on this University. \n sorry.\n Try another University");
                }
            }
            else {
                System.out.println(" You must have Diploma before you apply");
            }
        }
        else {
            System.out.println("You are not eligible to make Admission");
        }


        // 🏦 Bank Loan Approval
            String accountActive, stableAccount;
            String username, password;
            int age;
            double credit,loanAmount;
        System.out.println("====================================");
        System.out.println( " WELCOME TO THE BANK LOAN SYSTEM");
        System.out.println("====================================\n\n");
        System.out.println("Is your bankAccount active? Yes/ Now");
        accountActive=sc.nextLine();
        if (accountActive.equalsIgnoreCase("yes")){
            System.out.println("Enter your full name: ");
            username=sc.nextLine();
            if (username.equalsIgnoreCase("Eric niyikiza")){
                System.out.println("YOur identity verified");
                System.out.println(" Enter you password");
                password=sc.nextLine();
                if (password.equalsIgnoreCase("Eric@123")){
                    System.out.println(" Enter your Age here : ");
                    age=sc.nextInt();
                    sc.nextLine();

                    if (age>=18){
                        System.out.println("Do have stable income");
                        stableAccount=sc.nextLine();
                        if (stableAccount.equalsIgnoreCase("yes")){
                            System.out.println(" Enter your credit you want ");
                            credit=sc.nextInt();
                            sc.nextLine();
                            if (credit>=500 && credit<50001){
                                System.out.println("Enter your Loan amount ");
                                loanAmount=sc.nextInt();
                                sc.nextLine();
                                if (loanAmount<=credit){
                                    System.out.println(" Your loan Approved Congratulations\n You gonna get message of approve soon");
                                }
                               else {
                                    System.out.println(" you must save before to get loan please");
                                }
                            }
                            else {
                                System.out.println(" you have to increse your credit amount to get a loan");
                            }

                        }
                        else {
                            System.out.println(" You must have a stable income please!");
                        }
                    }
                    else {
                        System.out.println("You're under age");
                    }
                }
                else {
                    System.out.println(" You entered invalid password");
                }

            }
            else {
                System.out.println(" You entered invalid username");
            }

        }
        else {
            System.out.println("you're rejected to our bank loan system");
        }


            */


        // LOOPS= Do, While, For.
            for(int i=10; i>=1; i--){
                if (i % 2 ==0){
                System.out.println(i+" $");
            }}

    }


}


