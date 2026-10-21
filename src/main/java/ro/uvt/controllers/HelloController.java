package ro.uvt.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.uvt.difexample.ClientComponent;

@RestController
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class HelloController {

    private final ClientComponent cc1;
    private final ClientComponent cc2;
    private final ClientComponent cc3;

    @GetMapping("/")
    public String hello() {
        cc1.operation();
        cc2.operation();
        cc3.operation();
        return "Hello from " + cc1.toString() + "    "
        + "Hello from " + cc2.toString() + "    "
        + "Hello from " + cc3.toString();
    }
}
