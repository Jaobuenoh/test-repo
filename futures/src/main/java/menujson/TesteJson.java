package menujson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class TesteJson {
    public static void main(String[] args) {

        InlineKeyboard button1 = new InlineKeyboard("Texto 1", "one_piece_confirm");
        InlineKeyboard button2 = new InlineKeyboard("Texto 2", "one_piece_not_confirm");


        List<List<InlineKeyboard>> inlineKeyboard = Arrays.asList(
                Arrays.asList(button1),
                Arrays.asList(button2)
        );
        ReplyMarkup replyMarkup = new ReplyMarkup(inlineKeyboard);


        Message message = new Message(12L,123L, replyMarkup);


        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonString = objectMapper.writeValueAsString(message);

            System.out.println("JSON gerado:");
            System.out.println(jsonString);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
