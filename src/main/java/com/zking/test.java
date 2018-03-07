package com.zking;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: longyt
 * @create: 2018-02-26 20:03
 * @desc:
 **/
public class test {
    public static void main(String[] args) {
        try {
            MongoClient mongoClient=new MongoClient("localhost",27017);
            MongoDatabase database = mongoClient.getDatabase("test");
            System.out.println("Connect to database successfully");
            MongoCollection<Document> collection = database.getCollection("ta");
            /**
             * 遍历集合
             */
            /*FindIterable<Document> documents = collection.find();
            MongoCursor<Document> iterator = documents.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }*/
            /**
             * 添加
             */
            /*Document document=new Document("k","v");
            document.append("aa","11");
            document.append("bb","22");
            List<Document> list=new ArrayList<Document>();
            list.add(document);
            collection.insertMany(list);
            System.out.println("insert ok");*/
            /**
             * update
             */
            /*collection.updateMany(Filters.eq("aa","11"),new Document("$set",new Document("aa","111")));
            System.out.println("ok");*/

            /**
             * delete
             */
            /*collection.deleteOne(Filters.eq("name","aa"));
            System.out.println("delete document ok ");*/
        }catch (Exception e){

        }
    }
}
