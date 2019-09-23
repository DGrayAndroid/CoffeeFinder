package dalton.gray.coffeefinder;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] coffeeShops = {"Starbucks", "Dunkin' Donuts", "Mountaineer Coffee", "Oasis Coffee Spot"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.coffee, coffeeShops));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position) {
            case 0:
                // Starbucks
                startActivity(new Intent(MainActivity.this, Starbucks.class));
                break;
            case 1:
                // Dunkin'
                startActivity(new Intent(MainActivity.this, DunkinDonuts.class));
                break;
            case 2:
                // Mountaineer
                startActivity(new Intent(MainActivity.this, Mountaineer.class));
                break;
            case 3:
                // Oasis
                startActivity(new Intent(MainActivity.this, Oasis.class));
                break;
        }
    }
}
