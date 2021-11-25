public class App {
   public static void main(String [] args) {
      Printer printer = new Printer();
      ColorPrinter colorPrinter = new ColorPrinter();
      BlackWhitePrinter blackWhitePrinter = new BlackWhitePrinter();

      // function overriding
      // colorPrinter and blackWhitePrinter override the parent printing method in Printer. This allows both to print different phrase respectively.
      printer.printing();
      colorPrinter.printing();
      blackWhitePrinter.printing();

      // colorPrinter overload the method usingPaper(), allowing the same method to take different combination of parameter, printing different paper details.
      // function overloading
      colorPrinter.usingPaper(); // take no param
      colorPrinter.usingPaper("paid paper"); // take string as param
      colorPrinter.usingPaper("expensive paper", 1000); // take string and int as param
   }
}