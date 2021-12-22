package com.te.jdbcmultiplayer;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MultiPlayer multiplayer = new MultiPlayer();
		int option;
		String song;
		int count = 1;
		do{
			System.out.println("Please choose the  below option ");
			System.out.println("1.add\n2.delete\n3.play\n4.search\n5.display\n6.exit");
			option = scanner.nextInt();
			
			switch (option) {
			case 1:{
				System.out.println("enter the song you want to add ");
				scanner.nextLine();
				song = scanner.nextLine();
				multiplayer.add(song);
				break;
			}
			case 2:{
				System.out.println("Enter the  song name  to delete");
				scanner.nextLine();
				song = scanner.nextLine();
				multiplayer.delete(song);
				break;
			}
			case 3:{
				System.out.println("Enter the song name to play");
				scanner.nextLine();
				song = scanner.nextLine();
				multiplayer.play(song,multiplayer);
				break;
			}
			case 4:{
				multiplayer.dispaly();
				break;
			}
			case 5:{
				System.out.println("Enter the song name to search");
				scanner.nextLine();
				song = scanner.nextLine();
				multiplayer.search(song);
				break;
			}
			case 6:
				count=0;
				break;
			default:
				System.out.println("Oops somewhere went wrong!!");
				break;
			}
		}while(count != 0);
	
	
		
		}
	

}
