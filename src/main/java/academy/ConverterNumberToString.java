/* 5.	Число в пропись
Нужно преобразовать целое число в прописной вариант: 12 – двенадцать.
Программа запускается через вызов главного класса с параметрами.
 */
package academy;

import static academy.InformConstant.*;

public class ConverterNumberToString {

    public static void main(String[] args) {
        do {
            ConsoleIO.printToConsole(START_PROGRAM);
            long data = 0;
            try {
                data = Long.parseLong(ConsoleIO.enterNumber());
            } catch (NumberFormatException e) {
                ConsoleIO.printToConsole(INFORM_INVALID);
            }
            NumberToString numberToString = new NumberToString(data);
            String numberInWords = numberToString.getNumberToString();
            ConsoleIO.printToConsole(numberInWords);
            ConsoleIO.printToConsole(CONTINUE_PROGRAM);
        } while (ConsoleIO.isContinue());
        ConsoleIO.closeScanner();
    }
}