package ujibuss;

/**
 *
 * @author Yuliana
 */
public class Buss {
    private int penumpang;
    private int maxPenumpang;
    
    //konstruktor kelas Bus
    public Buss(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    
    //method mutator untuk menambahkan penumpang
    public void addPenumpang(int penumpang){
        int temp ;
        temp = this.penumpang+penumpang;
        if(temp >= maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }else{
            this.penumpang = temp;
        }
    }
    //method void
    public void cetak(){
        System.out.println("Penumpang Bus Sekarang adalah "+penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah "+maxPenumpang);
    }
}
