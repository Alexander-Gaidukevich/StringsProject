/* «      Привет. Как дела?           ». Очистить в строке пробелы вначале и в конце.
 Разбить строку по пробелам на массив. Вывести массив и его длину.
 */

public class Runner4 {
    public static void main(String[] args) {
        String str = new String("      Привет. Как дела?           ");

        System.out.print("-=");
        System.out.print(str.trim());
        System.out.print("=-");
    }
}
