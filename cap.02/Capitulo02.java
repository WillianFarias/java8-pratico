import java.util.List;
import java.util.Arrays;
//import java.util.function.Consumer;

public class Capitulo02 {
  public static void main(String ... args) {
    Usuario user1 = new Usuario("Willian Farias", 150);
    Usuario user2 = new Usuario("Samanta Farias", 120);
    Usuario user3 = new Usuario("Amanda Alvez", 190);

    //Forma de criar uma lista imutavel
    List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

    //Utilizando lambda
    usuarios.forEach( u -> System.out.println(u.getNome()) );
    usuarios.forEach( u -> u.tornaModerador() );

    /* Fazendo a mesma coisa sem o uso de lambda
    for(Usuario u : usuarios){
      System.out.println(u.getNome());
    }

    Mostrador mostrador = new Mostrador();
    usuarios.forEach(mostrador);

    //irar gerar uma classe anonima
    Consumer<Usuario> mostrador = new Consumer<Usuario>() {
      public void accept(Usuario u){
        System.out.println(u.getNome());
      }
    };

    usuarios.forEach(mostrador);
    refatoracao deste código abaixo
    
    usuarios.forEach(new Consumer<Usuario>() {
      public void accept(Usuario u) {
        System.out.println(u.getNome());
      }
    });
    */  

  }
}