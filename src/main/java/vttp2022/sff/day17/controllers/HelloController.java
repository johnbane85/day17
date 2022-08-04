package vttp2022.sff.day17.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/hello", produces = "text/html")
public class HelloController {

  @GetMapping
  public ResponseEntity<String> getHello(@RequestParam(defaultValue = "Fred") String name) {

    String html = "<h1>Hello %s</h1>".formatted(name);

    return ResponseEntity
        .status(200)
        .body(html);
  }
}
