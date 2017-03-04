/* Разбить данное предложение на массив по пробелам: «Василий съел мороженое и поправился на 20 грамм».
Элементы массива на нечетных местах привести в верхнему регистру.*/

public class Runner1 {
    public static void main(String[] args) {
        String str = "Василий-НЧ съел-Ч мороженое-НЧ и-Ч поправился-НЧ на-Ч 20гр-НЧ грамм-Ч";
        String[] array = str.split(" ");
        for (String stroka : array) {
        }
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print(array[i].toUpperCase() + " ");
            }
            if (i % 2 == 0 && i != 0) {
                System.out.print(array[i].toUpperCase() + " ");
            } else if (i != 0) {
                System.out.print(array[i] + " ");

            }
        }
    }
}
