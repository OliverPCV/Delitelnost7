import java.util.Scanner;

class Delitelne7 {
    public static void main(String args[]){

        int number;
        int prvocisla = 0;

        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        if( number % 7 == 0){
            System.out.println("Je delitelne 7");
        } 
        else {
            System.out.println("Neni delitelne 7");

        }

        for(int i = 2; i <= 100; i++){
            for(int j = 2; j <= 100; j++){
                if(i % j == 0){
                    prvocisla += 1;
                }
            }
        
           if(prvocisla < 2){
               System.out.println(i);
           }
           prvocisla = 0;
        }
         
    }
}