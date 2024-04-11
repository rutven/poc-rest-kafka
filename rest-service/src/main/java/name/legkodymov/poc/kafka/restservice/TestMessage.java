package name.legkodymov.poc.kafka.restservice;

import java.util.Objects;

public class TestMessage {

    private String title;
    private String channel;
    private String text;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestMessage that = (TestMessage) o;
        return Objects.equals(title, that.title) && Objects.equals(channel, that.channel) && Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(title);
        result = 31 * result + Objects.hashCode(channel);
        result = 31 * result + Objects.hashCode(text);
        return result;
    }

    public TestMessage(String title, String channel, String text) {
        this.title = title;
        this.channel = channel;
        this.text = text;
    }

    public TestMessage() {
    }

    @Override
    public String toString() {
        return "TestMessage{" +
                "title='" + title + '\'' +
                ", channel='" + channel + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
