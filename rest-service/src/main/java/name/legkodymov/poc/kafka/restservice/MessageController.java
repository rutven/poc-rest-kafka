package name.legkodymov.poc.kafka.restservice;

import org.springframework.web.bind.annotation.*;

@RestController
public class MessageController {

    private final MessageProducer producer;

    public MessageController(MessageProducer producer) {
        this.producer = producer;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello, world!";
    }

    @GetMapping("/messages")
    @ResponseBody
    public TestMessage getMessage() {
        TestMessage message = new TestMessage();
        message.setChannel("email");
        message.setTitle("My test message");
        message.setText("My test message content.");
        return message;
    }

    @PostMapping("/messages")
    @ResponseBody
    public TestMessage sendMessage(@RequestBody TestMessage message) {
        producer.send(message);
        return message;
    }
}
