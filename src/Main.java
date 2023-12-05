

public class Main {
    public static void main(String[] args) {

        Empresa minhaEmpresa = new Empresa("Informatica POO","987654321" );

        Departamento meuDepartamento = new Departamento("Informatica POO", "987654321", "RH");

        Funcionario joao = new Funcionario("Informatica POO",
                "987654321", "TI", 2000,"01/01/2022",
                "Joao");


        meuDepartamento.adicionarFuncionario(joao);


        System.out.println("Antes do aumento:");
        System.out.println(meuDepartamento);

        meuDepartamento.concederAumento(10.0);

        System.out.println("Depois do aumento:");
        System.out.println(meuDepartamento);
    }
}