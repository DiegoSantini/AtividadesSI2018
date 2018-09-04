package br.usjt.sin.progmulti.atividadessi2018;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import br.usjt.sin.progmulti.atividadessi2018.util.StatusTracker;
import br.usjt.sin.progmulti.atividadessi2018.util.Utils;
/* @author Diego Silva Santini dos Santos RA816117855 */

public class ActivityC extends Activity {

    private String mActivityName;
    private TextView mStatusView;
    private TextView mStatusAllView;
    private StatusTracker mStatusTracker = StatusTracker.getInstance();
    /* @author Diego Silva Santini dos Santos RA816117855 */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        mActivityName = getString(R.string.activity_c_label);
        mStatusView = (TextView)findViewById(R.id.status_view_a);
        mStatusAllView = (TextView)findViewById(R.id.status_view_all_a);
        mStatusTracker.setStatus(mActivityName, getString(R.string.on_create));
        Utils.printStatus(mStatusView, mStatusAllView);
    }
    /* @author Diego Silva Santini dos Santos RA816117855 */
    @Override
    protected void onStart() {
        super.onStart();
        mStatusTracker.setStatus(mActivityName, getString(R.string.on_start));
        Utils.printStatus(mStatusView, mStatusAllView);
    }
    /* @author Diego Silva Santini dos Santos RA816117855 */
    @Override
    protected void onRestart() {
        super.onRestart();
        mStatusTracker.setStatus(mActivityName, getString(R.string.on_restart));
        Utils.printStatus(mStatusView, mStatusAllView);
    }
    /* @author Diego Silva Santini dos Santos RA816117855 */
    @Override
    protected void onResume() {
        super.onResume();
        mStatusTracker.setStatus(mActivityName, getString(R.string.on_resume));
        Utils.printStatus(mStatusView, mStatusAllView);
    }
    /* @author Diego Silva Santini dos Santos RA816117855 */
    @Override
    protected void onPause() {
        super.onPause();
        mStatusTracker.setStatus(mActivityName, getString(R.string.on_pause));
        Utils.printStatus(mStatusView, mStatusAllView);
    }
    /* @author Diego Silva Santini dos Santos RA816117855 */
    @Override
    protected void onStop() {
        super.onStop();
        mStatusTracker.setStatus(mActivityName, getString(R.string.on_stop));
    }
    /* @author Diego Silva Santini dos Santos RA816117855 */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        mStatusTracker.setStatus(mActivityName, getString(R.string.on_destroy));
        mStatusTracker.clear();
    }
    /* @author Diego Silva Santini dos Santos RA816117855 */
    public void startDialog(View v) {
        Intent intent = new Intent(ActivityC.this, DialogActivity.class);
        startActivity(intent);
    }
    /* @author Diego Silva Santini dos Santos RA816117855 */
    public void startActivityA(View v) {
        Intent intent = new Intent(ActivityC.this, ActivityA.class);
        startActivity(intent);
   }
    /* @author Diego Silva Santini dos Santos RA816117855 */
    public void startActivityB(View v) {
        Intent intent = new Intent(ActivityC.this, ActivityB.class);
        startActivity(intent);
    }
    /* @author Diego Silva Santini dos Santos RA816117855 */
    public void finishActivityC(View v) {
        ActivityC.this.finish();
   }
}
