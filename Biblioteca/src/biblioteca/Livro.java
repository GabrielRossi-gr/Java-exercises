
package biblioteca;

public class Livro extends Publicacao{
    
    private String nomeAutor;

    
    public Livro(String titulo, int totalCopias, String nomeAutor) {
        super(titulo, totalCopias);
        this.nomeAutor = nomeAutor;
    }

    public Livro() {
    }

    public Livro(Publicacao publicacao) {
        super(publicacao);
    }

    
    
    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    
    
    public abstract boolean emprestar();
    
    public boolean devolver(){
        if(super.getCopiasDisponiveis() >= super.getTotalCopias()){
            System.out.println("nao tem copias para devolver");
            return false;
        }else{
            super.setCopiasDisponiveis(super.getCopiasDisponiveis() + 1);
            return true;
        }
        
    }
}
