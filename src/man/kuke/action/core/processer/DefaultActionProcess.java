package man.kuke.action.core.processer;


import com.mec.util.ArgumentMaker;
import man.kuke.action.core.ActionBeanFactory;
import man.kuke.action.core.BeanDefination;
import man.kuke.action.core.IActionProcess;
import man.kuke.action.core.factory.annotation.NoSuchActionException;

import java.lang.reflect.Method;

public class DefaultActionProcess implements IActionProcess {
    @Override
    public Object dealRequst(String action, String paramter) throws Exception {
        BeanDefination abd = ActionBeanFactory.getAction(action);
        if (abd == null) {
            throw new NoSuchActionException("不找不到 " + action );
        }
        Method method = abd.getMethod();
        Object object = abd.getObject();
        Object[] values = abd.getValues(method.getParameters(),paramter);
        return method.invoke(object, values);
    }

    @Override
    public void dealResponse(String action, String paramter) throws Exception {
        BeanDefination abd = ActionBeanFactory.getAction(action);
        if (abd == null) {
            throw new NoSuchActionException("不找不到 " + action );
        }
        Method method = abd.getMethod();
        Object object = abd.getObject();
        Object value = ArgumentMaker.fromJson(paramter,method.getParameters()[0].getParameterizedType());
        method.invoke(abd.getObject(),value);
    }
}
