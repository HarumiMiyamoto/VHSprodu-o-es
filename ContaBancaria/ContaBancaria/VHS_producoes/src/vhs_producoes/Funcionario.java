package vhs_producoes;

public class Funcionario {
    String nome, endereco, tel, email, cpf, rg, carteira,cargo, id,senha,login;

    public Funcionario(String nome, String endereco, String tel, String email, String cpf, String rg, String carteira, String cargo, String id) {
        this.nome = nome;
        this.endereco = endereco;
        this.tel = tel;
        this.email = email;
        this.cpf = cpf;
        this.rg = rg;
        this.carteira = carteira;
        this.cargo = cargo;
        this.id = id;
        this.senha = senha;
        this.login =login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCarteira() {
        return carteira;
    }

    public void setCarteira(String carteira) {
        this.carteira = carteira;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void getSenha(String senha){
        this.senha=senha;
    }
    public  void setSenha(String senha){
        this.senha= senha;
    }
    public void getlogin(String login){
        this.login=login;
        
    }
    public void setlogin(String login){
        this.login=login;
    }
    

    public Funcionario(String nome, String endereco, String tel, String email, String cpf, String rg, String carteira, String cargo) {
        this.nome = nome;
        this.endereco = endereco;
        this.tel = tel;
        this.email = email;
        this.cpf = cpf;
        this.rg = rg;
        this.carteira = carteira;
        this.cargo = cargo;
    }

    public Funcionario(String cargo ,String login ,String senha) {
        this.cargo = cargo ;
        this.login= login;
        this.senha= senha;
    }
    
}
