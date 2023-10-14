package geometry;

//@author gabrielrossi
public class Geometry {

    public static void main(String[] args) {
        
        //instancia pontos
        Ponto ponto1 = new Ponto(1.0, 1.0);
        Ponto ponto2 = new Ponto(3.0, 3.0);
        
        //instancia circulo 
        Circulo circulo1 = new Circulo(1.0, 2.0, 2.0);
        
        //instancia segmento
        Segmento segmento = new Segmento(
                ponto1.getX(),
                ponto1.getY(),
                ponto2.getX(),
                ponto2.getY()
        );
        
        

        
        //pegando distancia entre 2 pontos
        Double distancePoints = ponto1.getDistance(ponto2.getX(), ponto2.getY());
        
        //criando midPoint
        Ponto midPoint = segmento.midPoint(segmento);
        
        //pegando string segmento
        String segmentoString = segmento.toString();

        
        
        
        //all print
        System.out.println(
                "\n ponto1: " + ponto1.toString() +
                "\n ponto2: " + ponto2.toString() + 
                "\n distancia: " + distancePoints + "\n" +
                "\n segmento: " + segmentoString + "\n" +
                "\n midPoint:\n x: " + midPoint.getX() + "  y: " + midPoint.getY() + "\n" +   
                "\n circluo: \n" + circulo1.toString() +
                "\n perimetro: " + circulo1.Perimetro() +
                "\n area: " + circulo1.area() +
                        
                        
                //
                "\n\n\n"
        ); 
    }
}