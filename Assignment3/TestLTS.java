/*---------------------------------------------------
Name: Juliette Perez
Student ID: 4000366015
COP 2800 – Java Programming
Spring 2025 – Th 5:30 PM – 8:50 PM
Assignment #3
Plagiarism Statement
I certify that this assignment is my own work and that I have not
copied in part or whole or otherwise plagiarized the work of other
students, persons, Generative Pre-trained Generators (GPTs) or any other AI tools.
I understand that students involved in academic dishonesty will face
disciplinary sanctions in accordance with the College's Student Rights
and Responsibilities Handbook (https://www.mdc.edu/rightsandresponsibilities)
01234567890123456789012345678901234567890123456789012345678901234567890123456789
----------------------------------------------------------*/

public class TestLTS {
        public static void main(String[] args) {
        LTS spaceship = new LTS(38000000, 400000);

        System.out.println("LTS Manufacturer: " + spaceship.getManufacturer());
        System.out.println("LTS Date Manufactured: " + spaceship.getDateManufactured());
        System.out.println("LTS ID: " + spaceship.getItsId());
        System.out.println("LTS Mass Data -\nDry: " + spaceship.getDryMass() + " pounds\nFuel: " +
                            spaceship.getFuelMass() + " pounds\nCargo: " + spaceship.getCargoMass() +
                            " pounds\nGross: " + spaceship.getGrossMass() + " pounds");

        System.out.println("----------------------");

        for (int i = 0; i < 10; i++) {
            System.out.println("Increased mission time (" + spaceship.getMissionTime() +") by 5 seconds.");
            spaceship.increaseMissionTime();
        }

        System.out.println("Attempting to deploy cargo - ");
        spaceship.deployCargo();

        for (int i = 0; i < 30; i++) {
            System.out.println("Increased mission time (" + spaceship.getMissionTime() +") by 5 seconds.");
            spaceship.increaseMissionTime();
        }

        System.out.println("Attempting to deploy cargo - ");
        spaceship.deployCargo();

    }
}