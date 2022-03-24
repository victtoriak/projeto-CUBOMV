package App;

public class lista {
    private String Nome;
    private String CPF;
    private String Item; 

    
    public lista(String nome, String cPF, String item) {
        Nome = nome;
        CPF = cPF;
        Item = item;
    }
    
    public String getNome() {
        return Nome;
    }
    
    public void setNome(String nome) {
        Nome = nome;
    }
    
    public String getCPF() {
        return CPF;
    }
    
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    
    public String getItem() {
        return Item;
    }
    
    public void setItem(String item) {
        Item = item;
    }

    @Override
    public String toString() {
        return "Colaborador: \n Nome: " + Nome + ", \n CPF: " + CPF + ", \n Item: " + Item + "";

    }
    

}