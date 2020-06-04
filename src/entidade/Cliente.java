
package entidade;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Cliente {
     private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private String name;
    private String email;
    private Date dataDeNascimento;
    
    public Cliente(){
    }

    public Cliente(String name, String email, Date dataDeNascimento) {
        this.name = name;
        this.email = email;
        this.dataDeNascimento = dataDeNascimento;
    }

  

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }
    @Override
	public String toString() {
		return name + " (" + sdf.format(dataDeNascimento) + ") - " + email;
 	}
    
}
