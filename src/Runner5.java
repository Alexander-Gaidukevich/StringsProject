/*«Паша съел банан и Поправился на 20 грамм».
Привести к верхнему регистру последнюю букву каждого слова, а первую букву каждого слова – к нижнему регистру.
 */
public class Runner5 {
    public static void main(String[] args) {

        String str = "Паша съел банан апп Поправился на 20 грамм";

        String[] arrayStr = str.split(" ");//"\n"
        String[] newArray = new String[arrayStr.length];

        for (int i = 0; i < arrayStr.length; i++) { //цикл по каждому слову
            char[] word = arrayStr[i].toCharArray(); //преобразуем каждое словао в массив символов, чтобы мы могли изменить его элементы(в типе String изменять не можем, String - immutable)

            String symbol = String.valueOf(word[0]).toLowerCase(); //взяли первый символ из каждого слова и привели к строке, чтобы вызвать метод преобразования к нижнему регистру
            char[] w = symbol.toCharArray(); //gперевод в массив символов

            String lastSymbol = String.valueOf(word[word.length - 1]).toUpperCase();//взяли последнюю букву и преобразовали к верхнему регистру
            char[] lw = lastSymbol.toCharArray();//последняя буква - нулевой элемент массива

            word[0] = w[0];
            word[word.length - 1] = lw[0];

            for (int k = 0; k < newArray.length; k++) {
                newArray[k] = String.valueOf(word);
            }
            System.out.println(newArray[i]);
        }

        String[] vovels = {"a", "о"};


    }
}
