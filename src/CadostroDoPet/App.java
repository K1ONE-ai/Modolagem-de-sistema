package CadostroDoPet;

import java.util.function.DoubleToIntFunction;

public class App {
    public static void main(String[] args) {

        Responsavel pessoa1 = new Responsavel(
                "Kauan",
                "Victor",
                "05883-260",
                24,
                "550",
                "k1one.g.vitor@gmail.com.br",
                "888-2345");

        Pet animal = new Pet(
                "mel",
                "Canino",
                "Vira-Lata",
                3,
                "Marrom",
                 pessoa1,
                Pet.TiposCuidado.BanhoETosa.toString());

        pessoa1.setNome1("Enzo");
        System.out.println(pessoa1.getNome1());
        System.out.println(pessoa1.retornarTodosDados());


        System.out.println("É maior de idade: " + pessoa1.verificarMaiorDeIdade());
        System.out.println(animal.retornarTodoDadosPet());
        animal.getDono();


    }


}
