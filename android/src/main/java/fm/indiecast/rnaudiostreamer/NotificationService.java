package fm.indiecast.rnaudiostreamer;
import android.content.Intent;
import javax.annotation.Nullable;
import com.facebook.react.HeadlessJsTaskService;
import com.facebook.react.jstasks.HeadlessJsTaskEventListener;
import com.facebook.react.jstasks.HeadlessJsTaskConfig;
import com.facebook.react.jstasks.HeadlessJsTaskContext;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.ReactApplicationContext;

public class NotificationService extends HeadlessJsTaskService {

    private static final String TASK_KEY = "playerTask";

    @Override
    protected @Nullable HeadlessJsTaskConfig getTaskConfig(Intent intent) {
        WritableMap params = Arguments.createMap();
        String action = intent.getAction();
        params.putString("action", action);
        return new HeadlessJsTaskConfig(
            TASK_KEY,
            params,
            0,
            true
        );
    }

    @Override
    public void onHeadlessJsTaskFinish(int taskId) { }

}
