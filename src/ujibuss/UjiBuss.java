package ujibuss;

/**
 *
 * @author Yuliana
 */
public class UjiBuss {

    public static void main(String[] args) {
        //membuat objek busBesar dari class Buss
        Buss busBesar = new Buss(40);
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(15); //menambahkan 15 penumpang
        busBesar.cetak();
        
        //penambahkan penumpang
        busBesar.addPenumpang(5); //menambahkan 5 penumpang
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(26); //menambahkan 26 penumpang
        busBesar.cetak();
    }
    
}
