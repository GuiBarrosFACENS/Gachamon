package gachamon;

import java.util.ArrayList;
import java.util.List;

public class User {
    public String nome;
    protected String email;
    protected String password;
    protected Integer balance;
    protected List<Prize> prizes = new ArrayList<>();
    private boolean logado;

    public boolean isLogado() {
        return logado;
    }

    public void setLogado(boolean logado) {
        this.logado = logado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public List<Prize> getPrizes() {
        return prizes;
    }

    public void setPrizes(List<Prize> prizes) {
        this.prizes = prizes;
    }

    public User(String nome, String email, String password, Integer balance) {
        this.nome = nome;
        this.email = email;
        this.password = password;
        this.balance = balance;
        this.logado = false;
    }

    @Override
    public String toString() {
        return "User{" + "nome=" + nome + ", email=" + email + ", password=" + password + ", balance=" + balance + ", prizes=" + prizes + '}';
    }
    
    
}
