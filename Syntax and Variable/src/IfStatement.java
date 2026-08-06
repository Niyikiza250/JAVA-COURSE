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

         */
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


    }


}
