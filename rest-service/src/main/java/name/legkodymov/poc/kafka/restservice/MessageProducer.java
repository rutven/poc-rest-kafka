package name.legkodymov.poc.kafka.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageProducer {

    @Autowired
    private KafkaTemplate<String, TestMessage> template;

    public void send(TestMessage message) {
        template.send(AppConst.TOPIC_NAME, message);
    }
}