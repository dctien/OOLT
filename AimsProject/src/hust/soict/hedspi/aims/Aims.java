package hust.soict.hedspi.aims;


import java.util.Scanner;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import hust.soict.hedspi.aims.exceptions.AddMediaException;
import hust.soict.hedspi.aims.exceptions.CreateOrderException;
import hust.soict.hedspi.aims.exceptions.PlayerException;
import hust.soict.hedspi.aims.media.book.Book;
import hust.soict.hedspi.aims.media.disc.CompactDisc;
import hust.soict.hedspi.aims.media.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.disc.Track;
import hust.soict.hedspi.aims.order.Order;
import hust.soict.hedspi.aims.thread.MemoryDaemon;

public class Aims extends JFrame{
	public Aims() {
	}

	public static void main(String[] args) {
		new MenuFrame(new JFrame());
	}
	
	private static void removeMediaInOrder(Order anOrder) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Nhap id: ");
		String id = sc.nextLine();
		anOrder.removeMedia(id);
	}

	private static void addCdToOrder(Order anOrder) throws AddMediaException {
		Scanner sc = new Scanner(System.in);
		System.out.printf("\tNhap id: ");
		String id = sc.nextLine();
		System.out.printf("\tNhap title: ");
		String title = sc.nextLine();
		System.out.printf("\tNhap category: ");
		String category = sc.nextLine();
		System.out.printf("\tNhap artist: ");
		String artist = sc.nextLine();
		System.out.printf("\tNhap cost: ");
		float cost = sc.nextFloat();
		CompactDisc cd = new CompactDisc(id, title, category, artist, cost);
		System.out.printf("\tSo luong Track: ");
		int count = sc.nextInt();
		while(count <= 0) {
			System.err.println("So luong Track phai lon hon 0");
			System.out.printf("\tSo luong Track: ");
			count = sc.nextInt();
		}
		sc.nextLine();
		Track track = null;
		String titleTrack;
		int lengthTrack;
		for(int i = 0; i < count; i++) {
			System.out.println("***\tTrack " + (i+1));
			System.out.printf("\tNhap title cua track: ");
			titleTrack = sc.nextLine();
			System.out.printf("\tNhap length cua track: ");
			lengthTrack = sc.nextInt();
			track = new Track(titleTrack, lengthTrack);
			cd.addTrack(track);
			sc.nextLine();
		}
		String ask;
		do {
			System.out.printf("***\tBan muon nghe thu khong(yes|no): ");
			ask = sc.nextLine();
			switch (ask) {
			case "yes":
				System.out.println("===============================");
//				cd.play();
				System.out.println("===============================");
				break;
			case "no":
				break;
			default:
				System.err.println("Nhap sai cu phap");
			}
		} while (ask.equalsIgnoreCase("yes") == false && ask.equalsIgnoreCase("no") == false);
		anOrder.addMedia(cd);
	}

	private static void addDvdToOrder(Order anOrder) throws AddMediaException {
		Scanner sc = new Scanner(System.in);
		System.out.printf("\tNhap id: ");
		String id = sc.nextLine();
		System.out.printf("\tNhap title: ");
		String title = sc.nextLine();
		System.out.printf("\tNhap category: ");
		String category = sc.nextLine();
		System.out.printf("\tNhap director: ");
		String director = sc.nextLine();
		System.out.printf("\tNhap cost: ");
		float cost = sc.nextFloat();
		System.out.printf("\tNhap length: ");
		int length = sc.nextInt();
		sc.nextLine();
		DigitalVideoDisc dvd = new DigitalVideoDisc(id, title, category, length, director, cost);
		String ask;
		do {
			System.out.printf("***\tBan muon nghe thu khong(yes|no): ");
			ask = sc.nextLine();
			switch (ask) {
			case "yes":
				System.out.println("===============================");
				try {
					dvd.play();
				} catch (PlayerException e) {
					System.err.println(e.getMessage());
				}
				System.out.println("===============================");
				break;
			case "no":
				break;
			default:
				System.err.println("Nhap sai cu phap");
			}
		} while (ask.equalsIgnoreCase("yes") == false && ask.equalsIgnoreCase("no") == false);
		anOrder.addMedia(dvd);
	}

	private static void addBookToOrder(Order anOrder) throws AddMediaException {
		Scanner sc = new Scanner(System.in);
		System.out.printf("\tNhap id: ");
		String id = sc.nextLine();
		System.out.printf("\tNhap title: ");
		String title = sc.nextLine();
		System.out.printf("\tNhap category: ");
		String category = sc.nextLine();
		System.out.printf("\tNhap cost: ");
		float cost = sc.nextFloat();
		// constructor a book without AuthorsList
		Book aBook = new Book(id, title, category, cost);
		System.out.printf("\tNhap so luong authors: ");
		int iAuthors = sc.nextInt();
		while(iAuthors <= 0) {
			System.err.println("So luong authors phai lon hon 0");
			System.out.printf("\tNhap so luong authors: ");
			iAuthors = sc.nextInt();
		}
		// loai bo dem 
		sc.nextLine();
		// Add author
		while(iAuthors > 0) {
			System.out.printf("\tNhap author: ");
			String author = sc.nextLine();
			aBook.addAuthor(author);
			iAuthors--;
		}
		anOrder.addMedia(aBook);
	}

	private static Order createOrder() throws CreateOrderException {
		Order anOrder;
		anOrder = Order.createdOrder();
		System.out.println("***Creat new order successfully!");
		return anOrder;
	}
	
	// Maintain menu
	public static void showMenu() {
		System.out.println("Order Management Application: "); 
		System.out.println("--------------------------------"); 
		System.out.println("1. Create new order"); 
		System.out.println("2. Add item to the order"); 
		System.out.println("3. Delete item by id"); 
		System.out.println("4. Display the items list of order"); 
		System.out.println("0. Exit"); 
		System.out.println("--------------------------------"); 
		System.out.println("Please choose a number: 0-1-2-3-4");
	}
	
	// Menu select Book or DVD
	public static void showMenuMedia() {
		System.out.println("Select add Book or DVD "); 
		System.out.println("--------------------------------"); 
		System.out.println("1. Book"); 
		System.out.println("2. DVD"); 
		System.out.println("3. CD");
		System.out.println("0. Exit"); 
		System.out.println("--------------------------------"); 
		System.out.println("Please choose a number: 0-1-2-3");
	}
}
