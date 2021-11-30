/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsolelagi;
import java.util.Scanner;

/**
 *
 * @author Yulia Rakhmah
 */
public class RentalConsoleLagi extends Others {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // object
        Silver s = new Silver();
        Gold g = new Gold();
        Platinum p = new Platinum();
        
        
        // attribute
        String idMember;
        int dateRent, monthRent, yearRent, dateReturn, monthReturn, yearReturn;
        Scanner input = new Scanner(System.in);
    
        
        // inputan
        System.out.println("+ ========================= Program Pengembalian Console Game Rental ========================= +");
        
        System.out.print("\n| Masukkan ID Member               | : ");
        idMember = input.nextLine();
        
        System.out.print("\n| Masukkan Tanggal Pinjam (1 - 31) | : ");
        dateRent = input.nextInt();
        
        System.out.print("| Masukkan Bulan Pinjam (1 - 12)   | : ");
        monthRent = input.nextInt();
        
        System.out.print("| Masukkan Tahun Pinjam (xxxx)     | : ");
        yearRent = input.nextInt();
        
        System.out.print("\n| Masukkan Tanggal Kembali (1 - 31)| : ");
        dateReturn = input.nextInt();
        
        System.out.print("| Masukkan Bulan Kembali (1 - 12)  | : ");
        monthReturn = input.nextInt();
        
        System.out.print("| Masukkan Tahun Kembali (xxxx)    | : ");
        yearReturn = input.nextInt();
        
        
        // do search data member
        System.out.println("\n+ -------------------------------------------------------------------------------------------- +");
        searchMember(idMember);
        
        
        // show rent date and return date
        System.out.println("\n+ -------------------------------------------------------------------------------------------- +");
        System.out.println("\n| Tanggal Pinjam                   | : " + dateRent + " - " + monthRent + " - " + yearRent);
        System.out.println("| Tanggal Kembali                  | : " + dateReturn + " - " + monthReturn + " - " + yearReturn);
        
        
        // show rent duration
        int rentalDuration = rentDuration(dateRent, monthRent, yearRent, dateReturn, monthReturn, yearReturn);
        System.out.println("| Lama Sewa                        | : " + rentalDuration + " hari");
        
        
        // show rent cost
        String jenisMember = getJenisMember(idMember);
        if("Silver".equals(jenisMember)) {
            System.out.println("\n| Total Sewa                       | : Rp. " + s.costAmount(rentalDuration));
            System.out.println("| Jumlah Poin                      | : " + s.getPoint(rentalDuration));
        
        } else if("Gold".equals(jenisMember)) {
            System.out.println("\n| Total Sewa                       | : Rp. " + g.costAmount(rentalDuration));
            System.out.println("| Jumlah Poin                      | : " + g.getPoint(rentalDuration));
            System.out.println("| Jumlah Cashback              | : Rp. " + g.getCashback());
            
        } else if("Platinum".equals(jenisMember)) {
            System.out.println("\n| Total Sewa                       | : Rp. " + p.costAmount(rentalDuration));
            System.out.println("| Jumlah Poin                      | : " + p.getPoint(rentalDuration));
            System.out.println("| Jumlah Cashback              | : Rp. " + p.getCashback());
            System.out.println("| Bonus Pulsa                  | : Rp. " + p.getBonus(rentalDuration));
            
        } else {
            System.out.println("");
        }
    }
}