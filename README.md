## デスクトップにショートカットを作成

> Manifestファイルに パーミッションを追加

```xml
	 <uses-permission android:name="com.android.launcher.permission.INSTALL_SHORTCUT" />
```

> ショートカット作成用の関数

```java
private void addShortcut() {
    	
        Intent shortcutIntent = new Intent(getApplicationContext(), MainActivity.class);
         
        shortcutIntent.setAction(Intent.ACTION_MAIN);
     
        Intent addIntent = new Intent();
        addIntent.putExtra(Intent.EXTRA_SHORTCUT_INTENT, shortcutIntent);
        addIntent.putExtra(Intent.EXTRA_SHORTCUT_NAME, "表示されるアプリ名");
        addIntent.putExtra(Intent.EXTRA_SHORTCUT_ICON_RESOURCE,
                Intent.ShortcutIconResource.fromContext(getApplicationContext(),
                        R.drawable.ic_launcher));
     
        addIntent.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
        getApplicationContext().sendBroadcast(addIntent);
}
```