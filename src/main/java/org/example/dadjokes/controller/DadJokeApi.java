package org.example.dadjokes.controller;

import org.example.dadjokes.domain.DadJoke;
import org.example.dadjokes.service.DadJokeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class DadJokeApi {
    private DadJokeService service;

    public DadJokeApi(DadJokeService service) {
        this.service = service;
    }

    @GetMapping("dadjokes/jokes")
    public List<DadJoke> all() {
        return service.getAll();
    }

    @PostMapping("dadjokes")
    public void add(@RequestBody DadJoke newDadJoke) {
        service.addJoke(newDadJoke);
    }

    @PutMapping("dadjokes/{id}")
    public DadJoke updateJoke(@PathVariable int id,
                                @RequestBody DadJoke updatedDadJoke) {
        return service.updateJoke(id, updatedDadJoke.getJokeText());
    }

    @DeleteMapping("dadjokes/{id}")
    public void deleteJoke(@PathVariable int id) {
        service.deleteJoke(id);
    }
}
