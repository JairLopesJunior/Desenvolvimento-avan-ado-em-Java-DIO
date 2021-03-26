package threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FutureExemplo {
	
	private static final ExecutorService pessoasParaExecutarAtividades = Executors.newFixedThreadPool(3);

	public static void main(String[] args) {
		Casa casa = new Casa(new Quarto());
		casa.obterAFazeresDaCasa().forEach(atividade -> pessoasParaExecutarAtividades.submit(() -> atividade.realizar()));
		pessoasParaExecutarAtividades.shutdown();
	}

}

class Casa{
	private List<Comodo> comodos;
	
	Casa(Comodo... comodos){
		this.comodos = Arrays.asList(comodos);
	}
	
	List<Atividade> obterAFazeresDaCasa(){
		return this.comodos.stream().map(Comodo::obterAFazeresDoComodo)
				.reduce(new ArrayList<Atividade>(), (pivo, atividades) -> {
					pivo.addAll(atividades);
					return pivo;
				});
	}
}

interface Atividade{
	void realizar();
}

abstract class Comodo{
	abstract List<Atividade> obterAFazeresDoComodo();
}

class Quarto extends Comodo{
	
	@Override
	List<Atividade> obterAFazeresDoComodo(){
		return Arrays.asList(this::getArrumarACasa, this::varrerOQuarto, this::arrumarGuardaRoupa);
	}
	
	private void arrumarGuardaRoupa() {
		System.out.println("Arrumar o guarda roupa");
	}

	private void varrerOQuarto() {
		System.out.println("Varrer o quarto");
	}

	private void getArrumarACasa() {
		System.out.println("Arrumar a casa");
	}
}

