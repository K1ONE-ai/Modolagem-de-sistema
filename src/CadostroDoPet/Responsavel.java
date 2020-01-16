package CadostroDoPet;

public class Responsavel {
    private String nome1;
    private String sobrenome;
    private String cep;
    private int idade;
    private String numeroResidencial;
    private String email;
    private String telefone;

    public String getNome1() {
        return nome1;
    }

    public void setNome1(String nome1) {
        this.nome1 = nome1;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNumeroResidencial() {
        return numeroResidencial;
    }

    public void setNumeroResidencial(String numeroResidencial) {
        this.numeroResidencial = numeroResidencial;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Responsavel(String nome, String sobrenome, String cep, int idade, String numeroResidencial, String email, String telefone) {
        this.nome1 = nome;
        this.sobrenome = sobrenome;
        this.cep = cep;
        this.idade = idade;
        this.numeroResidencial = numeroResidencial;
        this.email = email;
        this.telefone = telefone;


    }


    public String retornarTodosDados() {
        return "Responsavel{" +
                "nome1='" + nome1 + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cep='" + cep + '\'' +
                ", idade=" + idade +
                ", numeroResidencial='" + numeroResidencial + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }

    public boolean verificarMaiorDeIdade(){
        if (idade > 17) {
            return true;

        }
        return false;
    }
}