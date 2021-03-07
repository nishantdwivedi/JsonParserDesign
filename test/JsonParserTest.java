
class JsonParserTest {
    Map<String, Object> json = new JsonParser().parseJson("{\"abc\":{\"bcde\":\"fg\",\"xml\":\"asd\"}}"); // Successful to get map object
        new JsonParser().parseJson("{\"zabc\":{zbcde\":\"fg\",\"xml\":\"asd\"}}"); // Exception because  of wrong key, zbcde
        new JsonParser().parseJson("{{\"abc\":{\"zbcde\":\"fg\",\"xml\":\"asd\"}}"); // Exception because of one more {
        new JsonParser().parseJson("{\"abc\":{\"zbcde\":\"fg\",\"xml\":\"asd\"}}}")


}