/* Task 5
5.	Число в пропись
Нужно преобразовать целое число в прописной вариант: 12 – двенадцать.
Программа запускается через вызов главного класса с параметрами.
 */
package academy;

import static academy.InformConstant.*;

public class ConverterNumberToString {

    public static void main(String[] args) {

        do {
            ConsoleIO.printToConsole(startProgram);
            try {
                long data = Long.parseLong(ConsoleIO.enterNumber());
                NumberToString numberToString = new NumberToString(data);
                String numberInWords = numberToString.getNumberToString();
                ConsoleIO.printToConsole(numberInWords);
            } catch (NumberFormatException e) {
                ConsoleIO.printToConsole(informError);
            }
            ConsoleIO.printToConsole(continueProgram);
        } while (ConsoleIO.isContinue());
        ConsoleIO.closeScanner();
    }
}