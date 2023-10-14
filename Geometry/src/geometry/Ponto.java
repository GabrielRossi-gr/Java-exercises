
package geometry;

 // @author gabrielrossi
 
public class Ponto {
 
    private Double x;
    private Double y;
    
    
    
    //construtor padrao (sem parametros)
    public Ponto(){
        this.x = 0.0;
        this.y = 0.0;
    }
    
    //construtor parametrizado (com parametros obrigatorios)
    public Ponto(Double x, Double y){
        this.x = x;
        this.y = y;
    }
    
    //construtor de copia 
    public Ponto(Ponto ponto){
        x = ponto.x;
        y = ponto.y;
    }
    
    
    
    
    //print X Y 
    public String printXY(){
        String mesage = "x: " + this.x + "  y: " + this.y ;
        return mesage;
    }
    
    //set X e Y 
    void setXY(Double newX, Double newY){
        this.x = newX;
        this.y = newY;   
    }
    
    //get x
    public Double getX(){
        return this.x;
    }
   
    //get y
    public Double getY(){
        return this.y;
    }
    
    //set new x
    public void setX(Double newX){
        this.x = newX;
    }
   
    //set new y
    public void setY(Double newY){
        this.x = newY;
    }
    
    //copia os atributos para a classe 
    void assign(Ponto pt){
        this.x = pt.x;
        this.y = pt.y;
    }
    
    //get delta x
    public Double deltaX(Double vX){
        return vX - this.x;
    }
    
    //get delta y
    public Double deltaY(Double vY){
        return vY - this.x;
    }
    
   //get distance 
   public Double getDistance(Double posX, Double posY){
     
       Double cateto1 = deltaX(posX);
       Double cateto2 = deltaY(posY);
       return Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
   }
   
   //get distance 
   public Double getDistance(Ponto pt){
       Double x = this.deltaX(pt.x);
       Double y = this.deltaY(pt.y);
       
       return Math.sqrt(x * x + y * y);  
   } 
   
   //get distante 
   public Double getDistance(){
       Double x = this.deltaX(0.0);
       Double y =  this.deltaY(0.0);
       
       return Math.sqrt(x * x + y * y);
   }
    
    //seta nova cordenada para o ponto
    public void descolc(Double X , Double Y){
        this.x += X;
        this.y += Y;
    }
    
    //scale
    public void escale(Double factor){
        this.x *= factor;
        this.y *= factor;
    }
    
    //return point cordinate string 
    public String toString(){
        String pointString = "(x:" + this.x + " , y:" + this.y + ")";
        return pointString;
    }
    
   
    
}//clas ponto
