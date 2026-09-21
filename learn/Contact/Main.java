
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Contact> contacts = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        try {
            File file = new File("Contact.txt");
            Scanner fileScanner = new Scanner(file);
            while(fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                Contact contact = new Contact(parts[0], parts[1], parts[2]);
                contacts.put(parts[0],contact);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found yet");
        }
        
        while (true) { 
            System.out.println("1.Add Contact");
            System.out.println("2.View all contacts");
            System.out.println("3.Search by name");
            System.out.println("4.Delete Contact");
            System.out.println("5.Exit");
            System.out.println("_______________________");

            int choice;
            try {
                choice = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Plase a enter a valid number!");
                scanner.nextLine();
                continue;
            }


            if(choice == 1){
                System.out.print("Enter the name: ");
                String name = scanner.nextLine();
                System.out.print("Enter the phone number: ");
                String phone = scanner.nextLine();
                System.out.print("Enter the email: ");
                String email = scanner.nextLine();
                Contact contact = new Contact(name,phone,email);
                contacts.put(name,contact);
                try {
                    FileWriter writer = new FileWriter("Contact.txt",true);
                    writer.write(name + "," + phone + "," + email + "\n");
                    writer.close();
                } catch (IOException e) {
                    System.out.println("Error writing to file.");
                }
                
            }else if(choice == 2){
                for(String name : contacts.keySet()){
                    Contact contact = contacts.get(name);
                    System.out.println("Name: " + contact.getName());
                    System.out.println("Phone: " + contact.getPhone());
                    System.out.println("Email: " + contact.getEmail());
                    System.out.println("_________________________");
                }   
            }else if(choice == 3) {
                System.out.println("Search by name: ");
                String searchName = scanner.nextLine();
                if(contacts.containsKey(searchName)) {
                    System.out.println("Found: " + contacts.get(searchName));
                }else{
                    System.out.println("Not Found!");
                }
            }else if(choice == 4) {
                System.out.println("Search by name: ");
                String searchName = scanner.nextLine();
                int indexToRemove = -1;
                for(int i = 0; i < contacts.size();i++){
                    if(contacts.get(i).getName().equals(searchName)) {
                        indexToRemove = i;
                        break;
                    }
                }
                if(indexToRemove != -1) {
                    contacts.remove(indexToRemove);
                    System.out.println("Contact deleted");
                } else {
                    System.out.println("No contact found with that name.");
                }
            }else if(choice == 5) {
                break;
            }
        }
    }
}