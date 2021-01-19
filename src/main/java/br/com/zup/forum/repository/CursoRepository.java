package br.com.zup.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zup.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nome);

}
