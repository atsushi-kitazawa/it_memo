## ISOからyumする方法
* [設定] - [ストレージ] - [コントローラIDE] で以下のように設定する
  * 空
  * xxx.iso ← 追加する
* 以下のコマンドを実行する
``` 
mkdir /media/CentOS
mount /dev/sr0 /media/CentOS
```
* yum設定を編集する
```
vi /etc/yum.repos.d/CentOS-Media.repo

[c7-media]
name=CentOS-$releasever - Media
baseurl=file:///media/CentOS/
file:///media/cdrom/
file:///media/cdrecorder/
gpgcheck=1
enabled=1   # 0⇒1に変更
gpgkey=file:///etc/pki/rpm-gpg/RPM-GPG-KEY-CentOS-7
```
* yumする
```
yum install --disablerepo=* --enablerepo=c7-media wget
```
