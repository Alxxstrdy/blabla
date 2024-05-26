package kalkulatoranjay;
import javax.swing.JOptionPane;
public class Kalkulatoranjay {
    public static void main(String[] args) {
        String menu = JOptionPane.showInputDialog(
                "Pilih Menu Makanan Berikut ini :\n"
                + "1. Penjumlahan \n"
                + "2. Pengurangan \n"
                + "3. Perkalian \n"
                + "4. Pembagian \n"
                + "5. Sisa Hasil Bagi \n"
                + "6. Akar pangkat 2 \n"
                + "7. Akar pangkat 3 \n"
                + "8. Pangkat 2 \n"
                + "9. Pangkat 3 \n"
                + "10. Keluar \n");
        int a = Integer.parseInt(menu);

        if (a == 1) {
            String bil_a = JOptionPane.showInputDialog("Masukkan bilangan pertama");
            int bil1 = Integer.parseInt(bil_a);
            String bil_b = JOptionPane.showInputDialog("Masukkan bilangan kedua");
            int bil2 = Integer.parseInt(bil_b);

            int jumlah = bil1 + bil2;
            JOptionPane.showMessageDialog(null, bil1 + "+" + bil2 + "=" + jumlah);
        }
         if (a == 2) {
            String bil_c = JOptionPane.showInputDialog("Masukkan bilangan pertama");
            int bil1 = Integer.parseInt(bil_c);
            String bil_d = JOptionPane.showInputDialog("Masukkan bilangan kedua");
            int bil2 = Integer.parseInt(bil_d);

            int jumlah = bil1 - bil2;
            JOptionPane.showMessageDialog(null, bil1 + "-" + bil2 + "=" + jumlah);
        }
          if (a == 3) {
            String bil_e = JOptionPane.showInputDialog("Masukkan bilangan pertama");
            int bil1 = Integer.parseInt(bil_e);
            String bil_f = JOptionPane.showInputDialog("Masukkan bilangan kedua");
            int bil2 = Integer.parseInt(bil_f);

            int jumlah = bil1 * bil2;
            JOptionPane.showMessageDialog(null, bil1 + "x" + bil2 + "=" + jumlah);
        }
          if (a == 4) {
            String bil_g = JOptionPane.showInputDialog("Masukkan bilangan pertama");
            int bil1 = Integer.parseInt(bil_g);
            String bil_h = JOptionPane.showInputDialog("Masukkan bilangan kedua");
            int bil2 = Integer.parseInt(bil_h);

            int jumlah = bil1 / bil2;
            JOptionPane.showMessageDialog(null, bil1 + ":" + bil2 + "=" + jumlah);
            
        }
          if (a == 5) {
            String bil_i = JOptionPane.showInputDialog("Masukkan bilangan pertama");
            int bil1 = Integer.parseInt(bil_i);
            String bil_j = JOptionPane.showInputDialog("Masukkan bilangan kedua");
            int bil2 = Integer.parseInt(bil_j);

            int jumlah = bil1 % bil2;
            JOptionPane.showMessageDialog(null, bil1 + "%" + bil2 + "=" + jumlah);
          }
          if (a == 6) {
            String bil_k = JOptionPane.showInputDialog("Masukkan bilangan");
            int bil1 = Integer.parseInt(bil_k);

            double jumlah = Math.sqrt(bil1);
            JOptionPane.showMessageDialog(null, "2√" + bil1 + "=" + jumlah);
          }
          if (a == 7) {
            String bil_l = JOptionPane.showInputDialog("Masukkan bilangan");
            int bil1 = Integer.parseInt(bil_l);

            double jumlah = Math.cbrt(bil1);
            JOptionPane.showMessageDialog(null, "3√" + bil1 + "=" + jumlah);
      }
          if (a == 8) {
            String bil_m = JOptionPane.showInputDialog("Masukkan bilangan");
            int bil1 = Integer.parseInt(bil_m);

            double jumlah = Math.pow(bil1, 2);
            JOptionPane.showMessageDialog(null,bil1 + "^2 =" + jumlah);
          }
          if (a == 9) {
            String bil_n = JOptionPane.showInputDialog("Masukkan bilangan");
            int bil1 = Integer.parseInt(bil_n);

            double jumlah = Math.pow(bil1, 3);
            JOptionPane.showMessageDialog(null,bil1 + "^2 =" + jumlah);
          }    
    }

}
   
