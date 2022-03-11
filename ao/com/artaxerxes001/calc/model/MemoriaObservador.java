package ao.com.artaxerxes001.calc.model;

@FunctionalInterface
public interface MemoriaObservador {
    public void valorAlterado(String novoValor);
}
