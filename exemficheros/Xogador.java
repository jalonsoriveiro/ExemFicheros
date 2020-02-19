package exemficheros;
/**
 *
 * @author jalonsoriveiro
 */
public class Xogador implements Comparable {
    
    public String nome;
    int dorsal;

    public Xogador(String nome, int dorsal) {
        this.nome = nome;
        this.dorsal = dorsal;
    }

    public Xogador() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    @Override
    public String toString() {
        return "Xogador{" + "nome=" + nome + ", dorsal=" + dorsal + '}';
    }

    @Override
    /*public int compareTo(Object o) {
         Xogador x = (Xogador) o;
         
         if(this.dorsal<x.dorsal)
             return -1;
         else if(this.dorsal>x.dorsal)
            return +1;
         else
             return 0;
    }*/
    
    public int compareTo(Object o) {
         Xogador x = (Xogador) o;                  
         if(this.nome.compareToIgnoreCase(x.nome)>0)    
             return 1;
         if(this.nome.compareToIgnoreCase(x.nome)<0)    
            return -1;
         else
             return 0;
    }

    private boolean compareToIgnorecase(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
