package menujson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InlineKeyboard {

    private final String text;
    private final String callbackData;

    @JsonCreator
    public InlineKeyboard(@JsonProperty("text") String text, @JsonProperty("callback_data") String callbackData) {
        this.text = text;
        this.callbackData = callbackData;
    }
}
