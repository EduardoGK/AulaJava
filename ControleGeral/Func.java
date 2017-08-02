package ControleGeral;

public class Func {
	private String nome;
	private boolean atraso;
	private double tempoTrabalhado, tempoAtraso;

	public Func(String nome, Hora horaChegada, Hora horaSaida) {
		this.nome = nome;
		this.tempoAtraso = tempoAtraso(horaChegada);

		if (this.tempoAtraso > 0)
			this.atraso = true;

		if (atraso) {
			System.out.println("Funcionário '" + this.nome + "' atrasado. ");
		}

		this.tempoTrabalhado = horasTrabalhadas(horaChegada, horaSaida);
	}

	public double tempoAtraso(Hora horaChegada) {
		return ((horaChegada.MeRetorneAHoraDeChegada() * 60 * 60 + horaChegada.MeRetorneOMinutoDeChegada() * 60
				+ horaChegada.MeRetorneOSegundoDeChegada()) - 8 * 3600.0) / 3600.0;
	}

	public double horasTrabalhadas(Hora horaChegada, Hora horaSaida) {
		double horas = ((horaSaida.MeRetorneAHoraDeChegada() * 60 + horaSaida.MeRetorneOMinutoDeChegada())
				- (horaChegada.MeRetorneAHoraDeChegada() * 60 + horaChegada.MeRetorneOMinutoDeChegada())) / 60.0;

		if (horas < 0)
			throw new IllegalArgumentException("Hora de saída anterior a hora de chegada");

		return horas;
	}

	public double getHorasTrabalhadas() {
		return this.tempoTrabalhado;
	}
}	