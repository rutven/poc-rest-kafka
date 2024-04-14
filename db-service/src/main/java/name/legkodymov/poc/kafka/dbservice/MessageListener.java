package name.legkodymov.poc.kafka.dbservice;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    private static final String GROUP_ID = "group_id";
    public static final String TOPIC_NAME = "message-topic";

    @KafkaListener(topics = TOPIC_NAME, groupId = GROUP_ID)
    public void listen(TestMessage message) {
        System.out.println("Received message: " + message.toString());
    }
}