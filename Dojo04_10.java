public class Dojo04_10{
    public static void main(String[] args) {
        Pessoa p=new Pessoa();

        p.setNome("Renata");
        p.setSobrenome("Coraiola");
        p.setIdade(19);
        p.setCpf("06447412900");

        System.out.println("Nome: "+p.getNome());
        System.out.println("Sobrenome: "+p.getSobrenome());
        System.out.println("Idade: "+p.getIdade());
        System.out.println("CPF: "+p.getCpf());
    }
}
