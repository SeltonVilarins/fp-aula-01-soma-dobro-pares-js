package imutabilidade;

public class ImutabilidadeDemo {
    public static void main(String[] args) {

        Cidade c1 = new Cidade("Palmas");
        Pessoa p1 = new Pessoa("Manoel", c1);
        System.out.println("Antes da alteração: " + p1);

        c1.setNome("Paraíso");
        System.out.println("Depois da alteração: " + p1);


        var cidadeRecord = new CidadeRecord("Palmas");
        var pessoaRecord = new PessoaRecord("Selton", cidadeRecord);
        System.out.println("\nRecord: " + pessoaRecord);


        System.out.println("Imutabilidade total garantida com records!");
    }
}
