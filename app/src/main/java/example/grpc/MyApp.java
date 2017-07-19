package example.grpc;

import android.app.Application;
import android.os.StrictMode;
import com.flurry.android.FlurryAgent;

public class MyApp extends Application {

  @Override
  public void onCreate() {
    super.onCreate();
    new FlurryAgent.Builder()
        .withLogEnabled(true)
        .build(this, ApiKeys.FLURRY_API_KEY);
    StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
    StrictMode.setVmPolicy(builder.build());
  }
}
