package ar.com.laboratory.observabilityexample.controllers;


import ar.com.laboratory.observabilityexample.service.SleepService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class HelloController {      
        private final RestTemplate restTemplate;
        private final SleepService sleepService;

        HelloController(RestTemplate restTemplate, SleepService sleepService) {
            this.restTemplate = restTemplate;
            this.sleepService = sleepService;
        }

        @GetMapping("/hello")
        public String hello() {
            log.info("---------Hello method started---------");
            log.info("---------Hello method started, id missing!---------");
            ResponseEntity<String> responseEntity = this.restTemplate.postForEntity("https://httpbin.org/post", "Hello, Cloud!", String.class);
            return responseEntity.getBody();
        }

        @GetMapping("/exception")
        public String exception() {
            throw new IllegalArgumentException("This id is invalid");
        }

        @GetMapping("/sleep")
        public Long sleep(@RequestParam Long ms) {
            Long result = this.sleepService.doSleep(ms);
            return result;
        }

        @ExceptionHandler(value = { IllegalArgumentException.class })
        protected ResponseEntity<String> handleConflict(IllegalArgumentException ex) {
            log.error(ex.getMessage());
            return ResponseEntity.badRequest().body(ex.getMessage());
        }
}
