package ControleGeral;

public class Hora {
	private int hora, minutos, segundos;

	public Hora(int hora, int minutos, int segundos) {
		if (hora >= 0 && hora < 24)
			this.hora = hora;
		else
			throw new IllegalArgumentException("Hora inv�lida");

		if (minutos >= 0 && minutos < 60)
			this.minutos = minutos;
		else
			throw new IllegalArgumentException("Minutos inv�lidos");

		if (segundos >= 0 && segundos < 60)
			this.segundos = segundos;
		else
			throw new IllegalArgumentException("Segundos inv�lidos");
	}

	@Override
	public String toString() {
		return String.format("%d:%d:%d", MeRetorneAHoraDeChegada(), MeRetorneOMinutoDeChegada(),
				MeRetorneOSegundoDeChegada());
	}

	public int MeRetorneAHoraDeChegada() {
		return this.hora;
	}

	public int MeRetorneOMinutoDeChegada() {
		return this.minutos;
	}

	public int MeRetorneOSegundoDeChegada() {
		return this.segundos;
	}
}