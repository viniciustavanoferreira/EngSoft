package model;

//Sessão de importação.
import java.util.Objects;

/**
 * Classe que define o modelo ~ Recurso.
 * @author Vinicius Tavano Ferreira
 * @since Classe criada em 14/09/2017
 */
public class Recurso {

    private Integer codigo;
    private String nome;
    private String endereco;
    private String cidade;
    private String estado;
    private String sexo;
    private Cargo cargo;

    public Recurso() {
    }

    public Recurso(Integer codigo, String nome, String endereco, 
            String cidade, String estado, String sexo, Cargo tipo) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.sexo = sexo;
        this.cargo = tipo;
    }

    public Recurso(String funcionario) {
        this.nome = funcionario;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }
    
    public String getCidadeAsString() {
        if (this.cidade != null) {
            return this.cidade;
        }
        return null;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    private String getCargoAsString() {
        return this.cargo != null ? this.cargo.getNome() : "";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Recurso other = (Recurso) obj;
        return Objects.equals(this.nome, other.nome);
    }
    

     @Override
    public String toString() {
        return "Funcionario{" + "codigo=" + codigo + ", nome=" + nome +
                ", endereco=" + endereco + ", cidade=" + cidade +
                ", estado=" + estado + ", sexo=" + sexo + ", cargo=" + cargo + '}';
    }

    public Object[] getValueAsObject() {
        return new String[]{this.codigo.toString(), this.nome, this.endereco, this.cidade,
                            this.estado, this.sexo, this.getCargoAsString()};
    }
}
