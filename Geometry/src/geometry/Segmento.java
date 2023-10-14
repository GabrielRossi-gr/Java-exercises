package geometry;


// @author gabrielrossi

public class Segmento {
 
    private Double x1, y1;
    private Double x2, y2;
    
    
    
    
    public Segmento(){
        this.x1 = 0.0;
        this.y1 = 0.0;
                
        this.x2 = 0.0;
        this.y2 = 1.0;
    }

    public Segmento(Double x1, Double y1, Double x2, Double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    public void assign(Segmento sg){
        this.x1 = sg.x1;
        this.y1 = sg.y1;
        this.x2 = sg.x2;
        this.y2 = sg.y2;

    }
    
    
    
      
    public void desloc(Double newX1, Double newY1, Double newX2, Double newY2){
        this.x1 = newX1;
        this.y1 = newY1;
        this.x2 = newY2;
        this.y2 = newY2;
    }
    
    public void scale(Double scale){
        this.x1 *= scale;
        this.y1 *= scale;
        this.x2 *= scale;
        this.y2 *= scale;
    }
    
    public String toString(){
        return "\n [(x1: " + this.x1 + " , y1: " + this.y1 + 
                ") , (x2: " + this.x2 + " , y2: " + this.y2 + ")]";
    }
            
    public Double lenght(Segmento sg){
        //validar se a distancia ficou negativa
        Double cateto1 = (sg.x1 - sg.x2 < 0) ? (sg.x1 - sg.x2)* -1 : sg.x1 - sg.x2;  
        Double cateto2 = (sg.y1 - sg.y2 < 0) ? (sg.y1 - sg.y2)* -1 : sg.y1 - sg.y2;
        
        return Math.sqrt( ((cateto1 * cateto1) + (cateto2 * cateto2)) );
    }
            
    public boolean isValid(Segmento sg){
        boolean valid = false;
        valid = (sg.x1 != sg.x2);
        valid = (sg.y1 != sg.y2);
        
        return valid;
    }
    
    public Ponto midPoint(Segmento sg){
        //valida se a distancia entre os 2 pontos nao é negativa
        Double px = (sg.x1 - sg.x2 < 0) ? (sg.x1 - sg.x2)* -1 : sg.x1 - sg.x2;
        Double py = (sg.y1 - sg.y2 < 0) ? (sg.y1 - sg.y2)* -1 : sg.y1 - sg.y2;
        
        Ponto ponto = new Ponto(px, py);
        
        return ponto;
    }
            
            
            
    
}
