## Postgres

## MySQL
* mysql command usage
```
# mysql -u root D database -p
```
* query usage in mysql client
```
show databases;
show tables;
```

## MongoDB
```
# mongo -u root
```
```
db.collectionName.save(<json>);
db.collectionName.find();
db.collectionName.find(<condition json>);
```

## Redis
```
//string
set key "value"
get key

//hash
HMSET hash_test key1 "value1" key2 "value2"
HGETALL hash_test
HGET hash_test key

// check key type
type key
```
```
・データベースという概念はない
・「select 1」とかで名前空間を変えることができる(デフォルトは0みたい)
https://stackoverflow.com/questions/35621324/how-to-create-own-database-in-redis
```
