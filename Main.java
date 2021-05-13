//ne legyen a package tagja
//írjunk egy csomagon kívüli futtatható osztályt
import harcosokklubja.Harcos;
import harcosokklubja.Nagydarab;

public class Main {
/*az osztály rendelkezzen egy statikus meccs(Harcos h1, Harcos h2) metódussal, melynek nincs visszatérési értéke.
 Írjuk ki melyik két harcos küzd, ezután a harcosok felváltva megütik egymást háromszor a megut() metódusukkal. A meccs végén írjuk ki az eredményt. */
    public static void meccs(Harcos h1, Harcos h2){
        System.out.println("Elindult a meccs! Harcosaink : " );
        System.out.println(h1);
        System.out.println("A másik harcos:");
        System.out.println(h2);
        System.out.println("------------");

        for(int i=0;i<3;i++){
            if(h1.getEgeszseg()>0) h1.megut(h2);
            if(h2.getEgeszseg()>0) h2.megut(h1);
        }
        System.out.println("A meccs eredménye:");
        if(h1.getEgeszseg() <= 0 && h2.getEgeszseg()<=0) System.out.println("Döntetlen!");
        else if (h1.getEgeszseg() > 0 && h2.getEgeszseg()>0) System.out.println("Döntetlen!");
        else if (h1.getEgeszseg() > 0 && h2.getEgeszseg()<=0) System.out.println("A győztes " + h1);
        else System.out.println("A győztes " + h2);
    }


    public static void main(String[] args){
/* A Nagydarab objektum figyelembevételével bonyolítsuk le a meccseket. Tartsuk nyilván, hogy hány objektumot hoztunk létre, és ha ez legalább
kettő, akkor hozzunk létre meccset. Kezdetben az első két harcost adjuk át, majd a második harmadikat, stb. Nagydarab 2 4 2 Harcos 4 6 Nagydarab 3 3 3
 */
        Harcos[] versenyzok = new Harcos[args.length/3];
        int versenyzokEddig = 0;

        for(int i = 0; i<args.length; i++) {
            Harcos ujHarcos = null;
            if(args[i].equals("Harcos")){
                ujHarcos = new Harcos(Integer.parseInt(args[i+1]), Integer.parseInt(args[i+2]));
                i+=2;
            }
            else if(args[i].equals("Nagydarab")){
                ujHarcos = new Nagydarab(Integer.parseInt(args[i+1]), Integer.parseInt(args[i+2]), Integer.parseInt(args[i+3]));
                i+=3;
            }
            if(ujHarcos !=null) {
                versenyzok[versenyzokEddig] = ujHarcos;
                versenyzokEddig++;
            }
        }

        for(int i = 1; i<versenyzokEddig;i++){
            System.out.println();
            System.out.println();
            meccs(versenyzok[i-1],versenyzok[i]);
        }

    }
}
