import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Colaborador> colaboradores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            try {
                System.out.println("Digite o nome do colaborador:");
                String nome = scanner.nextLine();
                if (nome.isBlank()) {
                    throw new Exception("Nome não pode ser vazio");
                }

                System.out.println("Digite o CPF do colaborador:");
                String cpf = scanner.nextLine();
                if (cpf.isBlank()) {
                    throw new Exception("CPF não pode ser vazio");
                }

                System.out.println("Digite o telefone do colaborador:");
                String telefone = scanner.nextLine();
                if (telefone.isBlank()) {
                    throw new Exception("Telefone não pode ser vazio");
                }

                System.out.println("Digite a data de nascimento do colaborador:");
                String dataNascimento = scanner.nextLine();
                if (dataNascimento.isBlank()) {
                    throw new Exception("Data de nascimento não pode ser vazia");
                }

                System.out.println("Digite a data de agendamento do colaborador:");
                String dataAgendamento = scanner.nextLine();
                if (dataAgendamento.isBlank()) {
                    throw new Exception("Data de agendamento não pode ser vazia");
                }

                System.out.println("Digite o período de trabalho do colaborador (manhã, tarde ou noite):");
                String periodo = scanner.nextLine();
                if (periodo.isBlank()) {
                    throw new Exception("Período não pode ser vazio");
                }

                Colaborador colaborador = new Colaborador(nome, cpf, telefone, dataNascimento, dataAgendamento, periodo);
                colaboradores.add(colaborador);
            } catch (Exception e) {
                System.out.println("Erro ao cadastrar colaborador: " + e.getMessage());
                i--;
            }
        }

        System.out.println("Lista de colaboradores cadastrados:");
        for (Colaborador colaborador : colaboradores) {
            System.out.println("Nome: " + colaborador.getNome());
            System.out.println("CPF: " + colaborador.getCpf());
            System.out.println("Telefone: " + colaborador.getTelefone());
            System.out.println("Data de nascimento: " + colaborador.getDataNascimento());
            System.out.println("Data de agendamento: " + colaborador.getDataAgendamento());
            System.out.println("Período: " + colaborador.getPeriodo());
            System.out.println("---------------------------------------");
        }
    }
}
