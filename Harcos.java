//legyen a harcosokklubja csomagban
package harcosokklubja;

public class Harcos {

    private int utoero;
    private int egeszseg;
//konstruktor, ami paraméterül várja a két értéket, default konstruktor ne legyen
    public Harcos(int utoero, int egeszseg){
        this.utoero = utoero;
        this.egeszseg = egeszseg;
    }
/*a harcosnak legyen egy megut() publikus metódusa, ami nem ad vissza értéket,
 egy másik harcost vár paraméterül, s a paraméterként kapott hracosnak az egészségébeől levonja az aktuális harcos ütőerejét */
    public void megut(Harcos kit){
        kit.egeszseg -= this.utoero;
        //írja ki a metódus, hogy a harcos megütötte a másikat, ehhez felhasználva a megírt toString metódust
        System.out.println("Egy harcos: " + this + "- megütötte a következőt: " + kit);

    }

//publikus lekérdező és módosító metódusok
    public int getUtoero() {
        return utoero;
    }

    public void setUtoero(int utoero) {
        this.utoero = utoero;
    }

    public int getEgeszseg() {
        return egeszseg;
    }

    public void setEgeszseg(int egeszseg) {
        this.egeszseg = egeszseg;
    }
//definiáljuk felül az osztályban a toString() metódust, és írjunk ki egy adattag értéket
    public String toString() {
        return "Harcos vagyok, ütőerőm: " + this.utoero + ", egészségem: " + this.egeszseg;
    }
}
