package name.legkodymov.poc.kafka.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageProducer {

    public static final String TOPIC_NAME = "topic1";

    @Autowired
    private KafkaTemplate<Object, TestMessage> template;

    public void send(TestMessage message) {
        template.send(TOPIC_NAME, message);
    }
}