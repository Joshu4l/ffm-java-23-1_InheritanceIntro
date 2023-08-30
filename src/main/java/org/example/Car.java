package org.example;
// Erstellt euch ein neues Java-Projekt und implementiert die folgenden Schritte zur Übung von Vererbung und Klassen in Java.
// Schritt 1: Erstellt eine Basisklasse "Fahrzeug" mit Eigenschaften wie "Hersteller", "Modell", und "Baujahr".
// Schritt 2: Erstellt eine abgeleitete Klasse "Auto", die von "Fahrzeug" erbt und zusätzliche Eigenschaften wie "Anzahl der Türen" hat.
// Schritt 3: Implementiert eine Methode in der "Fahrzeug"-Klasse, die Informationen über das Fahrzeug ausgibt.
// Schritt 4: Überschreibt die Methode aus Schritt 3 in der "Auto"-Klasse, um auch die Anzahl der Türen auszugeben.
// Schritt 5: Erstellt Instanzen der "Fahrzeug"- und "Auto"-Klassen und ruft die Methoden zur Ausgabe der Informationen auf.

public class Car extends Vehicle {

    // OWN (non-inherited) ATTRIBUTES OF THE VEHICLE CLASS
    protected int doorCount;


    // CONSTRUCTORS
    public Car () {
        // Default Constructor
    }
    public Car(String brand, String model, int yearOfConstruction, int doorCount) {
        super(brand, model, yearOfConstruction);
        this.doorCount = doorCount;
    }


    // OVERRIDE OBJECT REPRESENTATION
    @Override
    public String toString() {
        return "Car{" +
                "brand='" + super.brand + '\'' +
                ", model='" + super.model + '\'' +
                ", yearOfConstruction=" + super.yearOfConstruction + '\'' +
                ", doorCount=" + doorCount +
                '}';
    }


    // GETTERS & SETTERS
    public int getDoorCount (){
        return doorCount;
    }
    public void setDoorCount (int doorCount) {
        this.doorCount = doorCount;
    }

}
