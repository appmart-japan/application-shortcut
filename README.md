## �f�X�N�g�b�v�ɃV���[�g�J�b�g���쐬

> Manifest�t�@�C���� �p�[�~�b�V������ǉ�

```xml
	 <uses-permission android:name="com.android.launcher.permission.INSTALL_SHORTCUT" />
```

> �V���[�g�J�b�g�쐬�p�̊֐�

```java
private void addShortcut() {
    	
        Intent shortcutIntent = new Intent(getApplicationContext(), MainActivity.class);
         
        shortcutIntent.setAction(Intent.ACTION_MAIN);
     
        Intent addIntent = new Intent();
        addIntent.putExtra(Intent.EXTRA_SHORTCUT_INTENT, shortcutIntent);
        addIntent.putExtra(Intent.EXTRA_SHORTCUT_NAME, "�\�������A�v����");
        addIntent.putExtra(Intent.EXTRA_SHORTCUT_ICON_RESOURCE,
                Intent.ShortcutIconResource.fromContext(getApplicationContext(),
                        R.drawable.ic_launcher));
     
        addIntent.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
        getApplicationContext().sendBroadcast(addIntent);
}
```