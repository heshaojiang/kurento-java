package org.kurento.jsonrpc;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.kurento.jsonrpc.client.JsonRpcClient;
import org.kurento.jsonrpc.client.JsonRpcClientNettyWebSocket;
import org.kurento.jsonrpc.message.Request;
import org.kurento.jsonrpc.message.Response;

/**
 * @description:
 * @author: hsjiang
 * @date: 2019-05-21 10:23
 **/
public class TestHandler {
    public static void main(String[] args) {
        JsonRpcClient client = new JsonRpcClientNettyWebSocket("ws://localhost:8080/jsonrpc");
        Request<JsonObject> request = new Request<>();
        request.setMethod("echo");
        JsonObject params = new JsonObject();
        params.addProperty("some property", "Some Value");
        request.setParams(params);
        try {
            Response<JsonElement> response = client.sendRequest(request);
            System.out.println();
        }catch (Exception e){

        } finally {
            try {
                client.close();
            }catch (Exception e){

            }

        }


    }
}
