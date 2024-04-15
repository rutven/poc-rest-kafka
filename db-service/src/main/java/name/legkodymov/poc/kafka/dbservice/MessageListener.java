package name.legkodymov.poc.kafka.dbservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    private final Logger logger = (Logger) LoggerFactory.getLogger(MessageListener.class);

    @KafkaListener(topics = AppConst.TOPIC_NAME)
    public void listen(TestMessage message) {
        logger.info("Received message: " + message.toString());
    }
}