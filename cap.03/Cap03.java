public class Cap03 {
  public static void main(String[] args) {
    
    Valitor<String> validadorCEP = valor -> valor.matches("[0-9]{5}-[0-9]{3}");
    System.out.println(validadorCEP.valida("04101-300"));
  }
}