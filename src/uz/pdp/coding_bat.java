package uz.pdp;

import java.util.Scanner;

/**
 * Bobosharipov Shokirjon,Sat 12:24 AM. 10/23/2021
 */
public class coding_bat {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str=scanner.nextLine();

        if(str.length() < 3){

            System.out.println(str + str + str);

        }

        else if (str.length() == 3)
        {

        System.out.println(str.substring(0,2)+str+str.substring(0,2));

        }

            else System.out.println((str.substring(0,2)+str+str.substring(0,2)));
    }
}

