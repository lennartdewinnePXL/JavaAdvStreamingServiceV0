package be.pxl.ja.streamingservice.model;

import org.controlsfx.control.Rating;

public class Documentary extends Movie {
    private String topic;

    public Documentary(String title, Rating maturityRating) {
        super(title, maturityRating);
        setGenre(Genre.DOCUMENTARY);
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
