package com.aman.moviestore.entity;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "movies")
//@Table(name="movietable")
public class Movie {

    @Id
    private ObjectId _id;

    private String title;
    private String[] genres;
    private int runtime;
    private String rated;
    private int year;
    private String[] director;
    private String[] cast;
    private int boxoffice;

}
