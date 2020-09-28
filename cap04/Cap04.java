import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class Cap04 {
  public static void main(String[] args) {
    
  Usuario user1 = new Usuario("Paulo Silveira", 150);
  Usuario user2 = new Usuario("Rodrigo Turini", 120);
  Usuario user3 = new Usuario("Guilherme Silveira", 190);

  List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
    
  Consumer<Usuario> mostraMensagem = u -> System.out.println("antes de imprimir os nomes");

  Consumer<Usuario> imprimeNome = u -> System.out.println(u.getNome());

  usuarios.forEach(mostraMensagem.andThen(imprimeNome));

  List<Usuario> usuariosList = new ArrayList<>();
  usuariosList.add(user1);
  usuariosList.add(user2);
  usuariosList.add(user3);

  //removeIf não aceita colecoes imutaveis por isso a criacao de uma ArrayList ao
  //inves de usar o asList
  usuariosList.removeIf(u -> u.getPontos() > 160);
  usuariosList.forEach(u -> System.out.println(u.getPontos()));

  }
}