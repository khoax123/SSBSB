package com.khoax123.ssbsb;

import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ImageSpan;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {
    private Toolbar toolbar;
    ViewPager mPager;
    SlidingTabLayout mTabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Epic Music");
        //Generate the ActionBar on top of the Activity
        // Note to Self Remove the Navigation bar until find a better way to Navigate multiple decisions
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        //ViewPager to allow User to swipe to go to next section
        mPager = (ViewPager) findViewById(R.id.MainViewPager);
        FragmentManager fragmentManager = getSupportFragmentManager();

        mPager.setAdapter(new MyPagerAdapter(fragmentManager));

        mTabs = (SlidingTabLayout) findViewById(R.id.slidingTab);
        mTabs.setDistributeEvenly(true);
        mTabs.setBackgroundColor(getResources().getColor(R.color.primaryColor));
        mTabs.setSelectedIndicatorColors(getResources().getColor(R.color.accentColor));

        mTabs.setViewPager(mPager);


        mTabs.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                //Change Title When for selected Page

                switch (position) {
                    case 0: {
                        setTitle("Epic Music");
                        break;
                    }
                    case 1: {
                        setTitle("Major League Gaming");
                        break;
                    }
                    case 2: {
                        setTitle("Phoenix Wright");

                        break;
                    }
                    case 3: {
                        setTitle("Dota sounds");
                        break;
                    }
                    case 4: {
                        setTitle("Random");

                        break;
                    }

                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {


            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    class MyPagerAdapter extends FragmentPagerAdapter {

        int icons[] ={R.drawable.place_holder,R.drawable.place_holder,R.drawable.place_holder,R.drawable.place_holder,R.drawable.place_holder};
        String[] tabstext;


        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
            tabstext = getResources().getStringArray(R.array.tabs);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = new Fragment();

            switch (position) {
                case 0: {
                    fragment = new Epic();
                    break;
                }
                case 1: {
                    fragment = new MLG();
                    break;
                }
                case 2: {
                    fragment = new Phoenix();
                    break;
                }
                case 3: {
                    fragment = new Dota();
                    break;
                }
                case 4: {
                    fragment = new Rand();
                    break;
                }
            }


            return fragment;
        }

        @Override
        public int getCount() {
            return 5;
        }

        @Override
        public CharSequence getPageTitle(int position) {

            Drawable drawable = getResources().getDrawable(icons[position]);
            drawable.setBounds(0,0,36,36);
            ImageSpan imageSpan = new ImageSpan(drawable);
            SpannableString spannableString = new SpannableString("");
            spannableString.setSpan(imageSpan,0,spannableString.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

            return tabstext[position];
        }
    }


}
