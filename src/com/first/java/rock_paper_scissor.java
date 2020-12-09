package com.first.java;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

public class rock_paper_scissor {
    public static void main(String[] args) {
        String input;
        char new_input;
        int player_score=0;
        int system_score=0;
        char system_choice;
        int choice;
        int i=0;
        String temp_input;
        while(i<=5) {
                System.out.println("select either 'R' or  'P' or  'S' ");
                System.out.println("++++++++++++++++++++++++++++++++++");
                System.out.print("player input : ");
                Scanner sc = new Scanner(System.in);
                input = sc.nextLine();
                System.out.println("++++++++++++++++++++++++++++++++++");

                temp_input= input.toUpperCase();
                if(temp_input.startsWith("R") || temp_input.startsWith("P") || temp_input.startsWith("S") ) {
                    new_input = temp_input.charAt(0);
                }
                else{
                    System.out.println("user input is not valid terminating programme");
                    player_score=-1;
                    system_score=-1;
                    break;
                }

                Random random = new Random();

                choice = random.nextInt(3);
                switch (choice) {
                    case 0:
                        system_choice='R';
                        break;
                    case 1:
                        system_choice='P';
                        break;
                    case 2:
                        system_choice='S';
                        break;
                    default:
                        system_choice='$';
                        break;

                }


                if (system_choice == 'R' && new_input == 'P') {
                    System.out.println("player gains point");
                    player_score += 1;
                } else if (system_choice == 'P' && new_input == 'S') {
                    System.out.println("player gains point");
                    player_score += 1;
                } else if (system_choice == 'S' && new_input == 'R') {
                    System.out.println("player gains point");
                    player_score += 1;
                } else if (new_input == 'R' && system_choice == 'P') {
                    System.out.println("system gains point");
                    system_score += 1;
                } else if (new_input == 'P' && system_choice == 'S') {
                    System.out.println("system gains point");
                    system_score += 1;
                } else if (new_input == 'S' && system_choice == 'R') {
                    System.out.println("system gains point");
                    system_score += 1;
                }else{
                    System.out.println("its a tie");
                }
            System.out.println("++++++++++++++++++++++++++++++++++");
            i++;
           }
        if (system_score!= -1 && player_score!=-1) {
            if (system_score > player_score) {
                System.out.println("!!!!!!system is the winner");
                System.out.println("player score is "+player_score);
                System.out.println("System score is "+system_score);
            } else if (system_score < player_score) {
                System.out.println("!!!!!!player is the winner");
                System.out.println("player score is "+player_score);
                System.out.println("System score is "+system_score);
            } else {
                System.out.println("!!!!!!match is a tie");
            }
        }
    }
}
