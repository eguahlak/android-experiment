package dk.cphbusiness.exampleapp;

import android.app.Activity;
import android.content.Intent;
import android.test.ActivityUnitTestCase;
import android.widget.Button;

/**
 * Created by AKA on 07/12/15.
 */
public class MainActivityUnitTest extends ActivityUnitTestCase<Main> {
    private Button goButton;
    private Intent launchIntent;

    public MainActivityUnitTest() { super(Main.class); }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        launchIntent = new Intent(
                getInstrumentation().getTargetContext(),
                Main.class
                );
        startActivity(launchIntent, null, null);

        goButton = (Button)getActivity().findViewById(R.id.goButton);
        }

    public void testGoButtonClicked() {
        goButton.performClick();
        Intent launcedIntent = getStartedActivityIntent();
        assertNotNull(launcedIntent);
        assertTrue(isFinishCalled());
        }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        }

    }
