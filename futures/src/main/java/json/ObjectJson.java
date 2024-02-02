package json;


public class ObjectJson {

    private String text1;
    private String text2;
    private long chatId;
    private float messageId;
    private String jsonString = String.format("{\n" +
            "  \"chat_id\": \"%s\",\n" +
            "  \"message_id\": \"%s\",\n" +
            "  \"reply_markup\": {\n" +
            "    \"inline_keyboard\": [\n" +
            "      [{\n" +
            "        \"text1\": \"%s\",\n" +  // Substituindo {VÁRIAVEL} pelo valor da variável text
            "        \"callback_data\": \"one_piece_confim\"\n" +
            "      }],\n" +
            "      [{\n" +
            "        \"text2\": \"%s\",\n" +
            "        \"callback_data\": \"one_piece_not_confim\"\n" +
            "      }]\n" +
            "    ]\n" +
            "  }\n" +
            "}", chatId, messageId,text1, text2);

}