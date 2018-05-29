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
    private String role;

    public User(){
        
    }
    
    public User (String codUser, String codPassword, String descName, String role){
        this.codUser = codUser;
        this.codPassword = codPassword;
        this.descName = descName;
        this.role = role;
    }
    
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

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
    
    public Object[] getValueAsObject() {
        return new String[]{this.codUser, this.role, this.descName};
    }    
}
