package gauravtomar.quotesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

        private RecyclerView newsContainer; // this is the recycler view from xml
        private List<NewsTemplate> news_List = new ArrayList<>();
        private NewsAdapter news_adapter;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);



            newsContainer = findViewById(R.id.parent_container);
            newsContainer.setLayoutManager(new LinearLayoutManager(this)); //set the manager for the recycler view


            news_List.add(new NewsTemplate("-this is the goal of this tutorial, to show you how to present different content for your app in different" +
                    " layout formats using the same recycler view as a container……\n",true));
            news_List.add(new NewsTemplate("hello news with text and caption",false));
            news_List.add(new NewsTemplate("this is the goal of this tutorial, to show you how to present different content for your app in different layout " +
                    "formats using the same recycler view as a container……\n",true));

            news_List.add(new NewsTemplate("hello news with text and caption 2",false));


            news_adapter = new NewsAdapter(news_List, (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE));



            newsContainer.setAdapter(news_adapter);  // after setting the adapter's data, which is the news_list, then we set it to be the recycler view adapter

            newsContainer.setHasFixedSize(true);

        }
    }