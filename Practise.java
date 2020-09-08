import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class Practise {
    public static void main(String args[]){

        int number;
        int prvocisla = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Zadejte cislo");
        number = sc.nextInt();

        if( number % 7 == 0) {
            System.out.println("Je delitelne 7");
        }else {
            System.out.println("Neni delitelne 7");

        }

        System.out.println("----------------Prvocisla----------------");

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

        System.out.println("----------------Advent of code Day 1---------------");

        try{
            BufferedReader br = new BufferedReader(new FileReader(new File("inputs.txt")));

            int totalcount = 0;
            String row;

            while((row = br.readLine()) != null) {
                int rownumber = Integer.parseInt(row);
                rownumber = (int)Math.floor((double)rownumber / 3.0);
                rownumber = rownumber - 2;
                totalcount = totalcount + rownumber;
            }

            System.out.println(totalcount);

        }catch (Exception e) {
            e.printStackTrace();     

        }
        

        
         
    }
}