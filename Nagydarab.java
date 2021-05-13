package harcosokklubja;
//legyen harcosokkluba package tagja
public class Nagydarab extends Harcos /*származzon a harcosból*/ {
    //legyen egy privát állóképesség int
    private int allokepesseg;
/* nagydarab osztálynak elgyen paraméteres konstruktora, amiben bekéri az adattagjai értékét, használjuk fel
    használjuk fel a konstruktorban az ősosztály konstruktorát is*/
    public Nagydarab(int utoero, int egeszseg, int allokepesseg) {
        super(utoero, egeszseg);
        this.allokepesseg = allokepesseg;
    }

    // a nagydarab osztályn egészségének lekérdezésekor mindig adódjon hozzá az állóképessége is
@Override
    public int getEgeszseg() {
        return super.getEgeszseg() + this.allokepesseg;
    }
//allokepesseg lekérhető és beállítható publikus metódosukon keresztül
    public int getAllokepesseg() {
        return allokepesseg;
    }

    public void setAllokepesseg(int allokepesseg) {
        this.allokepesseg = allokepesseg;
    }

    //írjuk felül a toString metódust, ami hívja meg az ősosztály ugyanilyen metódusát is, és ezen kívül még írjon ki dolgokat
    @Override
    public String toString() {
        return super.toString() + " Nagydarab harcos vagyok, állóképességem " + this.allokepesseg + ".";
    }

}
