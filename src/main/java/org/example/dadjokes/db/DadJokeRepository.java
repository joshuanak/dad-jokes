package org.example.dadjokes.db;

import org.example.dadjokes.domain.DadJoke;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DadJokeRepository extends JpaRepository<DadJoke, Integer> {
}
