package ankita.myapplication.launcherActivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import ankita.myapplication.AsyncTask.PracticeAsyncTask;
import ankita.myapplication.BroadcastRecieverPratice.PractiveBroadcastReciever;
import ankita.myapplication.ConnectivityManagerPractice.PracticeConnectivityManager;
import ankita.myapplication.FlowingDrawer.PracticeFlowingDrawer;
import ankita.myapplication.HttpCallWithOkHttp.HttpCallWithOkHttp;
import ankita.myapplication.HttpCallsWithVolley.PracticeHttpCalls;
import ankita.myapplication.IntentApplicationPractice.PracitceIntentApplication;
import ankita.myapplication.CustomStylePractice.PracticeCustomStyle;
import ankita.myapplication.IntentPractice.PracticeImplicitIntent;
import ankita.myapplication.JsonParsing.PracticeJsonParsing;
import ankita.myapplication.MapsPractice.PracticeMaps;
import ankita.myapplication.ServicesPractice.PracticeServices;
import ankita.myapplication.TabsUsingCustomPager.PracticeTabsUsingCustomPager;
import ankita.myapplication.ToolBarPractice.PracticeToolbar;
import ankita.myapplication.UiTask1Practice.PracticeUiTask1;
import ankita.myapplication.UiTask2Practice.PracticeUiTask2;
import ankita.myapplication.VolleyPostRequest.PracticePostRequest;
import ankita.myapplication.customList.PracticeCustomListView;
import ankita.myapplication.drawablesPractice.PracticeDrawables;
import ankita.myapplication.expandableListViewPractive.PracticeExpandableList;
import ankita.myapplication.facebooklogin.PracticeFacebookLogin;
import ankita.myapplication.fragmentPractice.PracticeFragment;
import ankita.myapplication.gridViewPractice.PracticeGridView;
import ankita.myapplication.layoutPractice.PracticeLinearLauoyt;
import ankita.myapplication.locationHandeling.PracticeLocationHandeling;
import ankita.myapplication.navigationDrawerPractice.PracticeNavigationDrawer;
import ankita.myapplication.sharedPreferencePrectice.PrecticeSharedPreference;
import ankita.myapplication.sqlLiteDatabasePractice.PracticeSqllite;
import ankita.myapplication.tabsPractice.PracticeTabs;
import ankita.myapplication.uiControlPractice.PracticeUiControls;
import ankita.myapplication.layoutPractice.PractiveFrameLayout;
import ankita.myapplication.layoutPractice.PractiveRelativeLayout;
import ankita.myapplication.R;

public class PracticeList extends AppCompatActivity {

    String[] mobileArray = {"Linear Layout","Relative Layout","FrameLayout","UI Controls",
                            "CustomListView","Grid View","Expandable List","Custom Style",
                            "Ui Task 1","Services ","Broadcast Reciever","Implicit Intent",
                            "Intent Application (Camera)","Sqllite Practice","Fragments","Shared Preferences",
                            "Async Task","Drawables Practice","Ui task 2","Connectvity Manager",
                            "Tabs Practice","Tabs Custom","Navigation Drawer","Flowing Drawer",
                            "ToolBar Practice","Location handeling ans Maps"," Maps(continue)","JsonParsing",
                            "Http Calls(Volley)","Http Calls(Ok http)","PostRequest (Volley)","Facebook Login"};
    Class[] activities = {PracticeLinearLauoyt.class, PractiveRelativeLayout.class, PractiveFrameLayout.class,PracticeUiControls.class,
                          PracticeCustomListView.class, PracticeGridView.class,PracticeExpandableList.class, PracticeCustomStyle.class,
                          PracticeUiTask1.class, PracticeServices.class, PractiveBroadcastReciever.class, PracticeImplicitIntent.class,
                          PracitceIntentApplication.class, PracticeSqllite.class, PracticeFragment.class, PrecticeSharedPreference.class,
                          PracticeAsyncTask.class, PracticeDrawables.class, PracticeUiTask2.class, PracticeConnectivityManager.class,
                          PracticeTabs.class, PracticeTabsUsingCustomPager.class, PracticeNavigationDrawer.class, PracticeFlowingDrawer.class,
                          PracticeToolbar.class, PracticeLocationHandeling.class, PracticeMaps.class, PracticeJsonParsing.class,
                          PracticeHttpCalls.class,HttpCallWithOkHttp.class, PracticePostRequest.class, PracticeFacebookLogin.class};
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        // Array of strings...
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_practice_list);
        ArrayAdapter adapter = new ArrayAdapter<String> (this, R.layout.list_view_item_layout, mobileArray);
        ListView listView = (ListView) findViewById(R.id.dailyList);
        listView.setAdapter (adapter);
        listView.setOnItemClickListener (new AdapterView.OnItemClickListener () {
            @Override
            public void onItemClick (AdapterView<?> parent, View view, int position, long id) {
                Log.e("Iten Clicked",position+" "+ id);
                Intent intent = new Intent (getApplicationContext (),activities[position]);
                startActivity (intent);
            }
        });
    }
}
