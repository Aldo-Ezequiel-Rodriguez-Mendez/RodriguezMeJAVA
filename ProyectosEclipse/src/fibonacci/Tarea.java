
class Aldo {
    public static void main(String args[]) {
      int intValor1 = 0, intValor2 = 1, intValor3, x = 0;  
        
      System.out.println(intValor1 + "\n");
      System.out.println(intValor2 + "\n");

      do
      {
        x = x + 1;
        intValor3 = intValor1 + intValor2;

        System.out.println(intValor3 + "\n");

        intValor1 = intValor2;
        intValor2 = intValor3;
      }
      while(x <= 5);
    }
}