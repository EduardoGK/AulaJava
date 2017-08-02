package ControleGeral;

public class ControlaHoras {
	public static void main(String[] args) {
        
		Hora horaChegada = new Hora(8, 0, 0);
        Hora horaSaida = new Hora(9, 30, 0);
        Func funcionario = new Func("Klein", horaChegada, horaSaida);
        
        System.out.println("Hora de chegada: " + horaChegada);
        System.out.println("Hora de saída: " + horaSaida);
        System.out.printf("Horas trabalhadas: %.1f\n",funcionario.getHorasTrabalhadas());        
    }
}