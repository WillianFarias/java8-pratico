import java.util.List;
import java.util.Arrays;

public class Capitulo02 {
  public static void main(String ... args) {
    Usuario user1 = new Usuario("Willian Farias", 150);
    Usuario user2 = new Usuario("Samanta Farias", 120);
    Usuario user3 = new Usuario("Amanda Alvez", 190);

    //Forma de criar uma lista imutavel
    List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

    for(Usuario u : usuarios){
      System.out.println(u.getNome());
    }
  }
}