package br.edu.unifei.ecot12.thor;
import java.util.ArrayList;
import java.util.List;
public class Ser {
    private String nome;
    private boolean vivo;
    private String moradia;
    private java.util.List<Artefato> artefatos = new ArrayList<Artefato>();
    private List<Ser> filhos = new ArrayList<Ser>();
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public boolean isVivo() {
        return vivo;
    }
    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
    public String getMoradia() {
        return moradia;
    }
    public void setMoradia(String moradia) {
        this.moradia = moradia;
    }
    public java.util.List<Artefato> getArtefatos() {
        return artefatos;
    }
    public void setArtefatos(java.util.List<Artefato> artefatos) {
        this.artefatos = artefatos;
    }
    public List<Ser> getFilhos() {
        return filhos;
    }
    public void setFilhos(List<Ser> filhos) {
        this.filhos = filhos;
    }
  
}
