package org.example;
// Erstellt euch ein neues Java-Projekt und implementiert die folgenden Schritte zur Übung von Vererbung und Klassen in Java.
// Schritt 1: Erstellt eine Basisklasse "Fahrzeug" mit Eigenschaften wie "Hersteller", "Modell", und "Baujahr".
// Schritt 2: Erstellt eine abgeleitete Klasse "Auto", die von "Fahrzeug" erbt und zusätzliche Eigenschaften wie "Anzahl der Türen" hat.
// Schritt 3: Implementiert eine Methode in der "Fahrzeug"-Klasse, die Informationen über das Fahrzeug ausgibt.
// Schritt 4: Überschreibt die Methode aus Schritt 3 in der "Auto"-Klasse, um auch die Anzahl der Türen auszugeben.
// Schritt 5: Erstellt Instanzen der "Fahrzeug"- und "Auto"-Klassen und ruft die Methoden zur Ausgabe der Informationen auf.

public class Vehicle {

    // ATTRIBUTES
    protected String brand;
    protected String model;
    protected int yearOfConstruction;


    // CONSTRUCTORS
    public Vehicle () {
        // Default Constructor
    }
    public Vehicle (String brand, String model, int yearOfConstruction) {
        // Custom Constructor
        this.brand = brand;
        this.model = model;
        this.yearOfConstruction = yearOfConstruction;
    }


    // OVERRIDE OBJECT REPRESENTATION
    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfConstruction=" + yearOfConstruction +
                '}';
    }


    // GETTERS & SETTERS
    public String getBrand () {
        return brand;
    }
    public void setBrand (String brand) {
        this.brand = brand;
    }

    public String getModel () {
        return model;
    }
    public void setModel (String model) {
        this.model = model;
    }

    public int getYearOfConstruction () {
        return yearOfConstruction;
    }
    public void setYearOfConstruction (int yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }

}
