package dk.cphbusiness.exampleapp;

import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;
import android.widget.TextView;
import android.widget.Button;

/**
 * Created by AKA on 07/12/15.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<Main> {
    private Main main;
    private TextView helloText;
    private Button goButton;

    public MainActivityTest() {
        super(Main.class);
        }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        main = getActivity();
/*
        Intent launchIntent = new Intent(
            getInstrumentation().getTargetContext(),
            Main.class
            );
        startActivity
*/
        helloText = (TextView)main.findViewById(R.id.helloText);
        goButton = (Button)main.findViewById(R.id.goButton);
        }

    public void testPreconditions() {
        assertNotNull(main);
        assertNotNull(helloText);
        }

    public void testHelloTextLabel() {
        assertEquals("Hello there", helloText.getText().toString());
        }

    public void testGoButtonLabel() {
        String label = main.getString(R.string.goButtonText);
        Log.d("TST", label);
        assertEquals(label, goButton.getText());
        }

/*    public void testClickGoButton() {
        goButton.performClick();
        final Intent launchIntent = getStartedActivityIntent();
        assertNotNull("Intent was null", launchIntent);
        assertTrue(isFinishCalled());
        }*/

    }
