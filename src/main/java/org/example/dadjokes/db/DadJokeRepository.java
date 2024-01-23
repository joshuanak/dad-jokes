package org.example.dadjokes.db;

import org.example.dadjokes.domain.DadJoke;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DadJokeRepository extends JpaRepository<DadJoke, Integer> {

}
