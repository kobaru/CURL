# CURL

curlコマンドライクな振る舞いをするjavaアプリケーションの作成

### コンパイル

`$ gradle clean compileJava`

### ビルド

`$ gradle build`

### 実行

`$ java -classpath build/libs/CURL.jar App [オプション] [任意のURL]`

### オプション

任意のオプションを選択できます  
各コマンドの下に実行例を載せています  

***-get***  
`$ curl https://example.com` 相当のことができる機能  
`$ java -classpath build/libs/CURL.jar App -get https://httpbin.org/get`  

***-download***  
`$ curl -o file https://example.com` 相当のことができる機能  
`$ java -classpath build/libs/CURL.jar App -download file/image.png https://httpbin.org/image/png`  

***-header***  
`$ curl -v https://example.com` 相当のことができる機能  
`$ java -classpath build/libs/CURL.jar App -header https://httpbin.org/get`  

***-post***  
`$ curl -X POST https://example.com` 相当のことができる機能  
`$ java -classpath build/libs/CURL.jar App -post https://httpbin.org/post`  

***-postout***  
`$ curl -X POST "key=value" https://example.com` 相当のことができる機能  
`$ java -classpath build/libs/CURL.jar App -postout "key=value" https://httpbin.org/post`  

### 複数オプションの指定

同一URLなら複数のオプションを同時に設定可能です

`$ java -classpath build/libs/CURL.jar App -get -header https://httpbin.org/get`  