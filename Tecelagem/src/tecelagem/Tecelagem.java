
package tecelagem;

public class Tecelagem {

    public static void main(String[] args) {

        Adiministrativo adm = new Adiministrativo("Junin", "123321", 0, 30.0);
        Producao produtor = new Producao("Clebin", "44444", 10, 20, 10.0);
        Vendedor vendedor = new Vendedor("Fabin", "342111", 0.0, 1000.0);
        
        
        
//        adm.registrarFalta(); 
//        adm.hollerith();

//        produtor.setHorasDiurnas(20);
//        produtor.registrarHorasDiurnas(10);
//        produtor.hollerith();
        vendedor.registrarVenda(30.0);
        vendedor.registrarVenda(30.0);

        vendedor.hollerith();
        
        
    }   
    
}
