package man.kuke.action.core;

import java.util.HashMap;
import java.util.Map;

public abstract class ActionBeanFactory {
    protected static Map<String, BeanDefination> actionPool;

    static {
        actionPool = new HashMap<>();
    }

    public static void setObject(String action, Object object) {
        actionPool.get(action).setObject(object);
    }

    public static BeanDefination getAction(String action) {
        return actionPool.get(action);
    }

    public abstract void scannActionMapping(String Path);
}
