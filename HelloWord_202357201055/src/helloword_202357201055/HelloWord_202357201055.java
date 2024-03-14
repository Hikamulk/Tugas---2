
package helloword_202357201055;

public class HelloWord_202357201055 {
    public static void main(String[] args) {
        String data[][] = {{"AHMAD", "082145562718", "Jembrana"},
                           {"HIKAM", "085217182836", "Denpassar"},
                           {"KIROM", "\t085241516719", "Tabanan"}};

        // Menampilkan header
        System.out.println("NAMA\tALAMAT\t\tTELEPON");

        // Menampilkan data 
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%s\t%s\t%s\n", data[i][0], data[i][2], data[i][1]);
        }
    }
    }
