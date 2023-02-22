public class Main {
    public static void main(String[] args) {
        String[] namn = {"Elena Gilbert", "Stefan Salvatore", "Damon Salvatore", "Caroline Forbes", "Bonnie Bennett", "Tyler Lockwood", "Matt Donovan", "Alaric Saltzman", "Klaus Mikaelson", "Rebekah Mikaelson"};
        int[] ålder = {17, 162, 177, 17, 17, 22, 19, 41, 1000, 1012};

        //Skriv ut alla personer som är under 20 år.
        System.out.println("alla personer som är under 20 år.");
        int j = 0;
        while (j < ålder.length) {
            if (ålder[j] < 20)
                System.out.println(namn[j] + " ==> " + ålder[j] + " år.");
            j++;
        }
        //------------------------------------------------------------------------------
        //Skriv ut alla personer som är 20 år och alla som är under 30 år.
        System.out.println("_______________________________________");
        System.out.println("Personer mellan 20 och 29 år:");
        for (int i = 0; i < namn.length; i++) {
            if (ålder[i] >= 20 && ålder[i] < 30)
                System.out.println(namn[i] + " ==> " + ålder[i] + " år.");
        }
        System.out.println("_______________________________________");
        //------------------------------------------------------------------------------
        //Skriv ut alla personer som är yngre än 20 år och alla som är äldre än 29 år.
        System.out.println("Alla personer som är yngre än 20 år: ");
        for (int i = 0; i < namn.length; i++) {
            if (ålder[i] < 20)
                System.out.println(namn[i] + " ==> " + ålder[i]+ " år.");
        }
        System.out.println("´´´´´´´´´´´´´´´´´´");
        System.out.println("Alla personer som är äldre än 29 år:");
                for (int i =0 ; i < namn.length;i++){
                    if (ålder[i] >= 30) {
                System.out.println( namn[i]+ " ==> " + ålder[i] + " år.");
            }
        }
        //------------------------------------------------------------------------------
        //4. Visa namn och ålder på äldsta och yngsta karaktären (1 av varje)
        System.out.println("_______________________________________");
        int yngsta = ålder[0];
        int äldsta = ålder[0];
        String yngstaNamn = namn[0];
        String äldstaNamn = namn[0];
        for (int i = 0; i < namn.length; i++) {
            if (ålder[i] < yngsta) {
                yngsta = ålder[i];
                yngstaNamn = namn[i];
            }
            if (ålder[i] > äldsta) {
                äldsta = ålder[i];
                äldstaNamn = namn[i];
            }
        }
        System.out.println("Yngsta person är : " + yngstaNamn + " ==> " + yngsta + " år.");
        System.out.println("Äldsta person är : " + äldstaNamn + " ==> " + äldsta + " år.");
        System.out.println("---------------------------------------");
        //-----------------------------------------------------------
        // Visa en lista på alla personer som har jämna tal i sin ålder.
        System.out.println("En lista på alla personer som har jämna tal i sin ålder:");
        for (int i =0; i < ålder.length; i++){
            if (ålder[i] % 2 == 0)
                System.out.println(namn[i] + " ==> " + ålder[i] + " år. ");
        }
        System.out.println("----------------------------------------");
        //---------------------------------------------------------
        //Visa alla namn men stoppa körningen vid första person över 40 år.
        System.out.println("Personer under 40 år: ");
        int stoppa =0;
       while (stoppa < ålder.length){
           if (ålder[stoppa] < 40) {
               System.out.println(namn[stoppa] + " ==> " + ålder[stoppa] + " år.");
               break;
           }
           stoppa++;
       }
        }
    }


