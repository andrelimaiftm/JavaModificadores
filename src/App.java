import java.util.GregorianCalendar;

import br.edu.iftm.modificadores.classes.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa("André",new GregorianCalendar(1986, 3, 27, 12, 0, 0));
        //pessoa.nome = "André";
        //pessoa.idade = 35;        
        //System.out.println(pessoa.author);
        System.out.println(Pessoa.author);
        //System.out.println(pessoa.mostrarNome());
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.mostrarIdade());
        //pessoa.setNome("João Pedro");
        System.out.println(pessoa.getNome());
    }
}
