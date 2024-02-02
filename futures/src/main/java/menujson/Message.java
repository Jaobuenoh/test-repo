package menujson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Message {

    private final Long chatId;
    private final Long messageId;
    private final ReplyMarkup replyMarkup;

    @JsonCreator
    public Message(Long chatId, @JsonProperty("message_id") Long messageId, @JsonProperty("reply_markup") ReplyMarkup replyMarkup) {
        this.chatId = chatId;
        this.messageId = messageId;

        this.replyMarkup = replyMarkup;
    }
}