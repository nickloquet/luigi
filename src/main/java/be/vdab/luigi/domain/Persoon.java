package be.vdab.luigi.domain;

import java.time.LocalDate;

public class Persoon {
    private final String naam;
    private final String familienaam;
    private final int aantalKinderen;
    private final boolean gehuwd;
    private final LocalDate geboorte;
    private final Adres adres;

    public Persoon(String naam, String familienaam, int aantalKinderen, boolean gehuwd, LocalDate geboorte, Adres adres) {
        this.naam = naam;
        this.familienaam = familienaam;
        this.aantalKinderen = aantalKinderen;
        this.gehuwd = gehuwd;
        this.geboorte = geboorte;
        this.adres = adres;
    }

    public String getNaam() {
        return naam + ' ' + familienaam;
    }
    public int getAantalKinderen() {
        return aantalKinderen;
    }
    public boolean isGehuwd() {
        return gehuwd;
    }
    public LocalDate getGeboorte() {
        return geboorte;
    }
    public Adres getAdres() {
        return adres;
    }
}
