package com.campusdual.json;

import com.campusdual.Utils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class JsonFileCreator {

    private static void createFile(){
        JsonObject computer = new JsonObject();
        JsonArray componentsArray = new JsonArray();//creas array vacío


        //JsonObject component1 = new JsonObject();//creas components dentro del array
        //component1.addProperty("quantity",2);//introduces datos del componente 1
        //component1.addProperty("text","RAM");
        //componentsArray.add(component1);//añades el componente 1 al array

        //llamo al metodo de creacion de items que hice abajo
        componentsArray.add(createItem(2,"Graphic Card"));
        componentsArray.add(createItem(1,"CPU"));
        componentsArray.add(createItem(3,"Fan"));
        componentsArray.add(createItem(1,"Motherboard"));
        componentsArray.add(createItem(2,"RAM"));
        componentsArray.add(createItem(2,"SSD"));
        componentsArray.add(createItem(1,"Power supply"));
        componentsArray.add(createItem(1,"Computer case"));
        //añado la etiqueta components al fichero para indicar que todo lo de arriba va dentro
        computer.add("components",componentsArray);

        //creo un fichero .json
        try(FileWriter fw = new FileWriter("src/main/resources/computerList.json")){
            //sin formato
            //=============
            //fw.write(computer.toString());
            //con formato
            //=============
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(computer);
            fw.write(json);
            fw.flush();
            } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static JsonObject createItem(int quantity, String itemDesc) {
        JsonObject component = new JsonObject();
        component.addProperty("quantity", quantity);
        component.addProperty("text", itemDesc);
        return component;
    }

    public static void main(String[] args) {

        JsonFileCreator.createFile();
    }
}
