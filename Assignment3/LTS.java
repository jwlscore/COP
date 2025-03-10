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

import java.util.Date;
import java.util.Random;

public class LTS {
    private int ItsId;
    private Date dateManufactured;
    private double dryMass;
    private double fuelMass;
    private double cargoMass;
    private double grossMass;
    private String manufacturer;
    private int missionTime;
    private double fuelMassOriginal;

    public LTS() {
        Random random = new Random();
        this.ItsId = random.nextInt(999999 - 100000 + 1) + 100000;
        this.dateManufactured = new Date();
        this.dryMass = 620500;
        this.fuelMass = 38000000;
        this.cargoMass = 0;
        this.grossMass = this.dryMass + this.fuelMass + this.cargoMass;
        this.manufacturer = "Celestial Transport Technologies";
        this.missionTime = 0;
        this.fuelMassOriginal = this.fuelMass;
    }

    public LTS(double fuelMass, double cargoMass) {
        Random random = new Random();
        this.ItsId = random.nextInt(999999 - 100000 + 1) + 100000;
        this.dateManufactured = new Date();
        this.dryMass = 620500;
        this.fuelMass = fuelMass;
        this.cargoMass = cargoMass;
        this.grossMass = this.dryMass + this.fuelMass + this.cargoMass;
        this.manufacturer = "Celestial Transport Technologies";
        this.missionTime = 0;
        this.fuelMassOriginal = this.fuelMass;
    }

    public void increaseMissionTime() {
        this.missionTime += 5;
        this.fuelMass = this.fuelMass - (this.fuelMassOriginal * 0.05);
    }

    public void deployCargo() {
        if (this.missionTime < 200) {
            System.out.println("Cannot deploy cargo before orbit is reached! (200 seconds)\nCurrent time: " + this.missionTime);
        } else {
            System.out.println("Cargo deployed! Gross mass reduced from (" + (int) this.grossMass + " pounds) to (" +
                    (int) (this.grossMass - this.cargoMass) + " pounds)");
            this.cargoMass = 0;

        }
    }

    public double getFuelMass() {
        return fuelMass;
    }

    public void setFuelMass(double fuelMass) {
        this.fuelMass = fuelMass;
    }

    public double getCargoMass() {
        return cargoMass;
    }

    public void setCargoMass(double cargoMass) {
        this.cargoMass = cargoMass;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getItsId() {
        return ItsId;
    }

    public Date getDateManufactured() {
        return dateManufactured;
    }

    public double getDryMass() {
        return dryMass;
    }

    public double getGrossMass() {
        return grossMass;
    }

    public int getMissionTime() {
        return missionTime;
    }
}
