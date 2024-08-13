public class SemiCirculo extends FormaGeometrica{

    private final Ponto centro;
    private final double raio;

    public SemiCirculo(Ponto centro,double raio){
        this.centro = centro;
        this.raio = raio;
    }

    public double largura(){
        return raio*2;
    }

    double altura() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    double area() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    double perimetro() {
        // TODO Auto-generated method stub
        return 0;
    }

    

}
