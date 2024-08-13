public abstract class Poligono extends FormaGeometrica{
    protected final Ponto[] pontos;

    public Poligono(Ponto[] pontos){
        this.pontos = pontos;
    }

    public Ponto[] getPontos() {
        return pontos;
    }
    
}
