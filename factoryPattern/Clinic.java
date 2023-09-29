package factoryPattern;

import java.util.Scanner;

public class Clinic {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Integer choice = 0;

        while (choice != 3) {
            System.out.println("\n[1] Dog");
            System.out.println("[2] Cat");
            System.out.println("[3] Exit");
            System.out.print("\nSelect a number: ");
            choice = scan.nextInt();

            PetRecord petFile = new PetRecord();
            Pet pet;

            switch (choice) {
                case 1:
                    pet = new Dog();
                    petFile.setPetId("D01");
                    petFile.setPetName("Bantay");
                    petFile.setPet(pet);
                    ((Dog) pet).setBreed("German Shepperd");
                    break;
                case 2:
                    pet = new Cat();
                    petFile.setPetId("C01");
                    petFile.setPetName("Muning");
                    petFile.setPet(pet);
                    ((Cat) pet).setNoOfLives(9);
                    break;
                case 3:
                    System.out.println("\nThank you and goodbye.");
                    return;
                default:
                    System.out.println("\nInvalid, try again");
                    continue;
            }

            System.out.println("\nPet id is " + petFile.getPetId());
            System.out.println("Pet name is " + petFile.getPetName());
            System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
            System.out.println("Communication sound: " + petFile.getPet().makeSound());
            System.out.println("Play mode: " + petFile.getPet().play());

            switch (choice) {
                case 1:
                    System.out.println("Breed: " + ((Dog) petFile.getPet()).getBreed());
                    break;
                case 2:
                    System.out.println("Number of lives: " + ((Cat) petFile.getPet()).getNoOfLives());
                    break;
                default:
                    System.out.println("System error, exiting now.");
                    return;
            }
        }
    }
}
