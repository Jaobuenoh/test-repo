package menujson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ReplyMarkup { // Mudar nome para Keyboard
    private final List<List<InlineKeyboard>> inlineKeyboard;

    @JsonCreator
    public ReplyMarkup(@JsonProperty("inline_keyboard") List<List<InlineKeyboard>> inlineKeyboard) {
        this.inlineKeyboard = inlineKeyboard;
    }
}