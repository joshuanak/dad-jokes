package org.example.dadjokes.service;

import org.example.dadjokes.db.DadJokeRepository;
import org.example.dadjokes.domain.DadJoke;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class DadJokeService {
    private DadJokeRepository repository;

    public DadJokeService(DadJokeRepository repository) {
        this.repository = repository;
    }

    public List<DadJoke> getAll() {
        List<DadJoke> jokes = repository.findAll();
        return Collections.unmodifiableList(jokes);
    }

    public void addJoke(DadJoke joke) {
        repository.save(joke);
    }

    public DadJoke updateJoke(int id, String newJokeText) {
        DadJoke currentJoke = repository.findById(id).orElseThrow();

        currentJoke.setJokeText(newJokeText);

        // this is add OR update
        return repository.save(currentJoke);
    }

    public void deleteJoke(int id) {
        repository.deleteById(id);
    }
}




