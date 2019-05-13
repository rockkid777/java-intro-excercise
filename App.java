public class App {
  public static void main(String[] argsv) {
    double a = 2;
    double b = 4;

    BinaryOperation[] operations = {
      new Add(),
      new Multiply(),
      new Powers()
    };

    if (operations[0].op(a, b) == 6.0
      && operations[1].op(a, b) == 8.0
      && operations[2].op(a, b) == 16.0) {
      System.out.println("Ok.");
    } else {
      System.out.println("Not ok.");
    }
  }
}
