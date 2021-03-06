package common.utils;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class GsonUtils {
    private static Gson gson = new Gson();
    private static Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
    private static JsonParser parser = new JsonParser();

    /**
     * 对象转换为字符串
     *
     * @param src
     * @return
     */
    public static String toJson(Object src){
        if(src == null){
            return null;
        }
        return gson.toJson(src);
    }

    /**
     * 打印可读格式的json
     *
     * @param src
     * @return
     */
    public static String toPretty(Object src) {
        if(src == null){
            return null;
        }
        return prettyGson.toJson(src);
    }

    /**
     * 字符串转换为对象
     *
     * @param json
     * @param typeOfT
     * @return
     */
    public static <T> T fromJson(String json, Class<T> typeOfT){
        if(json == null){
            return null;
        }
        return gson.fromJson(json, typeOfT);
    }

    /**
     * json element 转换为对象
     *
     * @param json
     * @param typeOfT
     * @return
     */
    public static <T> T fromJson(JsonElement json, Class<T> typeOfT){
        if(json == null){
            return null;
        }
        return gson.fromJson(json, typeOfT);
    }

    /**
     * 字符串转换为对象
     *
     * @param json
     * @param typeOfT
     * @return
     */
    public static <T> T fromJson(String json, Type typeOfT) throws JsonSyntaxException {
        if(json == null){
            return null;
        }
        return gson.fromJson(json, typeOfT);
    }

    /**
     * json element 转换为对象
     *
     * @param json
     * @param typeOfT
     * @return
     */
    public static <T> T fromJson(JsonElement json, Type typeOfT) throws JsonSyntaxException {
        if(json == null){
            return null;
        }
        return gson.fromJson(json, typeOfT);
    }

    /**
     * 解析字符串为json对象
     *
     * @param json
     * @return
     */
    public static JsonObject parseObject(String json){
        if(json == null){
            return null;
        }
        return parser.parse(json).getAsJsonObject();
    }

    /**
     * 解析字符串为jsonArray对象
     *
     * @param json
     * @return
     */
    public static JsonArray parseArray(String json){
        if(json == null){
            return null;
        }
        return parser.parse(json).getAsJsonArray();
    }

    /**
     * 取String 属性，　没有就返回空
     */
    public static String getString(JsonObject json, String attr){
        return json.has(attr) ? json.get(attr).getAsString() : null;
    }
    /**
     * 取String 属性，　没有就返回空
     */
    public static Long getLong(JsonObject json, String attr){
        return json.has(attr) ? json.get(attr).getAsLong() : null;
    }
    /**
     * 取String 属性，　没有就返回空
     */
    public static Integer getInt(JsonObject json, String attr){
        return json.has(attr) ? json.get(attr).getAsInt() : null;
    }
}
