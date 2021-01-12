# AndroidCrash
Android crash捕捉工具类

# 优点
- 自定义捕捉crash,写crash日志到文件
- 异常可传递，兼容 bugly 等

## 博客

[Android 打造异常崩溃捕获工具](https://blog.csdn.net/zhaoyanjun6/article/details/112476811)

## 日志示例

```
versionName: 1.0
versionCode: 1
androidSDK: 9
DeviceModel: OUKITEL WP7

java.lang.ArithmeticException: divide by zero
	at com.cootek.remoteapp.MainActivity.makeCrash(MainActivity.kt:22)
	at com.cootek.remoteapp.MainActivity$onCreate$1.onClick(MainActivity.kt:14)
	at android.view.View.performClick(View.java:6613)
	at android.view.View.performClickInternal(View.java:6586)
	at android.view.View.access$3100(View.java:780)
	at android.view.View$PerformClick.run(View.java:26098)
	at android.os.Handler.handleCallback(Handler.java:873)
	at android.os.Handler.dispatchMessage(Handler.java:99)
	at android.os.Looper.loop(Looper.java:193)
	at android.app.ActivityThread.main(ActivityThread.java:6726)
	at java.lang.reflect.Method.invoke(Native Method)
	at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:493)
	at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:911)
```