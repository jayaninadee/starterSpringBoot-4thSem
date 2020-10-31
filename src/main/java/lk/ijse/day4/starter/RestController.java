package lk.ijse.ws.day4.starter;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyRestController {
    @GetMapping(path = "/hello", produces= MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<Object> sayHello() {
        return new ResponseEntity<Object>("Hello World", HttpStatus.OK);
    }
}