# Learning Mongodb
A simple application that uses mongodb, java spring boot, swagger ui, rest api, and jUnit with mockito. 

The URL to view swagger UI is: ttp://localhost:8080/swagger-ui.html

The Database structure is: 
```json
  {
    _id: ObjectId("61101c6bbf5db1e07cb7244d"),
    title: 'The Departed',
    genres: [ 'Drama', 'action', 'Crime-Drama' ],
    runtime: 150,
    rated: 'R',
    year: 2006,
    directors: [ 'Martin Scorsese' ],
    cast: [
      'Leo DiCaprio',
      'Matt Damon',
      'Jack Nicholson',
      'Mark Wahlberg',
      'Vera Farmiga',
      'Martin Sheen'
    ],
    boxoffice: 292
  }
```

I want to document how to do CRUD operations in mongodb. This portion of the readme file will be mostly for me, but I also want to keep updating this. 
- TO enter the shell use: mongoose
- To create or use a database: use __name__;
- To insert: 
    - db.tablename.insertOne ({ json like format }) - for one insert 
    - db.tablename.insertMany - for many inserts
- To delete:
    - To delete multiple documents, use db.collection.deleteMany().
    - To delete a single document, use db.collection.deleteOne().
- To update:
    - To update a single document, use db.collection.updateOne().
    - To update multiple documents, use db.collection.updateMany().
    - To replace a document, use db.collection.replaceOne().
- To query: db.tablename.find ({ })
