package br.unitins.topicos1.repository;

import java.util.List;

import br.unitins.topicos1.model.Desenvolvedora;
import br.unitins.topicos1.model.Jogo;
import io.quarkus.hibernate.orm.panache.PanacheQuery;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class JogoRepository implements PanacheRepository<Jogo> {
    public PanacheQuery<Jogo> findByNome(String nome) {
        if (nome == null)
            return null;
        return find("UPPER(nome) LIKE UPPER(?1) ", "%" + nome.toUpperCase() + "%");
    }

        public List<Jogo> findByAtivo(boolean ativo) {
        if (ativo) {
            return find("ativo", true).list();
        } else {
            return List.of(); 
        }
    }
}
