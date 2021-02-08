## my golang memo
* GOPATH に設定したディレクトリに全部置く。自身のソースコード、go get してきたモジュール、ソースコードなど。
* プロジェクトごとにディレクトリを分けたい場合は、GOPATH を切り替えてやる。
* 自身のソースコードは $GOPATH/src/github.com/<user_name>/<project_name> に配置する。
* go get してくると $GOPATH/src/github.com/<user_name>/<project_name> にソースコードが配置される。バイナリは bin に配置される。
