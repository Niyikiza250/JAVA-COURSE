package Conditions.Step2;

import java.util.Scanner;

public class Loops {

    static void main(String[] args) {
        Scanner loop=new Scanner(System.in);
        /*
        LOOPS:
        // for loop


        for (int i=10; i>=1; i--){
            if (i % 2 == 0){
            System.out.println(i);
        }}


        int number,factorial=1;
        System.out.println("Enter number here to make factorial");
        number=loop.nextInt();
        for (int i=1; i<=number; i++){
            factorial*=i;
        }
            System.out.println("the factorio of this "+ number + "is "+ factorial);



        for (int i =1; i<=10; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }


        for (int i=1; i<=5;i++) {
            for (int h = 1; h <= i; h++ ) {
                System.out.print(i);

            }
            System.out.println();
        }


        for (int building = 1; building <=2; building++){
            for( int floor =1; floor<=3; floor++){
                for(int room=1; room<=2; room++){
                    for (int computer=1; computer<=2; computer++){
                        System.out.println(
                                "Building : "+ building +
                                  " \nFloor: " + floor +
                                  " \nRoom : "   + room +
                                  " Computer " + computer
                        );
                    }

                }

            }

        }

         */
            for (int i=1; i<=10; i++){
                for (int h=1; h<=i; h++){
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}
