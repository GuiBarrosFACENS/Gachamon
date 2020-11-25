package gachamon;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class Pokemon {
    private String pokemon;
    private String descricao;

    public String getPokemon() {
        return pokemon;
    }

    public void setPokemon(String pokemon) {
        this.pokemon = pokemon;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public List<Pokemon> lista2(){
        List<Pokemon> newpokemon = new ArrayList<>();
        ConnectionJDBC.getConnection();
        return newpokemon;
    }
    
}
