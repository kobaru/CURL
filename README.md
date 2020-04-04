# CURL

curlコマンドライクな振る舞いをするjavaアプリケーションの作成

### コンパイル

$ gradle clean compileJava

### ビルド

$ gradle build

### 実行

$ java -classpath build/libs/CURL.jar App [オプション] [任意のURL]

### オプション

任意のオプションを選択できます

<dl>
  <dt>-get</dt>
  <dd>curl https://example.com 相当のことができる機能</dd>
  <dd>$ java -classpath build/libs/CURL.jar App -get https://httpbin.org/get<dd>
  <dt>-download</dt>
  <dd>curl -o file https://example.com 相当のことができる機能</dd>
</dl> 