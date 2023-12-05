package iniflex;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        FuncionarioManager manager = new FuncionarioManager();


        manager.adicionarFuncionario("Maria", LocalDate.of(2000, 10, 18), new BigDecimal("2009.44"), "Operador");
        manager.adicionarFuncionario("João", LocalDate.of(1990, 5, 12), new BigDecimal("2284.38"), "Operador");
        manager.adicionarFuncionario("Caio", LocalDate.of(1961, 5, 2), new BigDecimal("9836.14"), "Coordenador");
        manager.adicionarFuncionario("Miguel", LocalDate.of(1990, 10, 14), new BigDecimal("19119.88"), "Diretor");
        manager.adicionarFuncionario("Alice", LocalDate.of(2000, 1, 5), new BigDecimal("2234.68"), "Recepcionista");
        manager.adicionarFuncionario("Heitor", LocalDate.of(1990, 11, 19), new BigDecimal("1582.72"), "Operador");
        manager.adicionarFuncionario("Arthur", LocalDate.of(2000, 3, 31), new BigDecimal("4071.4"), "Contador");
        manager.adicionarFuncionario("Laura", LocalDate.of(1990, 7, 2), new BigDecimal("3017.45"), "Gerente");
        manager.adicionarFuncionario("Heloísa", LocalDate.of(2000, 5, 24), new BigDecimal("1606.85"), "Eletricista");
        manager.adicionarFuncionario("Helena", LocalDate.of(1990, 9, 2), new BigDecimal("2799.93"), "Gerente");

        // Mostrar todos os funcionários
        manager.mostrarFuncionarios();

        // Remover João
        manager.removerFuncionario("João");

        // Mostrar novamente após remover João
        manager.mostrarFuncionarios();
        
        // Aumentar salário de todos em 10%
        manager.aumentarSalarioTodos();

        // Mostrar novamente após aumentar os salários
        manager.mostrarFuncionarios();
        
        // Agrupar por função e mostrar os funcionários por função
        manager.mostrarFuncionariosAgrupadosPorFuncao();
        
        // Mostrar aniversariantes dos meses 10 e 12
        manager.mostrarAniversariantesMeses1012();
        
        // Mostrar funcionário mais velho
        manager.mostrarFuncionarioMaiorIdade();
        
    	// Mostrar funcionários em ordem alfabética
        manager.mostrarFuncionariosOrdemAlfabetica();
        
        // Mostrar total dos salários
        manager.mostrarTotalSalarios();
        
        // Mostrar salários em salários mínimos
        manager.mostrarSalariosMinimos();
        
    }
}
