package com.example.ma.reiseverwaltung;

import android.app.Application;

/**
 * Created by ma on 05.05.2015.
 */
public class Reiseverwaltung extends Application {
    public Kontaktdaten Kontaktdaten;
    public Bewertung Bewertung;

     public Reiseverwaltung()
     {
         Kontaktdaten = new Kontaktdaten();
         Bewertung = new Bewertung();
     }
}
