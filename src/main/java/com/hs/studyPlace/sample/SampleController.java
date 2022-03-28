package com.hs.studyPlace.sample;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/sample", produces = "application/json")
@RequiredArgsConstructor
public class SampleController {
    @GetMapping(value = "/")
    public ResponseEntity<String> getSample () {
        return ResponseEntity.ok("api call success :)");
    }
}
