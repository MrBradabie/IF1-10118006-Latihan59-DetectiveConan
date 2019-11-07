 
package if1.pkg10118006.latihan59.detectiveconan;

/*
 * @author 
 * NAMA  : Alfarizi Rizki Pane
 * KELAS : IF 1
 * NIM   : 10118006
 */
public class SupportCharacter extends Character{
    
    private String related;

    public SupportCharacter(String related, String name, String from, boolean eyeglasses) {
        super(name, from, eyeglasses);
        this.related = related;
    }
    
    public String getRelated() {
        return related;
    }

    public void displayCharacter() {
        System.out.println("-----");
        System.out.println("Nama : " + name);
        System.out.println("-----");
        System.out.println("Dari : " + from);
        if(eyeglasses) {
            System.out.println("Kecamata : Iya");
        } else {
            System.out.println("Kecamata : Tidak");
        }
        System.out.println("Hubungan dengan tokoh utama : " + related);
        System.out.println();
    }
    
}
