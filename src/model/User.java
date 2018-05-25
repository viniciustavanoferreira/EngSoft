package model;

/**
 * Classe que define os estados e comportamentos referentes ao Usuário.
 * @author Vinicius Tavano Ferreira
 * @since Classe criada em 20/08/2017
 */
public class User {
    
    private String codUser;
    private String codPassword;
    private String descName;

    public String getCodUser() {
        return codUser;
    }

    public void setCodUser(String codUser) {
        this.codUser = codUser;
    }

    public String getCodPassword() {
        return codPassword;
    }

    public void setCodPassword(String codPassword) {
        this.codPassword = codPassword;
    }

    public String getDescName() {
        return descName;
    }

    public void setDescName(String descName) {
        this.descName = descName;
    }  
            
}
