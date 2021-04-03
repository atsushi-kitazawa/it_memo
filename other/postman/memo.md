# レスポンスの内容を変数にセットするスクリプト
```javascript
var jsonData = JSON.parse(responseBody);
//postman.setEnvironmentVariable("name", jsonData.name);
postman.setGlobalVariable("name", jsonData['users'][0]['name']);
```
