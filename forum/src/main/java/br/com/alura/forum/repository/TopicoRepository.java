package br.com.alura.forum.repository;

import br.com.alura.forum.modelo.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicoRepository extends JpaRepository<Topico, Long>{
    //a padronização de nomenclatura findBy***** é o que garante a criação de uma query ordenando
    //Spring Data é quem gera as consultas
    //no método abaixo ao colocarmos underline após 'Curso' nos garante que
    //é para gerar uma consulta através da referência Curso, presente no DTO do Repositório, no atributo Nome
    //evitando assim ambiguidades, caso existisse uma variável nomeCurso no TopicoDTO
    List<Topico> findByCurso_Nome(String nomeCurso);
}
