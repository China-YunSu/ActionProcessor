package man.kuke.action.core;

public interface IActionProcess {
    public Object dealRequst(String action, String paramter) throws Exception;
    public void dealResponse(String action,String paramter) throws Exception;
}
