package biblioteca;


public abstract class Publicacao {

    private String titulo;
    private int totalCopias;
    private int copiasDisponiveis;

    
    
    public Publicacao(String titulo, int totalCopias) {
        this.titulo = titulo;
        this.totalCopias = totalCopias;
        this.copiasDisponiveis = this.totalCopias;
    }

    public Publicacao(){
        this.titulo = "";
        this.totalCopias = 0;
        this.copiasDisponiveis = 0;
    }
    
    public Publicacao(Publicacao publicacao){
        this.titulo = publicacao.titulo;
        this.totalCopias = publicacao.totalCopias;
        this.copiasDisponiveis = publicacao.copiasDisponiveis;
    }
    
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalCopias() {
        return totalCopias;
    }

    public void setTotalCopias(int totalCopias) {
        this.totalCopias = totalCopias;
    }

    public int getCopiasDisponiveis() {
        return copiasDisponiveis;
    }

    public void setCopiasDisponiveis(int copiasDisponiveis) {
        this.copiasDisponiveis = copiasDisponiveis;
    }
    
    
    
    public void imprimir(){
        System.out.println(
                "titulo: " + this.titulo + 
                "\ntotal de copias: " + this.totalCopias + 
                "\ncopias disponiveis: " + this.copiasDisponiveis);
    }

    public boolean disponivel(){
        if(this.copiasDisponiveis < 1){
            return false;
        }
        return true;
    }

    public boolean consulta(){
        if(this.copiasDisponiveis < 1){
            System.out.println("----> nao tem copias disponiveis <----");
            return false;
        }else{
            this.setCopiasDisponiveis(this.copiasDisponiveis - 1);
            return true;
        }
    }

    public boolean retornar(){
        if(this.totalCopias >= this.copiasDisponiveis){
            System.out.println("sem copias emprestadas");
            return false;
        }
        else{
            this.copiasDisponiveis = this.copiasDisponiveis += 1;
            return true;
        }
    }
        
       
        
}
