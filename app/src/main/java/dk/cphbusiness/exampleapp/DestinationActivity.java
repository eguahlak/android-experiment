package dk.cphbusiness.exampleapp;

import android.database.MatrixCursor;
import android.support.v4.widget.SimpleCursorAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class DestinationActivity extends AppCompatActivity {
    private MatrixCursor matrix;
    private static String[] names = new String[]{ "_id", "TEXT", "DESC"};

    private void addRow(String... values) {
        matrix.addRow(values);
        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destination);
        matrix = new MatrixCursor(names);
        addRow("1", "Pølse", "Fra kvickly");
        addRow("2", "Kødpålæg", "Fra slageteren");
        addRow("3", "Skinke", "Netto");
        startManagingCursor(matrix);
        ListView list = (ListView)findViewById(R.id.listView);
        int[] ids = new int[] { R.id.itemName, R.id.itemDescription };
        SimpleCursorAdapter adapter =
                new SimpleCursorAdapter(this, R.layout.layout_item, matrix, names, ids);
        list.setAdapter(adapter);

    }
}
