package org.example;
// Erstellt euch ein neues Java-Projekt und implementiert die folgenden Schritte zur Übung von Vererbung und Klassen in Java.
// Schritt 1: Erstellt eine Basisklasse "Fahrzeug" mit Eigenschaften wie "Hersteller", "Modell", und "Baujahr".
// Schritt 2: Erstellt eine abgeleitete Klasse "Auto", die von "Fahrzeug" erbt und zusätzliche Eigenschaften wie "Anzahl der Türen" hat.
// Schritt 3: Implementiert eine Methode in der "Fahrzeug"-Klasse, die Informationen über das Fahrzeug ausgibt.
// Schritt 4: Überschreibt die Methode aus Schritt 3 in der "Auto"-Klasse, um auch die Anzahl der Türen auszugeben.
// Schritt 5: Erstellt Instanzen der "Fahrzeug"- und "Auto"-Klassen und ruft die Methoden zur Ausgabe der Informationen auf.

public class Main {
    public static void main(String[] args) {

        // Instantiate a 1st vehicle and initialize it DIRECTLY
        Vehicle v1 = new Vehicle("setra", "s415nf", 2000);
        System.out.println(v1);

        // Instantiate a 2nd vehicle and initialize it INDIRECTLY via getters and setters
        Vehicle v2 = new Vehicle();
        v2.setBrand("mercedes");
        v2.setModel("citaro");
        v2.setYearOfConstruction(2003);
        System.out.println(v2);


        // Instantiate a 1st car and initialize it DIRECTLY
        Car c1 = new Car("tata", "nano", 2002, 2);
        System.out.println(c1);

        // Instantiate a 2nd car and initialize it INDIRECTLY via getters and setters
        Car c2 = new Car();
        c2.setBrand("fiat");
        c2.setModel("multipla");
        c2.setYearOfConstruction(2003);
        c2.setDoorCount(4);
        System.out.println(c2);

    }
}