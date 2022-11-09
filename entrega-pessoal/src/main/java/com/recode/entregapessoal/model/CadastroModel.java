import java.util.Date;

public class CadastroModel{

    public CadastroModel(String txtNome, String txtCPF, Date dataNasc, String txtEmail, long telefone){
        this.txtNome = txtNome;
        this.txtCPF = txtCPF;
        this.dataNasc = dataNasc;
        this.txtEmail = txtEmail;
        this.txtTelefone = txtTelefone;
    }

    public CadastroModel(){

    }

    private String txtNome;
    private String txtCPF;
    private Date dataNasc;
    private String txtEmail;
    private long txtTelefone;

    public void setTxtNome(String txtNome){
        this.txtNome = txtNome;
    }
    public String getTxtNome(){
        return txtNome;
    }

    public void setTxtCPF(String txtCPF){
        this.txtCPF = txtCPF;
    }
    public Long getTxtCPF(){
        return txtCPF;
    }

    public void setDataNasc(Date dataNasc){
        this.dataNasc = dataNasc;
    }
    public Date getDataNasc(){
        return dataNasc;
    }

    public void setTxtEmail(String txtEmail){
        this.txtEmail = txtEmail;
    }
    public String getTxtEmail(){
        return txtEmail;
    }

    public void setTxtTelefone(Long txtTelefone){
        this.txtTelefone = txtTelefone;
    }
    public Long getTxtTelefone(){
        return txtTelefone;
    }
}