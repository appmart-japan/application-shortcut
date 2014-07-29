package com.example.shortcut;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

/**
 * �f�X�N�g�b�v�ɃV���[�g�J�b�g���쐬
 * @author canu
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //������ς�����A�쐬���܂���
        if(savedInstanceState== null){
        	addShortcut();
        }
    }

    /*
     * �V���[�g�J�b�g�쐬
     */
    private void addShortcut() {
    	
        Intent shortcutIntent = new Intent(getApplicationContext(), MainActivity.class);
         
        shortcutIntent.setAction(Intent.ACTION_MAIN);
     
        Intent addIntent = new Intent();
        addIntent.putExtra(Intent.EXTRA_SHORTCUT_INTENT, shortcutIntent);
        addIntent.putExtra(Intent.EXTRA_SHORTCUT_NAME, "HelloWorldShortcut");
        addIntent.putExtra(Intent.EXTRA_SHORTCUT_ICON_RESOURCE,
                Intent.ShortcutIconResource.fromContext(getApplicationContext(),
                        R.drawable.ic_launcher));
     
        addIntent.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
        getApplicationContext().sendBroadcast(addIntent);
    }

}
