/**
 * Дана строка: «СегоДНЯ ОченЬ ХороШАя ПоГоДа» Привести строку к нижнему регистру и верхнему регистру.
 */
public class Runner2 {
    public static void main(String[] args) {
        String str = "СегоДНЯ ОченЬ ХороШАя ПоГоДа";
        String[] array = str.split(" ");

        for (int i = 0; i < array.length; i += 1) {
            System.out.print(array[i].toLowerCase() + " ");
        }
        System.out.println("");

        for (int i = 0; i< array.length; i+=1){
            System.out.print(array[i].toUpperCase() + " ");
        }
    }
}
