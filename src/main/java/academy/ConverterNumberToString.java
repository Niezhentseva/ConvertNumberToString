/* 5.	Число в пропись
Нужно преобразовать целое число в прописной вариант: 12 – двенадцать.
Программа запускается через вызов главного класса с параметрами.
 */
package academy;

public class ConverterNumberToString {
    private final static String START_PROGRAM = "Enter a number from " +
            "-999 999 999 999 to 999 999 999 999 without whitespaces";
    private final static String CONTINUE_PROGRAM = "Do you want to continue? (y/yes or n/no)";
    private final static String INFORM_INVALID = "Invalid input number.  Enter a number from " +
            "-999 999 999 999 to 999 999 999 999 without whitespaces";

    public static void main(String[] args) {
        do {
            ConsoleIO.printToConsole(START_PROGRAM);
            try {
               long data = Long.parseLong(ConsoleIO.enterNumber());
                NumberToString numberToString = new NumberToString(data);
                String numberInWords = numberToString.getNumberToString();
                ConsoleIO.printToConsole(numberInWords);
            } catch (NumberFormatException e) {
                ConsoleIO.printToConsole(INFORM_INVALID);
            }
            ConsoleIO.printToConsole(CONTINUE_PROGRAM);
        } while (ConsoleIO.isContinue());
        ConsoleIO.closeScanner();
    }
}