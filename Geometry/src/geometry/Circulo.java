package geometry;

// @author gabrielrossi

public class Circulo extends Ponto {
    final double pi = 3.141592653589;
    
    
    Ponto centro = new Ponto();
    
    private Double raio;
    
    
    public Circulo(){
        this.raio = 0.0;
        this.centro = new Ponto(0.0, 0.0);
    }

    public Circulo(Double raio, Double cordX, Double cordY){
        this.raio = raio;
        this.centro = new Ponto(cordX, cordY);
    }
    
    public Circulo(Double raio, Ponto ponto){
        this.raio = raio;
        this.centro = new Ponto(ponto.getX(), ponto.getY());
    }
    
    
    
    
    public void assign(Circulo cl){
        this.centro = cl.centro;
        this.raio = cl.raio;
    }
    
    public void scale(Double factor){
        this.raio *= factor;
    }
    
    public String toString(){
        return " x: " + this.centro.getX() + " y: " + this.centro.getY() + " raio: " + this.raio;
    }
    
    public boolean isValid(){
        return (raio > 0);
    }
    
    public Double Perimetro(){
        return 2 * this.pi * this.raio;
    }
    
    public Double area(){
        return this.pi * Math.sqrt(this.raio);
    }
    
    
    
    
    
}
