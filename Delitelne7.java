import java.util.Scanner;

class Delitelne7 {
    public static void main(String args[]){

        int number;

        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        if( number % 7 == 0){
            System.out.println("Je delitelne 7");
        } 
        else {
            System.out.println("Neni delitelne 7");

        }


    }
}